package login;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class loginPanel extends JPanel {

   public loginPanel(JFrame frame) {
      super();
      panelInit(frame);
   }

   private void panelInit(JFrame frame) {
      // 메인 화면 패널
      this.setBackground(new Color(255, 255, 255));
      this.setBounds(0, 0, 1280, 960);
      this.setLayout(null);

      //로그인 글자
      JLabel IDtitle = new JLabel("로그인");
      IDtitle.setBounds(130, 50, 800, 35);
      IDtitle.setFont(new Font("고딕", Font.BOLD, 30)); // Font
      IDtitle.setForeground(Color.white); // Color
      IDtitle.setBackground(new Color(24, 23, 23));
      IDtitle.setOpaque(true);
      IDtitle.setHorizontalAlignment(JLabel.CENTER);
      this.add(IDtitle);

      //id 글자
      JLabel idText = new JLabel("ID");
      idText.setBounds(250, 180, 100, 40);
      idText.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      idText.setForeground(Color.black); // Color
      idText.setBackground(new Color(166, 166, 166));
      idText.setOpaque(true);
      idText.setHorizontalAlignment(JLabel.CENTER);
      this.add(idText);

      //pw 글자
      JLabel pwText = new JLabel("PW");
      pwText.setBounds(250, 250, 100, 40);
      pwText.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      pwText.setForeground(Color.black); // Color
      pwText.setBackground(new Color(166, 166, 166));
      pwText.setOpaque(true);
      pwText.setHorizontalAlignment(JLabel.CENTER);
      this.add(pwText);
      
      //id 입력
      JPasswordField inputID = new JPasswordField("10");
      inputID.setBounds(400, 180, 200, 40);
      inputID.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputID.setForeground(Color.black); // Color
      inputID.setBackground(new Color(255,255,255));
      this.add(inputID);

      //pw 입력
      JPasswordField inputPW = new JPasswordField("10");
      inputPW.setBounds(400, 250, 200, 40);
      inputPW.setFont(new Font("고딕", Font.BOLD, 20)); // Font
      inputPW.setForeground(Color.black); // Color
      inputPW.setBackground(new Color(255,255,255));
      this.add(inputPW);

      //확인 버튼
      JButton logBtn = new JButton("확인");
      logBtn.setFont(new Font("고딕", Font.BOLD, 14));
      logBtn.setBackground(new Color(217, 217, 217));
      logBtn.setBounds(500, 330, 80, 40);
      logBtn.setBorderPainted(false);
      logBtn.setFocusPainted(false);
      this.add(logBtn);

      //취소 버튼
      JButton exitBtn = new JButton("취소");
      exitBtn.setFont(new Font("고딕", Font.BOLD, 14));
      exitBtn.setBackground(new Color(217, 217, 217));
      exitBtn.setBounds(600, 330, 80, 40);
      exitBtn.setBorderPainted(false);
      exitBtn.setFocusPainted(false);
      this.add(exitBtn);
      /*
    //로그인화면 컴포넌트 끝
/*
   logBtn.addActionListener( new ActionListener() {
       public void actionPerformed(ActionEvent e) {
               String id = "Rewind";
               String pass = "1234";
                   if(id.equals(inputID.getText()) &&  pass.equals(txtPass.getText())) {
                           loginPanel.showMessageDialog( null, "you have logged in successfully" );
                   } else {
                	   loginPanel.showMessageDialog( null , " you failed to log in ");
                   }
       }
} );
*/
}
}


