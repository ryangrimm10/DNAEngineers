import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Screen3 extends JFrame{
	Button submit;
	
	public Screen3(){
		super("Palindrome Sequencer");
		int i = 10;
		int j = 10;
		JPanel[][] grid = new JPanel[i][j];
		setLayout(new GridLayout(i, j));
		
		for (int m = 0; m < i; m++) {
			for (int n = 0; n < j; n++) {
				grid[m][n] = new JPanel();
				add(grid[m][n]);
			}
		}
		
		submit = new Button("Submit");
		grid[0][0].add(submit);
		
	}
}
