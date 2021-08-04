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
		JLabel tilteLabel = new JLabel("¸Þ´Þ ¼øÀ§");
		tilteLabel.setBounds(45, 35, 450, 40);

		tilteLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(Color.black);
		tilteLabel.setOpaque(true);

		tilteLabel.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(tilteLabel);
	}

	private void OutBox() {
		// Medal Picture
		JLabel MedalImage = new JLabel("»çÁø ¿¹Á¤");
		MedalImage.setBounds(45, 95, 450, 480);

		MedalImage.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		MedalImage.setForeground(Color.black); // Color
		MedalImage.setBackground(new Color(166, 166, 166));
		MedalImage.setOpaque(true);

		MedalImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(MedalImage);
		
		// Medal Picture
		JLabel planImage = new JLabel("»çÁø ¿¹Á¤");
		planImage.setBounds(550, 100, 500, 200);

		planImage.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		planImage.setForeground(Color.black); // Color
		planImage.setBackground(new Color(166, 166, 166));
		planImage.setOpaque(true);

		planImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(planImage);

		
		// Medal Picture
		JLabel newsImage = new JLabel("»çÁø ¿¹Á¤");
		newsImage.setBounds(550, 400, 500, 200);

		newsImage.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 35)); // Font

		newsImage.setForeground(Color.black); // Color
		newsImage.setBackground(new Color(166, 166, 166));
		newsImage.setOpaque(true);

		newsImage.setHorizontalAlignment(JLabel.CENTER); // Position

		this.add(newsImage);

	}
}
