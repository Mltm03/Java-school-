import javax.swing.JOptionPane;
public class Ejem9
{	public static void main(String args[])
		{String CP, CT, E;
		double cf, cp,ct,e, CF;
		CP= JOptionPane.showInputDialog("�Cu�l es tu calificaci�n parcial?");
		CT=JOptionPane.showInputDialog("�Cu�l es tu calificaci�n del taller?");
		E= JOptionPane.showInputDialog("�Cu�l es tu calificaci�n en el examen final?");
		cp= Double.parseDouble(CP);
		cf= Double.parseDouble(CT);
		e= Double.parseDouble(E);
		CF=((cp * 30)+ (cf* 20)+ ( e*50))/100;
		JOptionPane.showMessageDialog(null, "La calificaci�n final del estudiante es:  "+ CF);
		  System.exit(0);
 		}
}
		
		