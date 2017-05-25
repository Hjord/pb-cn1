package net.hjord.codenamenav;

import com.codename1.system.NativeInterface;
import com.codename1.ui.PeerComponent;

/**
 * Created by Hjord on 19/04/2017.
 */
public interface NativeToast extends NativeInterface{

    void show();
    PeerComponent createNativeButton(String title);
}
