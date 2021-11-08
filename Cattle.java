import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cattle  implements ActionListener {
								
		JFrame fC =new JFrame();
		JTextField TF;
		JButton b,b1,b2,b3;
		
	public Cattle(){
			fC.setTitle("Zakalculator");
			fC.setSize(new Dimension(2000,1000));
			fC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fC.setLayout(null);
		ImageIcon img= new ImageIcon("src/icon1.jpg");	
	    	fC.setIconImage(img.getImage());
	    	
	    ImageIcon img1= new ImageIcon("src/Logo.png");
	    JLabel l1=new JLabel("Cattle",img1,JLabel.LEFT);
	
		    l1.setForeground(new Color(100,100,100));
		    l1.setFont(new Font("SANS_Serif",Font.BOLD,65));
	    
		    b=new JButton("Go to menu");
		    
		    b.setBounds(1030, 450, 150, 25);
			b.setFocusable(false);
			b.setBackground(new Color(199, 207, 183));
			b.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b.setFont(new Font("SANS_Serif", Font.BOLD, 15));
			b.addActionListener(this);

			
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
		    
		b1=new JButton("Camels");
			b1.setBounds(100,210,200,50);
			b1.setBackground(new Color(199, 207, 183));
			b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b1.setFont(new Font("SANS_Serif", Font.BOLD, 17));
			b1.setFocusable(false);
			b1.addActionListener(this);	
			
		b2=new JButton("Bovins");
			b2.setBounds(400,210,200,50);
			b2.setFocusable(false);
			b2.setBackground(new Color(199, 207, 183));
			b2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b2.setFont(new Font("SANS_Serif", Font.BOLD, 17));
			b2.addActionListener(this);	
		b3=new JButton("Ovins");
			b3.setBounds(700,210,200,50);
			b3.setFocusable(false);
			b3.setBackground(new Color(199, 207, 183));
			b3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b3.setFont(new Font("SANS_Serif", Font.BOLD, 17));
			b3.addActionListener(this);	
		
		fC.add(p1);
		fC.add(p2);
		p2.add(b3);
		p2.add(b);
		p2.add(b2);
		p2.add(b1);
	    fC.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			fC.dispose();
			launchWindow l1=new launchWindow();
			}
		if(e.getSource()==b1) {
			fC.dispose();
			Camel l2=new Camel();
			}
		if(e.getSource()==b2) {
			fC.dispose();
			bovins l3=new bovins();
			}
		if(e.getSource()==b3) {
			fC.dispose();
			ovins l4=new ovins();
			}
		}
		
	}
