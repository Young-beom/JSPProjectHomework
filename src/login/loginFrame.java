package login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class loginFrame extends JPanel {
	private JFrame frame;
	private loginPanel loginPanel;

	public loginFrame(JFrame frame) {
		super();
		FrameInit(frame);
		PanelInit();
	}
	private void FrameInit(JFrame frame) {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);

		frame.getContentPane().add(this);
		this.setLayout(null);
	}

	private void PanelInit() {

		loginPanel = new loginPanel(frame);

		loginPanel.setBounds(80, 200, 1100, 600);
		loginPanel.setBackground(new Color(242, 242, 242));
		loginPanel.setBorder(null); 

		this.add(loginPanel);
	}
}
