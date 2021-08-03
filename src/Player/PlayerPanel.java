package Player;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlayerPanel extends JPanel {

	public PlayerPanel(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		// 메인 화면 패널
		this.setBackground(Color.yellow);
		this.setBounds(0, 0, 1280, 960);
		
		frame.getContentPane().add(this);
		
		this.setLayout(null);

	}
}
