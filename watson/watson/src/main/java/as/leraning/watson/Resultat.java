package as.leraning.watson;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Resultat extends JFrame {
	private JPanel contentPane;
	private JLabel txtResult;
	private JLabel angerscore;
	private JLabel joyscor;
	private JLabel fearscore;
	private  JLabel sadscore;
	private JTextField txtEmotions;
	private JLabel lblJoie;
	private JLabel donepeur;
	private JLabel lblNewLabel_3;
	private JLabel ngericon;
	private JLabel joyicon;
	private JLabel fearicon;
	private JLabel sacicon;
	private JLabel ICONEM;
	private JTextField txtStyleDeLanguage;
	private JLabel imgTent;
	private JLabel CONFIMAG;
	private JLabel textten;
	private JLabel scoretentt;
	private JLabel TEXTCON;
	private JLabel confscore;
	private JLabel ICONEM_1;
	private JLabel iconI;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel doneanger;
	private JLabel donejoy;
	private JLabel doneP;
	private JLabel donetriste;
	private JLabel label_3;
	private JLabel label_4;
	private JPanel panel_1;
	private JPanel panel;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultat frame = new Resultat(null, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Resultat(List<String>sc, List<String>em) {
		
	//String [] SC= sc.toArray(new String[sc.size()]);
	 // System.out.println(g);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 839);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		txtResult = new JLabel();
		txtResult.setForeground(new Color(0, 0, 0));
		txtResult.setBackground(new Color(230, 230, 250));
		txtResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtResult.setText("Résultat");
		txtResult.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 24));
		txtResult.setBounds(369, 83, 208, 30);
		contentPane.add(txtResult);
	
		
 
			sadscore =new JLabel("");
			sadscore.setFont(new Font("Arial Black", Font.BOLD, 17));
			sadscore.setBackground(new Color(245, 245, 245));
			sadscore.setBounds(764, 313, 69, 37);
			contentPane.add(sadscore);
	
			
			fearscore =new JLabel("");
			fearscore.setFont(new Font("Arial Black", Font.BOLD, 17));
			fearscore.setBackground(new Color(245, 245, 245));
			fearscore.setBounds(545, 313, 62, 37);
			contentPane.add(fearscore);
		
			
			joyscor =new JLabel("");
			joyscor.setFont(new Font("Arial Black", Font.BOLD, 17));
			joyscor.setBackground(new Color(245, 245, 245));
			joyscor.setBounds(350, 313, 69, 37);
			contentPane.add(joyscor);
	
			
			angerscore =new JLabel("");
		
			angerscore.setFont(new Font("Arial Black", Font.BOLD, 17));
			angerscore.setBackground(new Color(245, 245, 245));
			angerscore.setBounds(161, 313, 48, 37);
			contentPane.add(angerscore);
		
			
			
			txtEmotions = new JTextField();
			txtEmotions.setForeground(new Color(0, 0, 0));
			txtEmotions.setBackground(new Color(176, 196, 222));
			txtEmotions.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
			txtEmotions.setHorizontalAlignment(SwingConstants.CENTER);
			txtEmotions.setText("Emotions");
			txtEmotions.setBounds(308, 148, 176, 37);
			contentPane.add(txtEmotions);
			txtEmotions.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("Colére");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
			lblNewLabel.setBounds(114, 288, 114, 30);
			contentPane.add(lblNewLabel);
			
			lblJoie = new JLabel("Joie");
			lblJoie.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
			lblJoie.setHorizontalAlignment(SwingConstants.CENTER);
			lblJoie.setBounds(304, 287, 100, 30);
			contentPane.add(lblJoie);
			
			donepeur = new JLabel("Peur");
			donepeur.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
			donepeur.setHorizontalAlignment(SwingConstants.CENTER);
			donepeur.setBounds(485, 288, 146, 30);
			contentPane.add(donepeur);
			
			lblNewLabel_3 = new JLabel("Tristesse");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
			lblNewLabel_3.setBounds(701, 285, 166, 32);
			contentPane.add(lblNewLabel_3);
			
			ngericon = new JLabel("");
			ngericon.setHorizontalAlignment(SwingConstants.CENTER);
			ngericon.setBounds(133, 216, 95, 60);
			contentPane.add(ngericon);
			 Image imgang = new ImageIcon(this.getClass().getResource("/ANGER.png")).getImage();
	         ngericon.setIcon(new ImageIcon(imgang));
				
	         
			joyicon = new JLabel("");
			joyicon.setHorizontalAlignment(SwingConstants.CENTER);
			joyicon.setBounds(308, 216, 96, 60);
			contentPane.add(joyicon);
			Image imgjoy = new ImageIcon(this.getClass().getResource("/JOY.png")).getImage();
		    joyicon.setIcon(new ImageIcon(imgjoy));
				
		    
			fearicon = new JLabel("");
			fearicon.setHorizontalAlignment(SwingConstants.CENTER);
			fearicon.setBounds(492, 217, 128, 60);
			contentPane.add(fearicon);
			 Image imgfear = new ImageIcon(this.getClass().getResource("/FEAR.png")).getImage();
			fearicon.setIcon(new ImageIcon(imgfear));
			
			
			sacicon = new JLabel("");
			sacicon.setHorizontalAlignment(SwingConstants.CENTER);
			sacicon.setBounds(725, 216, 108, 60);
			contentPane.add(sacicon);
			Image imgsad1 = new ImageIcon(this.getClass().getResource("/SAD.png")).getImage();
			sacicon.setIcon(new ImageIcon(imgsad1));
			
			ICONEM = new JLabel("");
			ICONEM.setHorizontalAlignment(SwingConstants.CENTER);
			ICONEM.setBounds(436, 92, 174, 136);
			contentPane.add(ICONEM);
			Image imgsEM = new ImageIcon(this.getClass().getResource("/emd.png")).getImage();
			ICONEM.setIcon(new ImageIcon(imgsEM));
			
			txtStyleDeLanguage = new JTextField();
			txtStyleDeLanguage.setText("Style de language\r\n");
			txtStyleDeLanguage.setHorizontalAlignment(SwingConstants.CENTER);
			txtStyleDeLanguage.setForeground(Color.BLACK);
			txtStyleDeLanguage.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
			txtStyleDeLanguage.setColumns(10);
			txtStyleDeLanguage.setBackground(new Color(176, 196, 222));
			txtStyleDeLanguage.setBounds(308, 435, 176, 37);
			contentPane.add(txtStyleDeLanguage);
			
			imgTent = new JLabel("");
			imgTent.setHorizontalAlignment(SwingConstants.CENTER);
			imgTent.setBounds(235, 494, 75, 80);
			contentPane.add(imgTent);
			 Image imgTE = new ImageIcon(this.getClass().getResource("/TENT.png")).getImage();
				imgTent.setIcon(new ImageIcon(imgTE));
				
			
			CONFIMAG = new JLabel("\r\n");
			CONFIMAG.setHorizontalAlignment(SwingConstants.CENTER);
			CONFIMAG.setBounds(636, 494, 88, 80);
			contentPane.add(CONFIMAG);
			 Image imgCONF = new ImageIcon(this.getClass().getResource("/CONF.png")).getImage();
				CONFIMAG.setIcon(new ImageIcon(imgCONF));
				
			
			textten = new JLabel("Tentative");
			textten.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
			textten.setHorizontalAlignment(SwingConstants.CENTER);
			textten.setBounds(224, 585, 108, 30);
			contentPane.add(textten);
			
			scoretentt = new JLabel("");
			scoretentt.setFont(new Font("Arial Black", Font.BOLD, 17));
			scoretentt.setHorizontalAlignment(SwingConstants.CENTER);
			scoretentt.setBounds(244, 613, 75, 30);
			contentPane.add(scoretentt);
			
			TEXTCON = new JLabel("Confident");
			TEXTCON.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
			TEXTCON.setHorizontalAlignment(SwingConstants.CENTER);
			TEXTCON.setBounds(613, 585, 128, 30);
			contentPane.add(TEXTCON);
			
			confscore = new JLabel("");
			confscore.setFont(new Font("Arial Black", Font.BOLD, 17));
			confscore.setHorizontalAlignment(SwingConstants.CENTER);
			confscore.setBounds(646, 619, 78, 19);
			contentPane.add(confscore);
			
			ICONEM_1 = new JLabel("");
			ICONEM_1.setHorizontalAlignment(SwingConstants.CENTER);
			ICONEM_1.setBounds(436, 390, 174, 136);
			contentPane.add(ICONEM_1);
			 Image imgT = new ImageIcon(this.getClass().getResource("/T.png")).getImage();
				ICONEM_1.setIcon(new ImageIcon(imgT));
				
				iconI = new JLabel("");
				iconI.setHorizontalAlignment(SwingConstants.CENTER);
				iconI.setBounds(-33, -23, 200, 136);
				contentPane.add(iconI);
				 Image imgA = new ImageIcon(this.getClass().getResource("/180.png")).getImage();
				 iconI.setIcon(new ImageIcon(imgA));
				 
				JLabel lblNewLabel1 = new JLabel(" IWoS Application");
				lblNewLabel1.setBackground(new Color(102, 205, 170));
				lblNewLabel1.setFont(new Font("Times New Roman", Font.BOLD, 22));
				lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel1.setBounds(10, 0, 260, 29);
				contentPane.add(lblNewLabel1);
				
				btnNewButton_2 = new JButton("nouveau commentaire");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 Commentaire t = new Commentaire();
							
							t.setVisible(true);
					}
				});
				btnNewButton_2.setBounds(244, 684, 254, 36);
				btnNewButton_2.setBackground(new Color(211, 211, 211));
				btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 14));
				contentPane.add(btnNewButton_2);
				
				btnNewButton_3 = new JButton("Quitter");
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 dispose();
					}
				});
				btnNewButton_3.setBounds(534, 684, 146, 36);
				btnNewButton_3.setBackground(new Color(211, 211, 211));
				btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 14));
				contentPane.add(btnNewButton_3);
				
				doneanger = new JLabel("");
				doneanger.setHorizontalAlignment(SwingConstants.CENTER);
				doneanger.setBounds(201, 281, 46, 37);
				contentPane.add(doneanger);
				
				
				donejoy = new JLabel("");
				donejoy.setHorizontalAlignment(SwingConstants.CENTER);
				donejoy.setBounds(369, 285, 62, 30);
				contentPane.add(donejoy);
				
				
				doneP = new JLabel("");
				doneP.setHorizontalAlignment(SwingConstants.CENTER);
				doneP.setBounds(585, 288, 46, 31);
				contentPane.add(doneP);
				contentPane.add(donejoy);
			
				
				
				donetriste = new JLabel("");
				donetriste.setHorizontalAlignment(SwingConstants.CENTER);
				donetriste.setBounds(813, 281, 54, 37);
				contentPane.add(donetriste);
			
				label_3 = new JLabel("");
				label_3.setBounds(329, 585, 75, 30);
				contentPane.add(label_3);
			
			
				
				label_4 = new JLabel("");
				label_4.setBounds(738, 585, 69, 37);
			
				contentPane.add(label_4);
				
				panel_1 = new JPanel();
				panel_1.setBounds(99, 409, 786, 251);
				contentPane.add(panel_1);
				
				panel = new JPanel();
				panel.setBounds(99, 124, 786, 274);
				contentPane.add(panel);
				 Image imgCm= new ImageIcon(this.getClass().getResource("/uuu.png")).getImage();
			
		 /*List<String> mots = new ArrayList<String>();
			 List<String> mote = new ArrayList<String>();
			// mots=sc;
			
	System.out.println(em); System.out.println(sc);	*/	
		 for(String c1 :em ){
		 if (c1.contains("Joy"))
		  {
			  traitement f = new traitement();
				joyscor.setText(f.score(sc.get(em.indexOf(c1))));
			
				 Image imgCb= new ImageIcon(this.getClass().getResource("/ik.png")).getImage();
				 donejoy.setIcon(new ImageIcon(imgCb));
			
			   continue;
		  } 
		 else if (c1.contains("Sadness")) {
			  traitement f = new traitement();
				sadscore.setText(f.score(sc.get(em.indexOf(c1))));

				 Image imgb= new ImageIcon(this.getClass().getResource("/ik.png")).getImage();
				 donetriste.setIcon(new ImageIcon(imgb));
				
			   continue;}
		 else if (c1.contains("Anger")) {
			 
			  traitement f = new traitement();
				angerscore.setText(f.score(sc.get(em.indexOf(c1))));
				 Image imgCO = new ImageIcon(this.getClass().getResource("/ik.png")).getImage();
					doneanger.setIcon(new ImageIcon(imgCO));
			
			   continue;}
			 
			
           else if (c1.contains("Fear")) {
        	   traitement f = new traitement();
        	   fearscore.setText(f.score(sc.get(em.indexOf(c1))));
        		 Image imgC= new ImageIcon(this.getClass().getResource("/ik.png")).getImage();
				 doneP.setIcon(new ImageIcon(imgC));
				 
			
			
				   continue;}
		 		
	
		
		   if (c1.contains("Confident")) {
			   traitement f = new traitement();
			   confscore.setText(f.score(sc.get(em.indexOf(c1))));
				 Image mCb= new ImageIcon(this.getClass().getResource("/ik.png")).getImage();
					label_4.setIcon(new ImageIcon(mCb));
				
			   //System.out.println("Confident");
			   continue;
			   }
		   if (c1.contains("Tentative")) {
			   traitement f = new traitement();
			
				scoretentt.setText(f.score(sc.get(em.indexOf(c1))));
				 Image mgCb= new ImageIcon(this.getClass().getResource("/ik.png")).getImage();
					label_3.setIcon(new ImageIcon(mgCb));
		
			 //  System.out.println("Tentative");
			   continue;}}
		
		  
		 
	}
	}
