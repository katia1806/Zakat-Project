import javax.swing.*;

public class calcul1 {
	
	JOptionPane JP1=new JOptionPane();
	static int x=0,y=0; 
	static String Z;
	
	public static void cham(int Q)
	{	
		if ( Q<0 ) {
			
			JOptionPane.showMessageDialog(null, "This number can't be accepted! Please try again.", "Zakat worth", JOptionPane.ERROR_MESSAGE);
			
		}
		else if(Q<5) {
		
			JOptionPane.showMessageDialog(null,"You don't have to pay anything.", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);
		}
		else if((5<=Q) & (Q<=24)) {
			int v=Q/5;
			String c=Integer.toString(v);
			Z= c+"C";
			
		}
		else if((25<=Q) & (Q<=35)) {
			Z="1M";
		}
		else if((36<=Q) & (Q<=45)) {
			Z="1L";
		}
		else if((46<=Q) & (Q<=60)) {
			Z="1H";
		}
		else if((61<=Q) & (Q<=75)) {
			Z="1J";
		}
		else if((76<=Q) & (Q<=90)) {
			Z="2L";
		}
		else if((91<=Q) & (Q<=120)) {
			Z="2H";
		}
		else{
			Q=(Q/10)*10; // interval a respecter 
			
			
			if(Q%50==0) { 
				x=Q/50;
				String X=Integer.toString(x);
				Z=X+"H";
			
				}
			else if(Q%40==0) {
				y=Q/40;
				String Y=Integer.toString(y);
				Z=Y+"L";
				
			    }
			else {
				while( Q%50 != 0 ){
					Q=Q-40;
					y++;          }
			x=Q/50;
			String X=Integer.toString(x);
			String Y=Integer.toString(y);
			Z=X+"H"+" & "+Y+"L";
		}
	 }
  }
}

		
		

	

