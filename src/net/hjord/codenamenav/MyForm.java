package net.hjord.codenamenav;

import com.codename1.io.Log;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.Layout;


public class MyForm extends com.codename1.ui.Form {
    public MyForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }

    public MyForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
        buildCodeUi();
    }

    public void onButton_1ActionEvent(ActionEvent ev) {
    }


    public void buildCodeUi(){
        Button b = new Button("Click Me");

        int bx = b.getAbsoluteX();
        int by = b.getAbsoluteY();
        b.addPointerPressedListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                int x = ev.getX();
                int y = ev.getY();
                Log.p("X: " + (x-bx) + " Y: " + (y-by));
            }
        });
        b.addPointerDraggedListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

            }
        });

        b.addPointerReleasedListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

            }
        });



        this.addComponent(b);

    }



//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.FlowLayout());
        setTitle("MyForm");
        setName("MyForm");
        addComponent(gui_Label_1);
        gui_Label_1.setText("This is my form");
        gui_Label_1.setName("Label_1");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
