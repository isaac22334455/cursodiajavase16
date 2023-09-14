package semana1Ej3;

public class Demo3 {

	public static void main(String[] args) 
	{
		STringTest esParte = (a,b)->a.indexOf(b) !=-1;
		String str ="Esto es una prueba";
		if(esParte.prueba(str, "es una"))
		
		System.out.println("es una, encontrado");
		else
		System.out.println("es una, no encontrada");
	}

}
