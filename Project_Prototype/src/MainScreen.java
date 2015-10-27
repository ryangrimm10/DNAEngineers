import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainScreen extends JFrame implements ActionListener {

    private JPanel contentPane;
	private JTextField txtFirstStrand;
	private JTextField txtStrand;
	private JTextField textField_1;
	private JTextField textField;
	private JButton logoButton = new JButton();
	private JButton clearButton = new JButton("Clear");
	private JButton submitButton = new JButton("Submit");
	private JButton importButton1 = new JButton("Import");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
		setBounds(100, 100, 683, 545);
		
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
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, -5));
												
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
			
			ButtonGroup strandGroup = new ButtonGroup();
			strandGroup.add(rdbtnDna);
			strandGroup.add(rdbtnRna);
																										
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
			
			ButtonGroup findCompareGroup = new ButtonGroup();
			findCompareGroup.add(rdbtnFind);
			findCompareGroup.add(rdbtnCompare);
			
																												
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
			textField_1.setColumns(20);
																														
			importButton1.addActionListener(this);
			panel_8.add(importButton1);
																														
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
			textField.setColumns(20);
			
			JButton btnNewButton_1 = new JButton("Import");
			panel_9.add(btnNewButton_1);
			
			JPanel panel_1 = new JPanel();
			panel_1.setForeground(Color.WHITE);
			panel_1.setOpaque(false);
			panel_4.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_1.setBackground(lightBlue);
			
			submitButton.setBackground(okGreen);
			submitButton.addActionListener(this);
			panel_1.add(submitButton);
			
			
			clearButton.setBackground(lightOrange);
			clearButton.addActionListener(this);
			panel_1.add(clearButton);
			
			
			JPanel panel_2 = new JPanel();
			Background.add(panel_2, BorderLayout.CENTER);
			panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_2.setOpaque(false);
			panel_2.setBackground(transparent);
			
			
			logoButton.setSize(200, 140);
			logoButton.addActionListener(this);
			panel_2.add(logoButton);
			try
			{
				Image logo = ImageIO.read(getClass().getResource("ProjectLogo.gif"));
				Image newimg = logo.getScaledInstance(200, 140, java.awt.Image.SCALE_SMOOTH ) ;  
				logoButton.setIcon(new ImageIcon(newimg));
			}
			catch (IOException ex)
			{
				
			}
	}

	@Override
	public void actionPerformed(ActionEvent click) {
		
		Object source = click.getSource();
		
		
		if (source == logoButton)
		{
			try
			{
			String url = "http://thednaengineers.co.nf/About.html";
			Desktop dt = Desktop.getDesktop();
			URI uri = new URI(url);
			dt.browse(uri.resolve(uri));
			}
			catch (URISyntaxException ex)
			{
				
			}
			catch (IOException ex)
			{
				
			}
		}
		
		if (source == clearButton)
		{
			textField_1.setText("");
			textField.setText("");
		}
		
		if (source == submitButton)
		{
			StrandDisplay secondDisplay = new StrandDisplay();
			secondDisplay.setVisible(true);
			
		}
		
		if (source == importButton1)
		{
			
				JFileChooser chooser = new JFileChooser();
		        int status = chooser.showOpenDialog(null);
		        if (status == JFileChooser.APPROVE_OPTION) {
		            File file = chooser.getSelectedFile();
		            if (file == null) {
		                return;
		            }

		            String fileName = chooser.getSelectedFile().getAbsolutePath();
		            
		            
		            textField_1.setText("Strand Imported");
		            

		        }

		}
		


		
	}	

}
