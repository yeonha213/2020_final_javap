import java.awt.*;

class MKLayout extends Frame{
	
	Button btn[]= new Button[100];
	FlowLayout f= new FlowLayout();
	
	public MKLayout(String args) {
		super(args);

		MenuBar mb = new MenuBar();
		Menu mn = new Menu("메뉴");
		MenuItem new_game = new MenuItem("새 게임");
		MenuItem save_game = new MenuItem("저장");
		MenuItem load_game = new MenuItem("불러오기");
		MenuItem set_level = new MenuItem("레벨 설정");
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
