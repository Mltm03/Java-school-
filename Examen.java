public class Examen 
{
	int ClaveAr,Sucursal; 
	String NombreArt,NombreVend;
	float Precios[]=new float[2];
	float CantVen[]=new float[2]; 	
	
	public Examen()
	{
	}
	
	public Examen(int ClaveAr2,int Sucursal2, String NombreArt,String NombreVend,float precios2[], float CantVen2[])
	{
		
		
		
		ClaveAr=ClaveAr2; 
		Sucursal=Sucursal2; 
		this.NombreArt=NombreArt; 
		this.NombreVend=NombreVend;
		
		for(int z=0;z<2;z++)
		{
			Precios[z]=precios2[z]; 
			CantVen[z]=CantVen2[z];
		}
	
	}

	
	
	//Entrada de datos 
		public void LeerDatos(Examen [] datos, int n)
	{
		Teclado t= new Teclado(); 
		Examen met=new Examen();
		int c1,c2; 
		for(c1=0;c1<n;c1++)//Articulos 
		{
			System.out.println("Clave del articulo"); 
			met.ClaveAr=t.leeInt();
			
			System.out.println("Sucursal"); 
			met.Sucursal=t.leeInt();
			
			System.out.println("Nombre del articulo");
			met.NombreArt=t.leeString(); 
				
			System.out.println("Nombre del vendedor");
			met.NombreVend=t.leeString(); 
			
			for(c2=0;c2<n;c2++)
			
		//precios y cantidades vendidas 
		{	
				System.out.println("Precio del articulo: "); 
				met.Precios[c2]=t.leeFloat();
				
				System.out.println("Cantidades vendidas: "); 
				met.CantVen[c2]=t.leeFloat(); 
				
		}	
			
		datos[c1]=new Examen(met.ClaveAr,met.Sucursal,met.NombreArt,met.NombreVend,met.Precios,met.CantVen); 
	
		}
	
		return; 	
	}
	
	
	//Buscando el mayor precio y menor cantidad vendida 
	public float[] Mayor(int n, Examen[] x)
	{
		float y[]=new float[2];
		int f,c;			
		float mayp=Float.MIN_VALUE;
		float mencan=Float.MAX_VALUE;
		//resp[0] mayp
		//reso[1]memnxan
		for(f=0;f<n;f++) // articulos
		{	for(c=0;c<n;c++)//precios y ventas
			{if(x[f].Precios[c]>mayp)
			{
				mayp=x[f].Precios[c];			
			}
			if(x[f].CantVen[c]<mencan)
			{
				mencan=x[f].CantVen[c];	
				
			}
			}
			
		}
		y[0]=mayp;
		y[1]=mencan;
		
	return(y); 	
	}

	public void imp(float [] z,int c,Examen[] x)
	{
		
		System.out.println("El precio mayor es: "+ z[0]); 
		System.out.println("La cantidad menor vendida es: "+ z[1]);
		System.out.println("La sucursal usada"+x[c].Sucursal+ "se repite "+ c +" veces");
	
	}
	
	
	public int nombre(int n, Examen[] x)
	{
		
	
		int f,c;
		int contador=0;
	
		c=0;	
				if((x[c].NombreVend.compareTo("Juan")==0)||(x[c].NombreVend.compareTo("Pedro")==0))
				{
					System.out.println("El vendedor fue"+x[c].NombreVend);	
				
				}
				if((x[c].Sucursal==2 )|| (x[c].Sucursal==4)||(x[c].Sucursal==6))
				{
					contador++;
				}
			
	
	
	return(contador); 	
	}
	
	
	
	


	public static void main(String args[])
	{
		Examen met; 
		met=new Examen(); 
	 
		Teclado t=new Teclado(); 
		int n=2;
		 
		
		Examen vector[]=new Examen[2]; 
		
		float x[]=new float[2];
		int c;
		//---------------------------
		
	
		
		met.LeerDatos(vector,n);
	
	
			
			
		
		x=met.Mayor(n,vector);  
		
		c=met.nombre(n,vector);
		met.imp(x,c,vector); 

	
	}
	
}