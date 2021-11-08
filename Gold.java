import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class Gold implements ActionListener {
	JFrame fC =new JFrame();
	JTextField t1,t2;
	JButton b,b1,b2;
	JLabel l1,l2,l3,l4;
	JRadioButton r1,r2,r3;
	ButtonGroup g1;
	String S;
	JCheckBox c;
	
	public Gold() {
		fC.setTitle("Zakalculator");
		fC.setSize(new Dimension(2000,1000));
		fC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fC.setLayout(null);
	ImageIcon img= new ImageIcon("src/icon1.jpg");	
    	fC.setIconImage(img.getImage());
    	
    	Container C=fC.getContentPane();   
    	
    ImageIcon img1= new ImageIcon("src/Logo.png");
    JLabel l=new JLabel("Gold",img1,JLabel.LEFT);

	    l.setForeground(new Color(100,100,100));
	    l.setFont(new Font("SANS_Serif",Font.BOLD,65));
    
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
		
		 l1=new JLabel("Owned gold in grammes:");
		 	l1.setBounds(10, 100, 400, 30);
		 	l1.setFont(new Font("sans-Serif", Font.BOLD, 18));
		 	l1.setForeground(Color.WHITE);
		 	
		 t1=new JTextField("");
		 	t1.setBounds(300, 100, 300, 30);
		 l2=new JLabel("The purity:");
			 l2.setBounds(10, 200, 400, 30);
			 l2.setFont(new Font("sans-Serif", Font.BOLD, 18));
			 l2.setForeground(Color.WHITE);	
		 r1=new JRadioButton("24 karat",true);
		 	r1.setBounds(600, 200, 100, 30);
		 	r1.addActionListener(this);
		 r2=new JRadioButton("18 karat");
		 	r2.setBounds(300, 200, 100, 30);
		 	r2.addActionListener(this);
		 r3=new JRadioButton("21 karat");
		 	r3.setBounds(450, 200, 100, 30);
		 	r3.addActionListener(this);
		 g1=new ButtonGroup();
		 g1.add(r1);
		 g1.add(r2);
		 g1.add(r3);
		 l4=new JLabel("Zakat worth in grammes:");
		 	l4.setBounds(10, 300, 300, 30);
		 	l4.setFont(new Font("sans-Serif", Font.BOLD, 18));
		 	l4.setForeground(Color.WHITE);
		 t2=new JTextField("");
		 	t2.setBounds(300, 300, 300, 30);
		 	t2.setEditable(false);
		 	c = new JCheckBox("Are you in possession of the wealth for one complete lunar (Hijrah) year?");
		 	c.setBounds(10, 400, 560, 30);
		 	c.setFocusable(false);
		 	c.setFont(new Font("sans-Serif", Font.BOLD, 14));
		 	c.setForeground(Color.BLACK);
		 	c.addActionListener(this);
	JPanel p1=new JPanel();
	  
	    p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    p1.setBackground(new Color(157, 173, 127));
	    p1.setLayout(new BorderLayout());
	    p1.setBounds(0, 0, 2000, 200);
	    
	    p1.add(l1,BorderLayout.WEST);
	    
	JPanel  p2=new JPanel();
		p2.setBounds(200, 200, 100, 200);
	    p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    p2.setBackground(new Color(85, 113, 116));
	    p2.setLayout(null);
	    p2.setBounds(0, 200, 2000, 1000);
	    
	    C.add(p1);
		C.add(p2);
		p2.add(b);
		p2.add(b1);
		p2.add(b2);
		p2.add(l1);
		p2.add(l4);
		p2.add(t1);
		p2.add(t2);
		p2.add(c);
		p1.add(l);
		p2.add(l2);
		p2.add(r1);
		p2.add(r2);
		p2.add(r3);
		
	    fC.setVisible(true);
	}
	

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			fC.dispose();
			launchWindow l1=new launchWindow();
			}
		if(e.getSource()==b2) {
			fC.dispose();
			GoldSil l1=new GoldSil();
			}
		if(e.getSource()==b){
			t2.setText("");
			S=t1.getText();
			if((isNumeric(S)==false)) {
				JOptionPane.showMessageDialog(null, "Characters can't be accepted! "
						+ " Please try again.", "Zakat worth", JOptionPane.ERROR_MESSAGE);
			}
			else if(c.isSelected()==false) {
				JOptionPane.showMessageDialog(null,"You don't have to pay anything you are not in possession of the wealth for one complete lunar year", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(c.isSelected()==true) {
			
			
			Double Q= Double.parseDouble(S);
			if(r1.isSelected())
			{ 	if(Q<=85&&Q>=0) {
				JOptionPane.showMessageDialog(null,"You don't have to pay anything.", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);}
				else {
					calcul6.cham(Q);
					t2.setText(calcul6.Z);
				}
			}
			else if(r2.isSelected())
			{ 	if(Q<=113&&Q>=0) {
				JOptionPane.showMessageDialog(null,"You don't have to pay anything.", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);}
				else {
					calcul6.cham(Q);
					t2.setText(calcul6.Z);
				}
			}
			else if(r3.isSelected())
			{ 	if(Q<=97&&Q>=0) {
				JOptionPane.showMessageDialog(null,"You don't have to pay anything.", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);}
				else {
					calcul6.cham(Q);
					t2.setText(calcul6.Z+"g");
					}
				}
			
			}
		}
	}
	public static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }

}
	
