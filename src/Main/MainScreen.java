package Main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class MainScreen {
	private JFrame frame;
	private MainAction mainAction;
	
	public MainScreen() {
		frame = new JFrame();
		Initialize();
	}
	
	//Main Frame Å©±â
	private void frameInit() {
		frame.setTitle("Drim Olympic");
		frame.setBounds(100, 100, 1280, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}

	private void Initialize() {
		frameInit();
		mainAction = new MainAction(frame);
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
