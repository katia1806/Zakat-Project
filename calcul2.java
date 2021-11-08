import javax.swing.*;

public class calcul2 {

	JOptionPane JP1=new JOptionPane();
	static int x=0,y=0; 
	static String Z;
	
	public static void cham(int Q)
	{	
		
		if(Q<30) {
		
			JOptionPane.showMessageDialog(null,"You don't have to pay anything.", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);
		}
		else if((30<=Q) & (Q<=39)) {
			Z="T";
			
		}
		else if((40<=Q) & (Q<=59)) {
			Z="Mo";
		}
		else if((60<=Q) & (Q<=69)) {
			Z="2T";
		}
		else if((70<=Q) & (Q<=79)) {
			Z="Mo & T";
		}
		else if((80<=Q) & (Q<=89)) {
			Z="2Mo";
		}
		else if((90<=Q) & (Q<=99)) {
			Z="3T";
		}
		else if((100<=Q) & (Q<=119)) {
			Z="Mo & 2T";
		}
		else if((120<=Q) & (Q<=129)) {
			Z="3Mo or 4T ";
		}
		else{
			Q=(Q/10)*10; // interval a respecter 
			
			
			if(Q%40==0) { 
				x=Q/40;
				String X=Integer.toString(x);
				Z=X+"Mo";
			
				}
			else if(Q%30==0) {
				y=Q/30;
				String Y=Integer.toString(y);
				Z=Y+"T";
				
			    }
			else {
				while( Q%40 != 0 ){
					Q=Q-30;
					y++;          }
			x=Q/40;
			String X=Integer.toString(x);
			String Y=Integer.toString(y);
			Z=X+"Mo"+" & "+Y+"T";
		}
	 }
  }
}
