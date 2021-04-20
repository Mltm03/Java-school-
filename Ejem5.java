import javax.swing.JOptionPane;
public class Ejem5
{	public static void main(String args[])
		{String sm;
		float sd,sh,phx,s;
		double dt,pi,pt;
		sm=JOptionPane.showInputDialog("¿Cúal es su sueldo mensual? ");
		s= Float.parseFloat(sm);
		sd= s/30;
		sh= sd/8;
		dt=21;
		pi=(sd*3)+ (sd*.75*4);
		phx= (sh*2*9)+ (sh*3*6);
		pt=sd*dt+pi+phx;
		JOptionPane.showMessageDialog(null,"El total de percepciones es de "+ pt);
		  System.exit(0);
 		}
}
		