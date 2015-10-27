import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
					Toolkit tk = Toolkit.getDefaultToolkit();
					frame.setSize(1920, 1080);
					frame.setVisible(true);
					frame.setResizable(false);
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
		Color lightBlue = new Color(0x74AFAD);
		Color lightOrange = new Color(0xFFAD00);
		Color okGreen = new Color(0x18F63F);
		Color radMagenta = new Color(0xA923F3);
		Color transparent = new Color(0,0,0,0);
		ImageIcon img = null;
		img = new ImageIcon(getClass().getResource("background.png"));
		
      
		
		
		setTitle("DNA Engineers - Palindrome Sequencer");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 580);
		
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
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
												
		JLabel Background = new JLabel();
		contentPane.add(Background);
		Background.setLayout(new BorderLayout(0, 0));
		Background.setIcon(img);
		
	
																			
			JPanel panel_4 = new JPanel();
			Background.add(panel_4, BorderLayout.NORTH);
			panel_4.setLayout(new GridLayout(6, 2, 0, 0));
			panel_4.setOpaque(false);
			panel_4.setBackground(transparent);
																					
																			
			JPanel panel_5 = new JPanel();
			panel_5.setForeground(Color.WHITE);
			panel_4.add(panel_5);
			panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_5.setBackground(transparent);
			panel_5.setOpaque(false);
																						
																								
			JLabel lblPalindromicSequencer = new JLabel("Palindromic Sequencer");
			lblPalindromicSequencer.setForeground(Color.WHITE);
			lblPalindromicSequencer.setFont(new Font("Nirmala UI", Font.BOLD, 25));
			panel_5.add(lblPalindromicSequencer);
			
			JPanel panel_6 = new JPanel();
			panel_6.setForeground(Color.WHITE);
			panel_6.setOpaque(false);
			panel_4.add(panel_6);
			panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_6.setBackground(lightBlue);
																								
																										
			JLabel lblStrandType = new JLabel("Strand Type:");
			lblStrandType.setForeground(Color.WHITE);
			panel_6.add(lblStrandType);
																										
			JRadioButton rdbtnDna = new JRadioButton("DNA");
			rdbtnDna.setOpaque(false);
			rdbtnDna.setForeground(new Color(0, 128, 0));
			rdbtnDna.setSelected(true);
			panel_6.add(rdbtnDna);
																										
			JRadioButton rdbtnRna = new JRadioButton("RNA");
			rdbtnRna.setOpaque(false);
			rdbtnRna.setForeground(radMagenta);
			panel_6.add(rdbtnRna);
																										
			JPanel panel_7 = new JPanel();
			panel_7.setForeground(Color.WHITE);
			panel_7.setOpaque(false);
			panel_4.add(panel_7);
			panel_7.setBackground(lightBlue);
																										
																												
			JLabel lblWhatDo = new JLabel("Find or Compare:");
			lblWhatDo.setForeground(Color.WHITE);
			panel_7.add(lblWhatDo);
																												
			JRadioButton rdbtnFind = new JRadioButton("Find");
			rdbtnFind.setOpaque(false);
			rdbtnFind.setSelected(true);
			rdbtnFind.setForeground(Color.WHITE);
			panel_7.add(rdbtnFind);
																												
			JRadioButton rdbtnCompare = new JRadioButton("Compare");
			rdbtnCompare.setForeground(Color.WHITE);
			rdbtnCompare.setOpaque(false);
			panel_7.add(rdbtnCompare);
																												
			JPanel panel_8 = new JPanel();
			panel_8.setForeground(Color.WHITE);
			panel_8.setOpaque(false);
			panel_4.add(panel_8);
			panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_8.setBackground(lightBlue);
																												
																														
			JLabel lblNewLabel = new JLabel("First Strand:");
			lblNewLabel.setForeground(Color.WHITE);
			panel_8.add(lblNewLabel);
																														
			textField_1 = new JTextField();
			
			panel_8.add(textField_1);
			textField_1.setColumns(10);
																														
			JButton btnNewButton = new JButton("Import");
			panel_8.add(btnNewButton);
																														
			JPanel panel_9 = new JPanel();
			panel_9.setForeground(Color.WHITE);
			panel_9.setOpaque(false);
			panel_4.add(panel_9);
			panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_9.setBackground(lightBlue);
			
			
			JLabel lblNewLabel_1 = new JLabel("Second Strand:");
			lblNewLabel_1.setForeground(Color.WHITE);
			panel_9.add(lblNewLabel_1);
				
			textField = new JTextField();
			panel_9.add(textField);
			textField.setColumns(10);
			
			JButton btnNewButton_1 = new JButton("Import");
			panel_9.add(btnNewButton_1);
			
			JPanel panel_1 = new JPanel();
			panel_1.setForeground(Color.WHITE);
			panel_1.setOpaque(false);
			panel_4.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_1.setBackground(lightBlue);
			
			JButton btnNewButton_2 = new JButton("Submit");
			btnNewButton_2.setBackground(okGreen);
			panel_1.add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("Clear");
			btnNewButton_3.setBackground(lightOrange);
			panel_1.add(btnNewButton_3);
			
			
			JPanel panel_2 = new JPanel();
			Background.add(panel_2, BorderLayout.CENTER);
			panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_2.setOpaque(false);
			panel_2.setBackground(transparent);
			
			JButton btnNewButton_4 = new JButton("New button");
			panel_2.add(btnNewButton_4);
	}	

}
