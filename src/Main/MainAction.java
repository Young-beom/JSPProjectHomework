package Main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainAction extends JPanel {
	private JButton btnNewButton;
	private JButton btnGraphType;
	private JComboBox main_month, main_date, AreaBox;

	public MainAction(JFrame frame) {
		super();
		panelInit(frame);
	}

	private void panelInit(JFrame frame) {
		// 메인 화면 패널
//		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);
		
		frame.getContentPane().add(this);
		this.setLayout(null);

		// 메인 화면 라벨
		JLabel tilteLabel = new JLabel("Drim Olympic");
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 35));
		
		tilteLabel.setForeground(Color.white);
		tilteLabel.setBackground(new Color(51, 63, 80));
		
		tilteLabel.setOpaque(true);
		
		tilteLabel.setHorizontalAlignment(JLabel.CENTER);
		tilteLabel.setBounds(0, 50, 1280, 60);
		this.add(tilteLabel);

	}
}
