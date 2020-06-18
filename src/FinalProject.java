import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.*;

public class FinalProject extends JFrame {
	FinalProject()
	{
		setTitle("����ã��");
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
		JMenu gameMenu = new JMenu("����");
		JMenuItem game = new JMenuItem("������");
		game.addActionListener(new GameActionListener());
		gameMenu.add(game);
		JMenuItem exit = new JMenuItem("����");
		exit.addActionListener(new ExitActionListener());
		gameMenu.add(exit);
//		gameMenu.add(new JMenuItem("����"));
//		gameMenu.add(new JMenuItem("��������"));
		
		JMenu fileMenu = new JMenu("����");
		JMenuItem save = new JMenuItem("����");
		save.addActionListener(new SaveActionListener());
		fileMenu.add(save);
		JMenuItem bring = new JMenuItem("�ҷ�����");
		bring.addActionListener(new BringActionListener());
		fileMenu.add(bring);
		
		JMenu helpMenu = new JMenu("��������");
		JMenuItem easy = new JMenuItem("�ʱ�");
		bring.addActionListener(new EasyActionListener());
		fileMenu.add(bring);
		JMenuItem normal = new JMenuItem("�߱�");
		bring.addActionListener(new NormalActionListener());
		fileMenu.add(bring);
		JMenuItem hard = new JMenuItem("���");
		bring.addActionListener(new HardActionListener());
		fileMenu.add(bring);
		
		mb.add(gameMenu);
		mb.add(fileMenu);
		mb.add(helpMenu);
		
		this.setJMenuBar(mb);
	}
	
	//������
	class GameActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("game");
		}
	}
	//����
	class ExitActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("exit");
		}
	}
	//����
	class SaveActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("save");
		}
	}
	//�ҷ�����
	class BringActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("bring");
		}
	}
	//�ʱ�
	class EasyActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("easy");
		}
	}
	//�߱�
	class NormalActionListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			System.out.println("normal");
		}
	}
	//���
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
