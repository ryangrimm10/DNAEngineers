import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextPane;

public class StrandDisplay extends JFrame {

    private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StrandDisplay frame = new StrandDisplay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StrandDisplay() {
		setTitle("Palindrome Display");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnLoad = new JMenu("Load");
		mnFile.add(mnLoad);
		
		JMenu mnOption = new JMenu("Option");
		menuBar.add(mnOption);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_1 = new JButton("Strand 0");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Strand 1");
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Strand 2");
		panel.add(btnNewButton_2);
		
		JButton btnStrand = new JButton("Strand 3");
		panel.add(btnStrand);
		
		JButton btnNewButton_3 = new JButton("Stand 4");
		panel.add(btnNewButton_3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JTextPane textPane_2 = new JTextPane();
		tabbedPane.addTab("New tab", null, textPane_2, null);
		
		JTextPane textPane = new JTextPane();
		tabbedPane.addTab("New tab", null, textPane, null);
		
		JTextPane textPane_1 = new JTextPane();
		tabbedPane.addTab("New tab", null, textPane_1, null);
		
		JScrollBar scrollBar = new JScrollBar();
		contentPane.add(scrollBar, BorderLayout.EAST);
	}

}

