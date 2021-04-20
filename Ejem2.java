import javax.swing.JOptionPane;
public class Ejem2
{	public static void main(String args[])
	   { String p;
	     float pulg,cm; 
	     p=JOptionPane.showInputDialog("Introduce las pulgadas que convertiras a centimetros: ");
	     pulg=  Float.parseFloat(p);
	   	 cm= pulg*2.54f;
	     JOptionPane.showMessageDialog(null,"La cantidad de: "+ p + " pulgadas que se convertio a centimetros es igual a: "+ cm);
	     System.exit(0);
 		}
}