package semana1Ej1;

public class Ejemplos {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		miValor mivalor;
		mivalor=()->28.6;//crear la lamda.
		System.out.println("un valor constante:"+mivalor.getValor());
		
		miValParam mvp = (n)->1.0/n;
		System.out.println("el inverso de 4 es: "+mvp.getValor(4));

	}

}
