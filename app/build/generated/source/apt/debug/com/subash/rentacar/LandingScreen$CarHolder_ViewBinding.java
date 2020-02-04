// Generated code from Butter Knife. Do not modify!
package com.subash.rentacar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LandingScreen$CarHolder_ViewBinding implements Unbinder {
  private LandingScreen.CarHolder target;

  @UiThread
  public LandingScreen$CarHolder_ViewBinding(LandingScreen.CarHolder target, View source) {
    this.target = target;

    target.carTitle = Utils.findRequiredViewAsType(source, R.id.carTitle, "field 'carTitle'", TextView.class);
    target.registrationNo = Utils.findRequiredViewAsType(source, R.id.registrationNo, "field 'registrationNo'", TextView.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.car_image, "field 'imageView'", ImageView.class);
    target.uploadedBy = Utils.findRequiredViewAsType(source, R.id.uploadedBy, "field 'uploadedBy'", TextView.class);
    target.callOwner = Utils.findRequiredViewAsType(source, R.id.callOwner, "field 'callOwner'", Button.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.txtPrice, "field 'textView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LandingScreen.CarHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.carTitle = null;
    target.registrationNo = null;
    target.imageView = null;
    target.uploadedBy = null;
    target.callOwner = null;
    target.textView = null;
  }
}
