package com.rubal.rentacar.CarManagment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.rubal.rentacar.R;
import com.rubal.rentacar.MainActivity;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CarDetail extends AppCompatActivity {

    private ImageView carImageView;
    private TextView carTitle, carDescription, carRegNo;
    private String Title, Image, Desc, RegNo, UploadedBy;
    private Button addCarDetails;
    private String startDate, endDate;
    private FirebaseFirestore db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);
        initViews();
        getDataFromBundle();
        setDataOnViews();
    }

    void initViews() {
        carImageView = findViewById(R.id.headerImage);
        carTitle = findViewById(R.id.carTitle);
        carDescription = findViewById(R.id.carDesc);
        addCarDetails = findViewById(R.id.btnAddCar);
        carRegNo = findViewById(R.id.carReg);


    }

    void getDataFromBundle() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Title = bundle.getString("Title");
            Image = bundle.getString("Image");
            Desc = bundle.getString("Brand");
            RegNo = bundle.getString("RegistrationNo");
            UploadedBy = bundle.getString("UploadedBy");
        }

    }

    void setDataOnViews() {
        Glide.with(getApplicationContext())
                .load(Image).placeholder(R.drawable.carimage).into(carImageView);
        carTitle.setText(Title);
        carDescription.setText(Desc);
        carRegNo.setText(RegNo);
    }

    public void setDate(View view) {
        openDialog(getApplicationContext());
    }

    private void openDialog(Context applicationContext) {
        String start;

        LayoutInflater inflater = getLayoutInflater();
        View alertLayout = inflater.inflate(R.layout.layout_custom_dialog, null);
        final EditText etStartDate = alertLayout.findViewById(R.id.et_startDate);
        final EditText etEndDate = alertLayout.findViewById(R.id.etEndDate);


        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Set Date For Reservation (dd/mm/yyyy)");
        // this is set the view from XML inside AlertDialog
        alert.setView(alertLayout);
        // disallow cancel of AlertDialog on click of back button and outside touch
        alert.setCancelable(false);
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getBaseContext(), "Booking Canceled", Toast.LENGTH_SHORT).show();
            }
        });

        alert.setPositiveButton("Confirm ", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String start = etStartDate.getText().toString();
                String end = etEndDate.getText().toString();
                addCarBookingDetails(start, end);
                Toast.makeText(getBaseContext(), "Username: " + start + " Email: " + end, Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog dialog = alert.create();
        dialog.show();
    }


    public void addCarBookingDetails(String start, String end) {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        db = FirebaseFirestore.getInstance();
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Booking Car...");
        progressDialog.show();
        Map<String, Object> newBooking = new HashMap<>();
        newBooking.put("CarTitle", Title);
        newBooking.put("RegistrationNo", RegNo);
        newBooking.put("UploadedBy", UploadedBy);
        newBooking.put("StartDate", start);
        newBooking.put("EndDate", end);

        if (user != null) {
            db.collection("Bookings").
                    document(user.getUid()).collection("BookedCars").add(newBooking).addOnSuccessListener(aVoid -> {
                progressDialog.dismiss();
                Toast.makeText(CarDetail.this, "Car Added Successfully", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(e -> {
                progressDialog.dismiss();
                Toast.makeText(CarDetail.this, "Error on Adding Car" + e.toString(), Toast.LENGTH_SHORT).show();

            });
        }


    }


}
