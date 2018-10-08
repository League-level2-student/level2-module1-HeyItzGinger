package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
	}

	JButton button1 = new JButton("add name");
	JButton button2 = new JButton("view names");
	ArrayList<String> list = new ArrayList<String>();

	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	public GuestBook() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
	}

	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button1 == e.getSource()) {
			list.add(JOptionPane.showInputDialog("Please enter a name."));
		}
		if (button2 == e.getSource()) {
			for (int i = 0; i < list.size(); i++) {

				JOptionPane.showMessageDialog(null, "");
			}
		}
	}

}
