import javax.swing.JOptionPane;
public class Ejem8
{	public static void main(String args[])
		{String c;
		float Gv, Im, Ct,C;
		c=JOptionPane.showInputDialog("¿Cúal es la suma total del costo del vehículo?");
		C=Float.parseFloat(c);
		Gv= C*.12f;
		Im=C*.06f;
		Ct= C+Gv+Im;
		JOptionPane.showMessageDialog(null," El costo total es de "+ 	Ct);
		System.exit(0);
		}
}
		
		
