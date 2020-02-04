// Generated code from Butter Knife. Do not modify!
package com.subash.rentacar.CarManagement;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.subash.rentacar.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DisplayCars$CarHolder_ViewBinding implements Unbinder {
  private DisplayCars.CarHolder target;

  @UiThread
  public DisplayCars$CarHolder_ViewBinding(DisplayCars.CarHolder target, View source) {
    this.target = target;

    target.carTitle = Utils.findRequiredViewAsType(source, R.id.carTitle, "field 'carTitle'", TextView.class);
    target.registrationNo = Utils.findRequiredViewAsType(source, R.id.registrationNo, "field 'registrationNo'", TextView.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.car_image, "field 'imageView'", ImageView.class);
    target.uploadedBy = Utils.findRequiredViewAsType(source, R.id.uploadedBy, "field 'uploadedBy'", TextView.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.txtPrice, "field 'textView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DisplayCars.CarHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.carTitle = null;
    target.registrationNo = null;
    target.imageView = null;
    target.uploadedBy = null;
    target.textView = null;
  }
}
