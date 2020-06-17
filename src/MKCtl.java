import java.awt.*;

class MKLayout extends Frame{
	
	Button btn[]= new Button[100];
	FlowLayout f= new FlowLayout();
	
	public MKLayout(String args) {
		super(args);

		MenuBar mb = new MenuBar();
		Menu mn = new Menu("�޴�");
		MenuItem new_game = new MenuItem("�� ����");
		MenuItem save_game = new MenuItem("����");
		MenuItem load_game = new MenuItem("�ҷ�����");
		MenuItem set_level = new MenuItem("���� ����");
		mn.add(new_game);
		mn.add(save_game);
		mn.add(load_game);
		mn.add(set_level);

		Panel p = new Panel();
		setLayout(new GridLayout(9,9));
		
		for(int i=1;i<=81;i++) {
			btn[i] = new Button(i+"");
			add(btn[i]);
		}
		setSize(400,400);
		setVisible(true);
		
		
	}
}
public class MKCtl {

	public static void main(String[] args) {
		new MKLayout("MineKeeper");
		System.out.println(" ");
	}

}
