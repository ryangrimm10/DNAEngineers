import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class MainScreen extends JFrame {

    private JPanel contentPane;
	private JTextField txtFirstStrand;
	private JTextField txtStrand;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setTitle("DNA Engineers - Palindrome Sequencer");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 454);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSae = new JMenuItem("Save");
		mnFile.add(mntmSae);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mnFile.add(mntmLoad);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnCustomize = new JMenu("Customize");
		menuBar.add(mnCustomize);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_2.add(btnNewButton_4);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(6, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblPalindromicSequencer = new JLabel("Palindromic Sequencer");
		lblPalindromicSequencer.setForeground(Color.BLACK);
		lblPalindromicSequencer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_5.add(lblPalindromicSequencer);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblStrandType = new JLabel("Strand Type:");
		lblStrandType.setForeground(Color.BLACK);
		panel_6.add(lblStrandType);
		
		JRadioButton rdbtnDna = new JRadioButton("DNA");
		rdbtnDna.setSelected(true);
		panel_6.add(rdbtnDna);
		
		JRadioButton rdbtnRna = new JRadioButton("RNA");
		panel_6.add(rdbtnRna);
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7);
		
		JLabel lblWhatDo = new JLabel("Find or Compare:");
		lblWhatDo.setForeground(Color.BLACK);
		panel_7.add(lblWhatDo);
		
		JRadioButton rdbtnFind = new JRadioButton("Find");
		rdbtnFind.setSelected(true);
		rdbtnFind.setForeground(Color.BLACK);
		panel_7.add(rdbtnFind);
		
		JRadioButton rdbtnCompare = new JRadioButton("Compare");
		panel_7.add(rdbtnCompare);
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("First Strand:");
		panel_8.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panel_8.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Import");
		panel_8.add(btnNewButton);
		
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Second Strand:");
		panel_9.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_9.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Import");
		panel_9.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_4.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setBackground(Color.GREEN);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear");
		panel_1.add(btnNewButton_3);
	}

}
