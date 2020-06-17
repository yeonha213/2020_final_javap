import java.awt.*;

class MKLayout extends Frame{
	
	Button btn[]= new Button[100];
	FlowLayout f= new FlowLayout();
	
	public MKLayout(String args) {
		super(args);
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
	}

}
