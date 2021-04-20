import javax.swing.JOptionPane;
public class Ejem6
{	public static void main(String args[])
		{String tn;
		int c,tg;
		tn=JOptionPane.showInputDialog("cuantos niños detecto la encuesta? ");
		c= Integer.parseInt(tn);
		tg= c/5;
		JOptionPane.showMessageDialog(null,"El total de guarderias es "+ tg);
		  System.exit(0);
 		}
}