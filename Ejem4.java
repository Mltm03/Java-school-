import javax.swing.JOptionPane;
public class Ejem4
{	public static void main(String args[])
		{ String Ag1, Ag2, Ag1c, Ag2c;
		  int suma, venta1, venta2,v1,v2;
		  float ing;
		  Ag1=JOptionPane.showInputDialog("�C�al es tu nombre?") ;
		  Ag2=JOptionPane.showInputDialog("�C�al es tu nombre?");
		  Ag1c=JOptionPane.showInputDialog("�Cu�ntas computadoras vendiste?");
		  Ag2c=JOptionPane.showInputDialog("�Cu�ntas computadoras vendiste?");
		  v1= Integer.parseInt(Ag1c);
		  v2=Integer.parseInt(Ag2c);
		  suma= v1+v2;
		  venta1=v1*8700;
		  venta2=v2*8700;
		  ing=(venta1+venta2)*.8f;
		  JOptionPane.showMessageDialog(null, "Se vendieron "+ suma + " computadoras");
		  JOptionPane.showMessageDialog(null, "El monto de venta del agente "+Ag1+ " fue de "+venta1);
		  JOptionPane.showMessageDialog(null, "El monto de venta del agente "+Ag2+ " fue de "+venta2);
		  JOptionPane.showMessageDialog(null, "El ingreso de la empresa fue de: "+ing);
		   System.exit(0);
		}
}