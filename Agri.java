import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Agri implements ActionListener {
		
		JFrame fC =new JFrame();
		JTextField t1,t2;
		JButton b,b1;
		JLabel l1,l2,l3,l4;
		JRadioButton r1,r2,r3,r4;
		ButtonGroup g1,g2;
		String S;
		
		public Agri() {
			fC.setTitle("Zakalculator");
			fC.setSize(new Dimension(2000,1000));
			fC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fC.setLayout(null);
		ImageIcon img= new ImageIcon("src/icon1.jpg");	
	    	fC.setIconImage(img.getImage());
	    Container C=fC.getContentPane();   
	    ImageIcon img1= new ImageIcon("src/Logo.png");
	    JLabel l=new JLabel("Agricultural Products",img1,JLabel.LEFT);
	
		    l.setForeground(new Color(100,100,100));
		    l.setFont(new Font("SANS_Serif",Font.BOLD,65));
	    
		    ImageIcon img2= new ImageIcon("src/agri.jpg");
			JLabel l5=new JLabel("",img2,JLabel.LEFT);
			l5.setBounds(800, 45, 500, 400);
			b1=new JButton("Go to menu");
		    
		    b1.setBounds(1030, 450, 150, 25);
			b1.setFocusable(false);
			b1.setBackground(new Color(199, 207, 183));
			b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b1.setFont(new Font("SANS_Serif", Font.BOLD, 15));
			b1.addActionListener(this);
				
			 b=new JButton("Calculate");
				b.setBounds(700, 400, 80, 30);
				b.setBackground(new Color(34, 153, 84 ));
				b.setFocusable(false);
				b.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
				b.setFont(new Font("SANS_Serif", Font.BOLD, 15));
				b.addActionListener(this);
				fC.getRootPane().setDefaultButton(b);
			
		JPanel p1=new JPanel();
		  
		    p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		    p1.setBackground(new Color(157, 173, 127));
		    p1.setLayout(new BorderLayout());
		    p1.setBounds(0, 0, 2000, 200);
		    
		    p1.add(l,BorderLayout.WEST);
		    
		JPanel  p2=new JPanel();
			p2.setBounds(200, 200, 100, 200);
		    p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		    p2.setBackground(new Color(85, 113, 116));
		    p2.setLayout(null);
		    p2.setBounds(0, 200, 2000, 1000);
		    
		 l1=new JLabel("Owned kilogrammes:");
		 	l1.setBounds(10, 100, 300, 30);
		 	l1.setFont(new Font("sans-Serif", Font.BOLD, 18));
		 	l1.setForeground(Color.WHITE);
		 	
		 t1=new JTextField("");
		 	t1.setBounds(350, 100, 300, 30);
		 l2=new JLabel("Irrigation type used:");
		 	l2.setBounds(10, 200, 300, 30);
		 	l2.setFont(new Font("sans-Serif", Font.BOLD, 18));
		 	l2.setForeground(Color.WHITE);
		 r1=new JRadioButton("Natural",true);
		 	r1.setBounds(350, 200, 100, 30);
		 	r1.addActionListener(this);
		 r2=new JRadioButton("Artificial");
		 	r2.setBounds(550, 200, 100, 30);
		 	r2.addActionListener(this);
		 g1=new ButtonGroup();
		 g1.add(r1);
		 g1.add(r2);
		 l3=new JLabel("Product type:");
		 	l3.setBounds(10, 300, 300, 30);
		 	l3.setFont(new Font("sans-Serif", Font.BOLD, 18));
		 	l3.setForeground(Color.WHITE);
		 	
		 r3=new JRadioButton("Corn");
			r3.setBounds(350, 300, 100, 30);
			r3.addActionListener(this);
		 r4=new JRadioButton("Other",true);
			r4.setBounds(550, 300, 100, 30);
			r4.addActionListener(this);
			
		g2=new ButtonGroup();
		g2.add(r3);
		g2.add(r4);
		 l4=new JLabel("Zakat worth in kilogrammes:");
		 	l4.setBounds(10, 400, 300, 30);
		 	l4.setFont(new Font("sans-Serif", Font.BOLD, 18));
		 	l4.setForeground(Color.WHITE);
		 t2=new JTextField("");
		 	t2.setBounds(350, 400, 300, 30);
		 	t2.setEditable(false);
		
		 
			C.add(p1);
			C.add(p2);
			p2.add(l5);
			p2.add(l1);
			p2.add(t1);
			p2.add(l2);
			p2.add(r1);
			p2.add(r2);
			p2.add(r3);
			p2.add(r4);
			p2.add(l4);
			p2.add(t2);
			p2.add(b);
			p2.add(b1);
			p2.add(l3);
		    fC.setVisible(true);
			}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b1) {
				fC.dispose();
				launchWindow l1=new launchWindow();
				}
			if(e.getSource()==b) {
				t2.setText("");
				S=t1.getText();
				if((isNumeric(S)==false)) {
					JOptionPane.showMessageDialog(null, "Characters can't be accepted! "
							+ " Please try again.", "Zakat worth", JOptionPane.ERROR_MESSAGE);
				}
				if(r1.isSelected() && r4.isSelected()) {
					
					Double Q= Double.parseDouble(S);
					calcul5.cham(Q);
					t2.setText(calcul5.Z+"kg");	
				}
				else if(r2.isSelected() && r4.isSelected()) {
					Double Q= Double.parseDouble(S);
					calcul4.cham(Q);
					t2.setText(calcul4.Z+"kg");	
				}
				else if(r1.isSelected() && r3.isSelected()) {
					
					Double Q= Double.parseDouble(S);
					if(Q<675) {
						JOptionPane.showMessageDialog(null,"You don't have to pay anything.", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);}
					else
					{calcul5.cham(Q);
					t2.setText(calcul5.Z+"kg");}
						}
				
				else if(r1.isSelected() && r4.isSelected()) {
					
					int Q= Integer.parseInt(S);
					if(Q<675) {
						JOptionPane.showMessageDialog(null,"You don't have to pay anything.", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);}
					else {
					calcul4.cham(Q);
					t2.setText(calcul4.Z+"kg");}
				
				}
		    }
		}
		public static boolean isNumeric(String str) {
	        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
	    }
}