import javafx.scene.control.ToggleButton;
import jdk.jfr.Enabled;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// A class that represents the buttons that go on the board
public class buttons extends JToggleButton implements ActionListener {

    buttons(){
        addActionListener(this);
    }

    // When the user clicks the button disable it
    public void actionPerformed(ActionEvent event){
        setEnabled(false);
    }
}
