// 메인페이지 - 하연  (MainAction 사용하실때 주석부분 지우지 말아주세요.)
package Main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;

public class MainAction extends JPanel {


	public MainAction(JFrame frame) {
		super();
		panelInit(frame);
		
	}


	private void panelInit(JFrame frame) {
		// 메인 화면 패널
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(0, 0, 1280, 960);
		
		frame.getContentPane().add(this);
		
		this.setLayout(null);
		
		JLabel tilteLabel = new JLabel("");

		tilteLabel.setFont(new Font("고딕", Font.BOLD, 20)); // Font

		tilteLabel.setForeground(Color.white); // Color
		tilteLabel.setBackground(new Color(51, 63, 80));
		tilteLabel.setPreferredSize(new Dimension(200,80)); //width가 안먹는듯
		tilteLabel.setOpaque(true);


		
		//mainPanel.add(tilteLabel);
		this.add(tilteLabel);
			
		
		// JPanel 부분 시작  -> 이부분 나중에 쓸 수 도 있으니 삭제하지 말아주세용가링.
	    String [] fruits = {"apple", "banana", "mango"};
	    
	    
	   
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(80, 380, 1100, 420);
        mainPanel.setBackground(new Color(242, 242, 242));
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
      
        this.add(mainPanel);
        mainPanel.setVisible(true);
        mainPanel.setBorder(null); // 사실 위에 setBorder을 없애면 이 코드 안써줘도됨.
        //mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        // JPanel 부분 종료
        
        Box searchBox = Box.createHorizontalBox();
        Box tableBox = Box.createHorizontalBox();
        Box underBox = Box.createVerticalBox();
        
		
		// 종목 입력
		String eventList[] = { "축구", "야구", "배구" };

		JComboBox eventBox = new JComboBox<Object>(eventList);
		eventBox.setBounds(515, 170, 235, 40);

		searchBox.add(eventBox);
		// 테이블 가로(좌측)
		JButton writebtn1 = new JButton("1");
		writebtn1.setFont(new Font("맑은고딕", Font.BOLD, 13));
		writebtn1.setBackground(new Color(217, 217, 217));
		writebtn1.setBounds(500,500, 75, 23);
		writebtn1.setBorderPainted(false);
		writebtn1.setFocusPainted(false);
		tableBox.add(writebtn1);
        // Table
        String header[]={"종목", "게시물 내용", "순위/메달여부"};
        String contents[][]={
                {"이정현", "양궁선수드디어금메달", "1위/금메달"},
                {"김영호", "박태환 선수를 뛰어넘는 ", "2위/은메달"},
                {"전수용", "3위의 아쉬움을 전해요잉", "3위/동메달"},
                {"김진희", "쓸말없다", "없음"},
                {"신정섭", "곧 점심시간", "없음"},
                {"김승현", "맥도날드 갈거야", "없음"},
                {"김영석", "1위는 1955", "1위/금메달"},
                {"이정석", "2위는 불고기버거", "2위/은메달"},
                {"이승근", "내 맘속 맥도날드 1위 버거킹 2위", "2위/은메달"},
        };

        JTable table = new JTable(contents, header);
        //table.setLocation(0,0);
        
        JScrollPane jscp1 = new JScrollPane(table); //이런식으로 생성시에 테이블을 넘겨주어야 정상적으로 볼 수 있다.
                                                    //jscp1.add(table); 과 같이 실행하면, 정상적으로 출력되지 않음.
        jscp1.setLocation(180,380);
        jscp1.setSize(300,360);
        jscp1.setPreferredSize(new Dimension(1000,140));
        //mainPanel.add(jscp1);  // 이 부분을 해줘야 Panel위에 표를 추가할 수 있음.
        tableBox.add(jscp1);
        
        // 테이블 가로(우측)
        JButton writebtn2 = new JButton("2");
		writebtn2.setFont(new Font("맑은고딕", Font.BOLD, 13));
		writebtn2.setBackground(new Color(217, 217, 217));
		writebtn2.setBounds(500,500, 75, 23);
		writebtn2.setBorderPainted(false);
		writebtn2.setFocusPainted(false);
		tableBox.add(writebtn2);
        
		// 글쓰기 위쪽 공백
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("맑은고딕", Font.BOLD, 1));
		btn3.setBackground(new Color(217, 27, 217));
		btn3.setBounds(500,500, 75, 23);
		btn3.setBorderPainted(false);
		btn3.setFocusPainted(false);
		//mainPanel.add(writebtn);
		underBox.add(btn3);
		
        JButton writebtn = new JButton("글쓰기");
		writebtn.setFont(new Font("맑은고딕", Font.BOLD, 13));
		writebtn.setBackground(new Color(217, 217, 217));
		writebtn.setBounds(500,500, 75, 23);
		writebtn.setBorderPainted(false);
		writebtn.setFocusPainted(false);
		//mainPanel.add(writebtn);
		underBox.add(writebtn);
		
		// 글쓰기 아래쪽 공백
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("맑은고딕", Font.BOLD, 10));
		btn4.setBackground(new Color(217, 27, 217));
		btn4.setBounds(500,500, 75, 23);
		btn4.setBorderPainted(false);
		btn4.setFocusPainted(false);
		//mainPanel.add(writebtn);
		underBox.add(btn4);
		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(searchBox);
		mainPanel.add(tableBox);
		mainPanel.add(underBox);
		
        
        // Table
	}
}
