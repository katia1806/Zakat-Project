import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
public class Cash implements ActionListener {
	JFrame fC =new JFrame();
	JTextField TF,t2,t1;
	JButton b,b1;
	JRadioButton r1,r2;
	String S;
	JCheckBox c;
	public Cash() {
		fC.setTitle("Zakalculator");
		fC.setSize(new Dimension(2000,1000));
		fC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fC.setLayout(null);
	ImageIcon img= new ImageIcon("src/icon1.jpg");	
    	fC.setIconImage(img.getImage());
    Container C=fC.getContentPane();   
    	
    ImageIcon img1= new ImageIcon("src/Logo.png");
    JLabel l1=new JLabel("Cash",img1,JLabel.LEFT);

	    l1.setForeground(new Color(100,100,100));
	    l1.setFont(new Font("SANS_Serif",Font.BOLD,65));
		
	    b1=new JButton("Go to menu");
	    
	    b1.setBounds(1030, 450, 150, 25);
		b1.setFocusable(false);
		b1.setBackground(new Color(199, 207, 183));
		b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		b1.setFont(new Font("SANS_Serif", Font.BOLD, 15));
		b1.addActionListener(this);

		 b=new JButton("Calculate");
			b.setBounds(600, 400, 80, 30);
			b.setBackground(new Color(34, 153, 84 ));
			b.setFocusable(false);
			b.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b.setFont(new Font("SANS_Serif", Font.BOLD, 15));
			b.addActionListener(this);
			fC.getRootPane().setDefaultButton(b);
	
		JLabel l2=new JLabel("Owned cash: ");
		 	l2.setBounds(10, 100, 400, 30);
		 	l2.setFont(new Font("sans-Serif", Font.BOLD, 18));
		 	l2.setForeground(Color.WHITE);
		 	
		 JLabel l3=new JLabel("Currency:");
		 	l3.setBounds(10, 200, 400, 30);
		 	l3.setFont(new Font("sans-Serif", Font.BOLD, 18));
		 	l3.setForeground(Color.WHITE);
		 	
		    t1=new JTextField("");
		 	t1.setBounds(400, 100, 300, 30);
			 l2.setForeground(Color.WHITE);	
			r1=new JRadioButton("American Dollar",true);
			 	r1.setBounds(570, 200, 130, 30);
			 	r1.addActionListener(this);
			r2=new JRadioButton("Algerian Dinar");
			 	r2.setBounds(400, 200, 130, 30);
			 	r2.addActionListener(this);
		ButtonGroup g1=new ButtonGroup();
			g1.add(r1);
			g1.add(r2);
		JLabel l4=new JLabel("Zakat worth:");
		 	l4.setBounds(10, 300, 300, 30);
		 	l4.setFont(new Font("sans-Serif", Font.BOLD, 18));
		  	l4.setForeground(Color.WHITE);
		  	
		    t2=new JTextField("");
		 	t2.setBounds(400, 300, 300, 30);
		 	t2.setEditable(false);
		 	
		 	c = new JCheckBox("Are you in possession of the wealth for one complete lunar (Hijrah) year?");
		 	c.setBounds(10, 400, 550, 30);
		 	c.setFocusable(false);
		 	c.setFont(new java.awt.Font("sans-Serif", Font.BOLD, 14));
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
	p2.add(l4);
	p2.add(l2);
	p2.add(t1);
	p2.add(t2);
	p2.add(r1);
	p2.add(r2);
	p2.add(c);
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
		if(e.getSource()==b){
			t2.setText("");
			S=t1.getText();
			if((isNumeric(S)==false)) {
				JOptionPane.showMessageDialog(null, "Characters can't be accepted! "
						+ " Please try again.", "Zakat worth", JOptionPane.ERROR_MESSAGE);
			}
			else
			if(c.isSelected()==false) {
				JOptionPane.showMessageDialog(null,"You don't have to pay anything, you are not in possession of the wealth for one complete lunar year", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(c.isSelected()==true) {
			Double Q= Double.parseDouble(S);
			if(r1.isSelected())
			{ 	if(Q<=5088&&Q>=0) {
				JOptionPane.showMessageDialog(null,"You don't have to pay anything.", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);}
				else {
					calcul6.cham(Q);
					t2.setText(calcul6.Z+"$");
				}
			}
			else if(r2.isSelected())
			{ 	if(Q<=552500&&Q>=0) {
				JOptionPane.showMessageDialog(null,"You don't have to pay anything.", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);}
				else {
					calcul6.cham(Q);
					t2.setText(calcul6.Z+"DA");
					}
				}
			
			}		
		}
}
	public static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
}