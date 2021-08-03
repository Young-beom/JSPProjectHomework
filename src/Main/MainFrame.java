package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
		
		tilteLabel.setFont(new Font("Arial", Font.BOLD, 35));  // Font
		
		tilteLabel.setForeground(Color.white);  // Color
		tilteLabel.setBackground(new Color(51, 63, 80));
		 
		tilteLabel.setOpaque(true);
		
		
		tilteLabel.setHorizontalAlignment(JLabel.CENTER); //Position
		
		frame.add(tilteLabel);
		
		
		// Footer
		JLabel underLabel = new JLabel("㈜ 드림시스  ⓒ 명지대 인턴 프로젝트");
		underLabel.setFont(new Font("맑은고딕",Font.PLAIN,13));
		
		underLabel.setForeground(Color.black);
		underLabel.setBackground(new Color(204,204,204));
		
		underLabel.setOpaque(true);
		
		underLabel.setHorizontalAlignment(JLabel.CENTER);
		underLabel.setBounds(0, 803, 1280, 40);
		frame.add(underLabel);
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
