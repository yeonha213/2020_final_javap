import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.*;

public class FinalProject extends JFrame {
	FinalProject()
	{
		setTitle("지뢰찾기");
		JPanel p = new JPanel(new GridLayout(10,20));
		JButton [] b = new JButton[100];
		for(int i=0;i<100;i++)
		{
			JButton b1 = new JButton("");
			b[i] = b1;
			p.add(b[i]);
			b[i].addActionListener(e-> {
				Color color = new Color(0,0,255);
				b1.setBackground(color);
			});
		}
		makemenu();
		add(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
		setVisible(true);
	}
	
	void makemenu()
	{
		JMenuBar mb = new JMenuBar();
		JMenu gameMenu = new JMenu("게임");
		JMenuItem game = new JMenuItem("새게임");
		game.addActionListener(new GameActionListener());
		gameMenu.add(game);
		JMenuItem exit = new JMenuItem("종료");
		exit.addActionListener(new ExitActionListener());
		gameMenu.add(exit);
//		gameMenu.add(new JMenuItem("종료"));
//		gameMenu.add(new JMenuItem("레벨설정"));
		
		JMenu fileMenu = new JMenu("파일");
		JMenuItem save = new JMenuItem("저장");
		save.addActionListener(new SaveActionListener());
		fileMenu.add(save);
		JMenuItem bring = new JMenuItem("불러오기");
		bring.addActionListener(new BringActionListener());
		fileMenu.add(bring);
		
		JMenu helpMenu = new JMenu("레벨설정");
		JMenuItem easy = new JMenuItem("초급");
		bring.addActionListener(new EasyActionListener());
		fileMenu.add(bring);
		JMenuItem normal = new JMenuItem("중급");
		bring.addActionListener(new NormalActionListener());
		fileMenu.add(bring);
		JMenuItem hard = new JMenuItem("고급");
		bring.addActionListener(new HardActionListener());
		fileMenu.add(bring);
		
		mb.add(gameMenu);
		mb.add(fileMenu);
		mb.add(helpMenu);
		
		this.setJMenuBar(mb);
	}
	
	//새게임
	class GameActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("game");
		}
	}
	//종료
	class ExitActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("exit");
		}
	}
	//저장
	class SaveActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("save");
		}
	}
	//불러오기
	class BringActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("bring");
		}
	}
	//초급
	class EasyActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("easy");
		}
	}
	//중급
	class NormalActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("normal");
		}
	}
	//고급
	class HardActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("hard");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalProject();
	}

}
