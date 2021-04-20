import javax.swing.JOptionPane;
public class Ejem3
{	public static void main(String args[])
   {String cal1, cal2, cal3, name;
    float p,a,b,c;
    cal1=JOptionPane.showInputDialog("Introduce tu calificación: ");
    cal2=JOptionPane.showInputDialog("Introduce tu calificación: ");
    cal3=JOptionPane.showInputDialog("Introduce tu calificación: ");
    name=JOptionPane.showInputDialog("¿Cual es tu nombre? ");
    a=Float.parseFloat(cal1);
    b=Float.parseFloat(cal2);
    c=Float.parseFloat(cal3);
    p= (a+b+c)/3;
    JOptionPane.showMessageDialog(null, "Hola "+ name + " tu promedio es "+ p);
    System.exit(0);
 		}
}
   
   