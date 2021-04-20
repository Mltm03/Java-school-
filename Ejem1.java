import javax.swing.JOptionPane;
public class Ejem1
{	public static void main(String args[])
		{ String n1, n2;
		  int num1,num2,suma;
		  n1=JOptionPane.showInputDialog("captura un numero: ");
		  n2=JOptionPane.showInputDialog("captura un numero: ");
		  num1= Integer.parseInt(n1);
		  num2= Integer.parseInt(n2);
		  suma= num1+num2;
		  JOptionPane.showMessageDialog(null,"La suma es: "+ suma);
		  System.exit(0);
 		}
}