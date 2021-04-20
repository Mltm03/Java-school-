import javax.swing.JOptionPane;
public class Ejem7
{	public static void main(String args[])
		{String R,R2;
	    float A,V,a,v; 
		R=JOptionPane.showInputDialog("¿Cual es el radio de la circunferencia?" );
		R2=JOptionPane.showInputDialog(" Cual es el radio de la esfera?"); 
		a=Float.parseFloat(R);
		v=Float.parseFloat(R2);
		A=3.1416f*(a*a);
		V=(4*3.1416f)*(v*v*v)/3;
		JOptionPane.showMessageDialog(null, "El area de la circunferencia es "+ A +  "  y el volumen de la esfera es "+V);
		System.exit(0);
		}
}
		