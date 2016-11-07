package slowlife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WriteButton extends JButton {

    private MainPanel _m;
    
    public WriteButton(MainPanel m) {
	super("Write");
	_m = m;
	addActionListener(new WriteButtonListener());
    }

    class WriteButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {

	    String toWrite = _m.toString();
	    
	    boolean success = FileAccess.saveFile("backup.txt", toWrite);
	    
	    if (!success) {
		JOptionPane.showMessageDialog((Component) e.getSource(), "COULD NOT WRITE FILE backup.txt", "BROUGHT TO YOU BY BILL LABOON", JOptionPane.WARNING_MESSAGE);
	    }

	    
	}
    }    
    
}
