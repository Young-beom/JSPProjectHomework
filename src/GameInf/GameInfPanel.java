package GameInf;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameInfPanel extends JPanel {

	public GameInfPanel(JFrame frame) {
		super();
		PanelInit(frame);
		OutBox();
	}

	private void PanelInit(JFrame frame) {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);
		this.setLayout(null);

		// Medal Title
		JLabel tilteLabel = new JLabel("∏ﬁ¥ﬁ º¯¿ß");
		tilteLabel.setBounds(45, 35, 450, 40);

		tilteLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 25)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(Color.black);
		tilteLabel.setOpaque(true);

		tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel);
		
		// Medal Title
		JLabel tilteLabel1 = new JLabel("DropBox");
		tilteLabel1.setBounds(550, 35, 500, 40); 

		tilteLabel1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 25)); // Font

		tilteLabel1.setForeground(Color.white); // Color
		tilteLabel1.setBackground(Color.black);
		tilteLabel1.setOpaque(true);

		tilteLabel1.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel1);
		
		// Medal Title
		JLabel tilteLabel2 = new JLabel("«œ¿Ã∂Û¿Ã∆Æ ∞Àªˆ√¢");
		tilteLabel2.setBounds(550, 315, 500, 40); 

		tilteLabel2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 25)); // Font

		tilteLabel2.setForeground(Color.white); // Color
		tilteLabel2.setBackground(Color.black);
		tilteLabel2.setOpaque(true);

		tilteLabel2.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel2);
	}

	private void OutBox() {
		// Medal Picture
		JLabel MedalImage = new JLabel("ªÁ¡¯ øπ¡§1");
		MedalImage.setBounds(45, 95, 450, 480);

		MedalImage.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 35)); // Font

		MedalImage.setForeground(Color.black); // Color
		MedalImage.setBackground(new Color(166, 166, 166));
		MedalImage.setOpaque(true);

		MedalImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(MedalImage);
		
		// Medal Picture
		JLabel planImage = new JLabel("ªÁ¡¯ øπ¡§2");
		planImage.setBounds(550, 95, 500, 200);

		planImage.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 35)); // Font

		planImage.setForeground(Color.black); // Color
		planImage.setBackground(new Color(166, 166, 166));
		planImage.setOpaque(true);

		planImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(planImage);

		
		// Medal Picture
		JLabel newsImage = new JLabel("ªÁ¡¯ øπ¡§3");
		newsImage.setBounds(550, 375, 500, 200);

		newsImage.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 35)); // Font

		newsImage.setForeground(Color.black); // Color
		newsImage.setBackground(new Color(166, 166, 166));
		newsImage.setOpaque(true);

		newsImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(newsImage);

	}
}
