// Generated code from Butter Knife. Do not modify!
package com.subash.rentacar.CarManagement;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.subash.rentacar.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyBookings$BookingHolder_ViewBinding implements Unbinder {
  private MyBookings.BookingHolder target;

  @UiThread
  public MyBookings$BookingHolder_ViewBinding(MyBookings.BookingHolder target, View source) {
    this.target = target;

    target.carBookingTitle = Utils.findRequiredViewAsType(source, R.id.bookingCarTitle, "field 'carBookingTitle'", TextView.class);
    target.registrationNo = Utils.findRequiredViewAsType(source, R.id.bookingRegistrationNo, "field 'registrationNo'", TextView.class);
    target.uploadedBy = Utils.findRequiredViewAsType(source, R.id.bookingUploadedBy, "field 'uploadedBy'", TextView.class);
    target.from = Utils.findRequiredViewAsType(source, R.id.from, "field 'from'", TextView.class);
    target.to = Utils.findRequiredViewAsType(source, R.id.to, "field 'to'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyBookings.BookingHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.carBookingTitle = null;
    target.registrationNo = null;
    target.uploadedBy = null;
    target.from = null;
    target.to = null;
  }
}
