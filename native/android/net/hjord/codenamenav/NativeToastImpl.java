package net.hjord.codenamenav;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class NativeToastImpl {
    public void show() {

        android.app.Activity ctx = com.codename1.impl.android.AndroidNativeUtil.getActivity();

        Toast.makeText(ctx,
                "Button is clicked", Toast.LENGTH_LONG).show();


    }

    public android.view.View createNativeButton(String param) {
        android.widget.Button b = new android.widget.Button(com.codename1.impl.android.AndroidNativeUtil.getActivity());
        b.setText(param);
        return b;
    }

    public boolean isSupported() {
        return true;
    }

}
