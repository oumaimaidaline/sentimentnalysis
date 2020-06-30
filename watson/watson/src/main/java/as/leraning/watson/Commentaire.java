package as.leraning.watson;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Commentaire extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnImaaaane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Commentaire frame = new Commentaire();
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
	public Commentaire() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" IWoS Application");
		lblNewLabel.setBackground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(83, 67, 287, 29);
		contentPane.add(lblNewLabel);
		
		txtpnImaaaane = new JTextPane();
		txtpnImaaaane.setText("                        ...............................................................................;");
		txtpnImaaaane.setBackground(new Color(230, 230, 250));
		txtpnImaaaane.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtpnImaaaane.setBounds(107, 203, 726, 109);
		contentPane.add(txtpnImaaaane);
		
		JLabel iconA = new JLabel("");
		iconA.setBounds(-11, -37, 213, 159);
		contentPane.add(iconA);
		 Image imgA = new ImageIcon(this.getClass().getResource("/180.png")).getImage();
		 iconA.setIcon(new ImageIcon(imgA));
		 
		
		JLabel iconCM = new JLabel("");
		iconCM.setBounds(625, 109, 109, 83);
		contentPane.add(iconCM);
		 Image imgC = new ImageIcon(this.getClass().getResource("/u.png")).getImage();
		 iconCM.setIcon(new ImageIcon(imgC));
		 
		JLabel IconT = new JLabel("");
		IconT.setBounds(658, 248, 46, 14);
		contentPane.add(IconT);
		
		JLabel lblNewLabel_1 = new JLabel("Veuillez saisair le commentaire  de votre client :");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(97, 140, 552, 52);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton(" Result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String texta = txtpnImaaaane.getText().toString();
		//	System.out.println(texta);
	Tone t = new Tone();
		t.analyse(texta);
		
			}
		});
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.setBounds(382, 335, 163, 29);
		contentPane.add(btnNewButton);
	
	}
}
