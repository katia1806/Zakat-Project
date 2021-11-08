import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class ovins implements ActionListener{
	JFrame fC=new JFrame();
	JButton b,b1,b2;
	JTextField t1,t2;
	String S;
	JCheckBox c;
	
		public ovins() {
			fC.setTitle("Zakalculator");
			fC.setSize(new Dimension(2000,1000));
			fC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fC.setLayout(null);
			ImageIcon img= new ImageIcon("src/icon1.jpg");	
			fC.setIconImage(img.getImage());
			fC.setBackground(Color.WHITE);
		Container C=fC.getContentPane();   
		ImageIcon img2= new ImageIcon("src/Logo.png");
		JLabel l1=new JLabel("Ovins",img2,JLabel.LEFT);

				    l1.setForeground(new Color(100,100,100));
				    l1.setFont(new Font("SANS_Serif",Font.BOLD,65));
				   
		JLabel ta=new JLabel("Owned ovins:");
			ta.setFont(new Font("sans-Serif", Font.BOLD, 17));
			ta.setBounds(20,110,230,30);
			ta.setForeground(Color.WHITE);
		
		t2=new JTextField();
			t2.setBounds(300, 200, 300, 30);
			t2.setEditable(false);
		
		JLabel ta1=new JLabel("Zakat worth:");
			ta1.setFont(new Font("sans-Serif", Font.BOLD, 17));
			ta1.setBounds(20,210,230,30);
			ta1.setForeground(Color.WHITE);
			t1=new JTextField();
			t1.setBounds(300, 100, 300, 30);
			
		ImageIcon img1= new ImageIcon("src/ovins1.jpg");
		JLabel l=new JLabel("",img1,JLabel.LEFT);
			
		    l.setForeground(new Color(100,100,100));
		    l.setFont(new Font("SANS_Serif",Font.BOLD,75));
	        l.setBounds(770, 30, 500, 400);
	        
	        b1=new JButton("Go to menu");
		    
		    b1.setBounds(1030, 450, 150, 25);
			b1.setFocusable(false);
			b1.setBackground(new Color(199, 207, 183));
			b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b1.setFont(new Font("SANS_Serif", Font.BOLD, 15));
			b1.addActionListener(this);

			b2=new JButton("Go to previous page");
			    
			 b2.setBounds(1200, 450, 150, 25);
			 b2.setFocusable(false);
			 b2.setBackground(new Color(199, 207, 183));
			 b2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			 b2.setFont(new Font("SANS_Serif", Font.BOLD, 15));
			 b2.addActionListener(this);
				
			 b=new JButton("Calculate");
				b.setBounds(600, 400, 80, 30);
				b.setBackground(new Color(34, 153, 84 ));
				b.setFocusable(false);
				b.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
				b.setFont(new Font("SANS_Serif", Font.BOLD, 15));
				b.addActionListener(this);
				fC.getRootPane().setDefaultButton(b);
				
			c = new JCheckBox("Are you in possession of the wealth for one complete lunar (Hijrah) year?");
		 	c.setBounds(10, 300, 550, 30);
		 	c.setFocusable(false);
		 	c.setFont(new java.awt.Font("sans-Serif", Font.BOLD, 14));
		 	c.setForeground(Color.BLACK);
		 	c.addActionListener(this);
		 	
			JPanel p1=new JPanel();
	        
		    p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		    p1.setBackground(new Color(157, 173, 127));
		    p1.setLayout(new BorderLayout());
		    p1.setBounds(0, 0, 2000, 200);
		    
		    JPanel  p2=new JPanel();
		    
		    p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		    p2.setBackground(new Color(85, 113, 116));
		    p2.setLayout(null);
		    p2.setBounds(0, 200, 2000, 1000);
		    
		    C.add(p1);
		   	C.add(p2);
		   	p1.add(l1);
		   	p2.add(b1);
		   	p2.add(c);
		   	p2.add(l);
		   	p2.add(b2);
		   	p2.add(ta1);
		   	p2.add(t2);
		   	p2.add(b);
		   	p2.add(ta);
		   	p2.add(t1);
		fC.setVisible(true);
	}
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==b1) {
					fC.dispose();
					launchWindow l1=new launchWindow();
				}
				if(e.getSource()==b2) {
					fC.dispose();
					Cattle C=new Cattle();
					}
				if(e.getSource()==b) {
					t2.setText("");
					S=t1.getText();
					if((isNumeric(S)==false)) {
									JOptionPane.showMessageDialog(null, "Characters can't be accepted! "
											+ " Please try again.", "Zakat worth", JOptionPane.ERROR_MESSAGE);}
					int Q= Integer.parseInt(S);
					if ( Q<0 ) {
						
						JOptionPane.showMessageDialog(null, "This number can't be accepted! Please try again.", "Zakat worth", JOptionPane.ERROR_MESSAGE);
						
					}									
					else if(c.isSelected()==false) {
						JOptionPane.showMessageDialog(null,"You don't have to pay anything you are not in possession of the wealth for one complete lunar year", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);
					}
					
					else if(c.isSelected()==true) {
							
							calcul3.cham(Q);
							t2.setText(calcul3.Z);}
				
				}
				
			}
		
			public static boolean isNumeric(String str) {
		        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
		    }
}
