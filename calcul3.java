import javax.swing.JOptionPane;

public class calcul3 {
	JOptionPane JP1=new JOptionPane();
	static int x=0,y=0; 
	static String Z;
	
	public static void cham(int Q)
		
	{
		 if(Q<30) {
		
			JOptionPane.showMessageDialog(null,"You don't have to pay anything.", "Zakat worth", JOptionPane.INFORMATION_MESSAGE);
		}
		else if((40<=Q) & (Q<=120)) {
			Z="C";
			
		}
		else if((121<=Q) & (Q<=200)) {
			Z="2C";
		}
		else if((201<=Q) & (Q<=399)) {
			Z="3C";
		}
		else{
			Q=(Q/10)*10; // interval a respecter 
			
				x=Q/100;
				String X=Integer.toString(x);
				Z=X+"C";
			
				}
}
	}
