
import javax.swing.JOptionPane;

public class calcul4 {
	static String Z;
	static double I;
	public static void cham(double Q)
	{	
		if ( Q<=0 ) {
			
			JOptionPane.showMessageDialog(null, "This number can't be accepted! Please try again.", "Zakat worth", JOptionPane.ERROR_MESSAGE);
			
		}
		else 
		I=(Q*10.0)/100;
		Z=Double.toString(I);
     
}
	}
