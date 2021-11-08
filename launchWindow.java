import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class launchWindow implements ActionListener {
		JFrame f1 =new JFrame();
		JButton b1,b2,b3,b4;
		ImageIcon img,img1,img2,img3,img4,img5;
		JLabel L,l,l1,l3,l4,l5;
		JPanel p1,p2,p3;
	public launchWindow(){
			f1.setTitle("Zakalculator");
			f1.setSize(new Dimension(2000,1000));
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f1.setLayout(null);
		img= new ImageIcon("src/icon1.jpg");	
		    f1.setIconImage(img.getImage());
		
		l=new JLabel();
		l.setText("Zakat Calculator");
		l.setFont(new Font("SANS_Serif",1,65));
		l.setBounds(428, 40, 510, 100);
		
		img1= new ImageIcon("src/Logo.png");
		L=new JLabel(img1);
		L.setBounds(40, 10, 180, 180);
		
		Container c=f1.getContentPane();   
		p1=new JPanel();
		    p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		    p1.setBackground(new Color(157, 173, 127));
		    p1.setLayout(null);
		    p1.setBounds(0, 0, 1366, 200);

		p2=new JPanel();
			p2.setBounds(0, 200, 1366, 800);
		    p2.setBackground(new Color(85, 113, 116));
		    p2.setLayout(null);
		
		b1=new JButton("Cattle");
			b1.setBounds(183,260,200,50);
			b1.setFocusable(false);
			b1.setBackground(new Color(199, 207, 183));
			b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b1.setFont(new Font("SANS_Serif", Font.BOLD, 17));
			b1.addActionListener(this);	
		b2=new JButton("Agricultural Products");
			b2.setBounds(450,260,200,50);
			b2.setFocusable(false);
			b2.setBackground(new Color(199, 207, 183));
			b2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b2.setFont(new Font("SANS_Serif", Font.BOLD, 17));
			b2.addActionListener(this);	
		b3=new JButton("Gold & Silver");
			b3.setBounds(716,260,200,50);
			b3.setFocusable(false);
			b3.setBackground(new Color(199, 207, 183));
			b3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b3.setFont(new Font("SANS_Serif", Font.BOLD, 17));
			b3.addActionListener(this);	
		b4=new JButton("Cash");
			b4.setBounds(993,260,200,50);
			b4.setFocusable(false);
			b4.setBackground(new Color(199, 207, 183));
			b4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			b4.setFont(new Font("SANS_Serif", Font.BOLD, 17));
			b4.addActionListener(this);	
		
		JTextArea a=new JTextArea("      The Zakat calculator helps you determine how much zakat you need to pay.The zakat "
				+ "            calculator considers your comprehensive net assets (total wealth)."
				+ " Remember that                  charity in Islam (Zakat) is not just one of the core pillars of "
				+ " Islam,but a tool to help                   ease poverty, suffering and hardship throughout the globe.");
			a.setFont(new Font("SANS_SERIF",0,18));
			a.setBounds(311,60,744,130);
			a.setLineWrap(true);
			a.setEditable(false);
			a.setBackground(new Color(199, 207, 183));
			a.setWrapStyleWord(true);
		    a.setBorder(BorderFactory.createEtchedBorder(0, Color.yellow, Color.black));
		    
			img2= new ImageIcon("src/cattle.png");	
		    
		    l1=new JLabel();
		    l1.setIcon(img2);
		    l1.setBounds(233,320,100,100);
		    l1.setBackground(new Color(85, 113, 116));
		    l1.setOpaque(true);
		    
		    img3= new ImageIcon("src/agri.png");	
		    
		    l3=new JLabel();
		    l3.setIcon(img3);
		    l3.setBounds(500,320,100,100);
		    l3.setBackground(new Color(85, 113, 116));
		    l3.setOpaque(true);
		    
		    img4= new ImageIcon("src/gold.png");	
		    
		    
		    l4=new JLabel();
		    l4.setIcon(img4);
		    l4.setBounds(766,320,100,100);
		    l4.setBackground(new Color(85, 113, 116));
		    l4.setOpaque(true);
		    
		    img5= new ImageIcon("src/cash.png");	
		    
		    l5=new JLabel();
		    l5.setIcon(img5);
		    l5.setBounds(1033,320,100,100);
		    l5.setBackground(new Color(85, 113, 116));
		    l5.setOpaque(true);
		    
		c.add(p1);
		c.add(p2);
		p2.add(a);
		p1.add(l);
		p1.add(L);
		p2.add(l1);
		p2.add(l3);
		p2.add(l4);
		p2.add(l5);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		f1.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			f1.dispose();
			Cattle c=new Cattle();
			
		}
		if(e.getSource()==b2) {
			f1.dispose();
			Agri c=new Agri();
		}
		if(e.getSource()==b3) {
			f1.dispose();
			GoldSil c=new GoldSil();
		}
		if(e.getSource()==b4) {
			f1.dispose();
			Cash c=new Cash();
		}
	}
	}
		
	
		