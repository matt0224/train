package tw.test;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class newgame extends JFrame{
	private JPanel gameZone, menuBar, gameState;
	private JButton[] button = new JButton[9];
	private Buttons[] bt = new Buttons[9];
	private JButton start;
	private JTextPane turns;
	private boolean playerTurn;
	private int moves; 
	
	public newgame() {
		super("XO Game");
		
		setLayout(new BorderLayout());
		
		//�C���� �񤫦r9�c��
		gameZone = new JPanel();
		gameZone.setLayout(new GridLayout(3, 3));
		
		//�]�m���s  
		//�]�A�������=>JButton �Ψӫ���     java����=>Buttons �ΨӬ�����T
		for(int i=0;i<button.length; i++){
			button[i] = new JButton();
			button[i].setBackground(new Color(209, 233, 255));
			gameZone.add(button[i]);
			bt[i] = new Buttons(i); 	
		}
		
		
		//�]�mJButton��ť�� ���U��|������T
		for(int i=0;i<button.length; i++){
			int n=i;
			button[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					pressed(n);
					bt[n].isPressed = true;
				}
			});
		}
		
		//�]�m�}�l�\��C  ���U��~�|�}�l�C��/���ͷs��
		menuBar = new JPanel(new FlowLayout());
		start = new JButton("Start");
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startGame();
			}
		});
		
		menuBar.add(start);gameState = new JPanel();turns = new JTextPane();gameState.add(turns);
		
		add(gameState, BorderLayout.SOUTH);
		add(menuBar, BorderLayout.NORTH);
		add(gameZone, BorderLayout.CENTER);
		
		for(int i=0 ; i< button.length; i++){
			bt[i].isPressed = true;
			
		}
		
		setSize(450, 500);
		setVisible(true);
		setDefaultCloseOperation(3);
	}
	
	//Buttons���O �������U �H�γQ�֫�����ݩ�
	private class Buttons {
		private int check;
		private boolean isPressed = false;
	
		public Buttons(int number){
			 check = 0;
		}	
	}
	
	//�}�s��  �|�N�����T��l��
	protected void startGame() {
		moves = 0;
		for(int i=0 ; i< button.length; i++){
			bt[i].isPressed = false;
			bt[i].check = 0;
			button[i].setText("");
			button[i].setBackground(new Color(209, 233, 255));
		}
		playerTurn = true;
		JOptionPane.showMessageDialog(null, "Game Start!");
		turns.setText("\"O\"'s turn");
	}
	
	//�]�mpressed��k  ��������Ϋ��
	protected void pressed(int n) {
		if(!bt[n].isPressed){
			button[n].setFont(new Font(null, Font.CENTER_BASELINE, 50));
			button[n].setBackground(new Color(255, 129, 66));
			bt[n].isPressed = true;
			moves++;
			System.out.println(moves);
			if(playerTurn){
				button[n].setText("��");
				bt[n].check = 1;
				turns.setText("\"X\"'s turn");
				//check();
				playerTurn = false;
			}else{
				button[n].setText("X");
				bt[n].check = 2;
				turns.setText("\"O\"'s turn");
				//check();
				playerTurn = true;
			}
		}
	}
	
	//�ˬd�O�_���H���  �@�ˤ�����Ϋ��   ���G����4��  ���� � ���� �k��   ����U�]3���j��
//	protected void check() {
//		if(playerTurn){
//			for(int i=0; i<3; i++){
//				if(bt[i*3].check==1 && bt[i*3+1].check==1 && bt[i*3].check==bt[i*3+2].check){
//					isOver(1);
//					//System.out.println("1s");
//					return;
//				}else if(bt[i].check==1 && bt[i+3].check==1 && bt[i].check==bt[i+6].check){
//					isOver(1);
//					//System.out.println("2s");
//					return;
//				}	
//			}
//			if(bt[0].check == 1 && bt[4].check ==1 && bt[0].check==bt[8].check){
//				isOver(1);
//				//System.out.println("3s");
//				return;
//			}else if(bt[2].check== 1 && bt[4].check ==1 && bt[2].check==bt[6].check){
//				isOver(1);
//				//System.out.println("4s");
//				return;
//			}
//		}else{
//			for(int i=0; i<3; i++){
//				if(bt[i*3].check==2 && bt[i*3+1].check==2 && bt[i*3].check==bt[i*3+2].check){
//					isOver(2);
//					//System.out.println("1a");
//					return;
//				}else if(bt[i].check==2 && bt[i+3].check==2 && bt[i].check==bt[i+6].check){
//					isOver(2);
//					//System.out.println("2a");
//					return;
//				}	
//			}
//			if(bt[0].check == 2 && bt[4].check ==2 && bt[0].check==bt[8].check){
//				isOver(2);
//				//System.out.println("3a");
//				return;
//		
//			}else if(bt[2].check== 2 && bt[4].check ==2 && bt[2].check==bt[6].check){
//				isOver(2);
//				//System.out.println("4a");
//				return;
//			}
//		}
//		if(moves == 9)isOver(3);
//	}
	
	//gameover �P�_Ĺ�a ��������\��
//	private void isOver(int n) {
//		for(int i=0 ; i< button.length; i++){
//			bt[i].isPressed = true;
//		}
//		switch(n){
//			//�^��1 OĹ
//			case 1:
//				turns.setText("\"O\" win");
//				JOptionPane.showMessageDialog(null, "Winner is  O !");
//				break;
//			//�^��2 XĹ	
//			case 2:	
//				turns.setText("\"X\" win");
//				JOptionPane.showMessageDialog(null, "Winner is  X !");
//				break;
//			//�^��3 ����	
//			case 3:
//				turns.setText("Tied");
//				JOptionPane.showMessageDialog(null, "Tied");
//				break;
//			}	
//	}
	public static void main(String[] args) {
		new newgame();
	}
}