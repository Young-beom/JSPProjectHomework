package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame {
	private JFrame frame;
	private MainAction mainAction;
	
	public MainFrame() {
		frame = new JFrame();
		Initialize();
	}
	
	//Main Frame 크기
	private void frameInit() {
		frame.setTitle("Drim Olympic");
		frame.setBounds(100, 100, 1280, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		// 메인 Title 
		JLabel tilteLabel = new JLabel("Drim Olympic");
		tilteLabel.setBounds(0, 50, 1280, 60);
		
		// Font
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 35));
		
		// Color
		tilteLabel.setForeground(Color.white);
		tilteLabel.setBackground(new Color(51, 63, 80));
		
		tilteLabel.setOpaque(true);
		
		//Position
		tilteLabel.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add(tilteLabel);
	}

	private void Initialize() {
		frameInit();
		mainAction = new MainAction(frame);
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
