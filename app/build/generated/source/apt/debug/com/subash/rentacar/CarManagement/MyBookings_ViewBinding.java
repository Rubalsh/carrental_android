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

public class MyBookings_ViewBinding implements Unbinder {
  private MyBookings target;

  @UiThread
  public MyBookings_ViewBinding(MyBookings target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyBookings_ViewBinding(MyBookings target, View source) {
    this.target = target;

    target.progressBar = Utils.findRequiredViewAsType(source, R.id.bookingProgress_bar, "field 'progressBar'", ProgressBar.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.booking_container, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyBookings target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressBar = null;
    target.recyclerView = null;
  }
}
