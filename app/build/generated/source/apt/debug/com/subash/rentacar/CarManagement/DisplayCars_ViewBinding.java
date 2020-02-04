// Generated code from Butter Knife. Do not modify!
package com.subash.rentacar.CarManagement;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.subash.rentacar.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DisplayCars_ViewBinding implements Unbinder {
  private DisplayCars target;

  @UiThread
  public DisplayCars_ViewBinding(DisplayCars target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DisplayCars_ViewBinding(DisplayCars target, View source) {
    this.target = target;

    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progress_bar, "field 'progressBar'", ProgressBar.class);
    target.friendList = Utils.findRequiredViewAsType(source, R.id.car_container, "field 'friendList'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DisplayCars target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressBar = null;
    target.friendList = null;
  }
}
