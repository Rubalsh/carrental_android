// Generated code from Butter Knife. Do not modify!
package com.subash.rentacar;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LandingScreen_ViewBinding implements Unbinder {
  private LandingScreen target;

  @UiThread
  public LandingScreen_ViewBinding(LandingScreen target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LandingScreen_ViewBinding(LandingScreen target, View source) {
    this.target = target;

    target.progressBar = Utils.findRequiredViewAsType(source, R.id.AllCarProgress_bar, "field 'progressBar'", ProgressBar.class);
    target.friendList = Utils.findRequiredViewAsType(source, R.id.AllCar_container, "field 'friendList'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LandingScreen target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressBar = null;
    target.friendList = null;
  }
}
