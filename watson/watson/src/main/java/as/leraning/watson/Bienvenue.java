package as.leraning.watson;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Bienvenue extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-29,-21
	 */
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenue frame = new Bienvenue();
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
	public Bienvenue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setToolTipText("iWoS");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 Image imgB = new ImageIcon(this.getClass().getResource("/jjjj.png")).getImage();
		
		JButton btnNewButton = new JButton("Démarrer");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 Commentaire t = new Commentaire();
					
					t.setVisible(true);
					
					
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
			}
		});
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.setBounds(407, 408, 137, 29);
		contentPane.add(btnNewButton);
		
		JLabel iconApp = new JLabel(" ");
		iconApp.setHorizontalAlignment(SwingConstants.CENTER);
		iconApp.setBounds(-74, -184, 344, 469);
		contentPane.add(iconApp);
		 Image imgA = new ImageIcon(this.getClass().getResource("/250.png")).getImage();
		 iconApp.setIcon(new ImageIcon(imgA));
		 Image imgC= new ImageIcon(this.getClass().getResource("/oo.png")).getImage();
		 
		 JPanel panel = new JPanel();
		 panel.setBackground(new Color(245, 245, 245));
		 panel.setBounds(257, 65, 446, 82);
		 contentPane.add(panel);
		 
		 JLabel TextWelcome = new JLabel("Welcome To IWoS Application");
		 panel.add(TextWelcome);
		 TextWelcome.setBackground(new Color(173, 216, 230));
		 TextWelcome.setFont(new Font("Times New Roman", Font.BOLD, 24));
		 TextWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		 
		 JLabel icobieevenue = new JLabel("");
		 panel.add(icobieevenue);
		 icobieevenue.setBackground(new Color(230, 230, 250));
		 icobieevenue.setHorizontalAlignment(SwingConstants.CENTER);
	 icobieevenue.setIcon(new ImageIcon(imgB));
		 
		 JLabel client = new JLabel(" ");
		 client.setBounds(24, 248, 116, 104);
		 contentPane.add(client);
		 client.setIcon(new ImageIcon(imgC));
		 
		 JEditorPane dtrpnPourPlusSavoir = new JEditorPane();
		 dtrpnPourPlusSavoir.setBounds(93, 276, 786, 76);
		 contentPane.add(dtrpnPourPlusSavoir);
		 dtrpnPourPlusSavoir.setBackground(new Color(230, 230, 250));
		 dtrpnPourPlusSavoir.setFont(new Font("Tw Cen MT", Font.PLAIN, 24));
		 dtrpnPourPlusSavoir.setText(   
		 		"  Pour  savoir plus  sur les avis de votre clientele,veuillez taper sur démarrer");
		 
		 JPanel panel_1 = new JPanel();
		 panel_1.setBackground(new Color(230, 230, 250));
		 panel_1.setBounds(10, 209, 888, 166);
		 contentPane.add(panel_1);
		 
		
	}
}
