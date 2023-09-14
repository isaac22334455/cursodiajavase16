package semana1Ej2;

public class LamdaDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		pruebaNum esDiv=(n,d)->(n%d)==0;
		
		if(esDiv.prueba(10, 2))
			System.out.println("2 es divisor de 10");
		
		pruebaNum menorque=(n,m)->(n<m);
		if(menorque.prueba(2, 10))
			System.out.println("2 es menor que 10");
		
		pruebaNum igualAbs=(z,x)->(z < 0 ? -z : z) == ( x < 0 ? -x : x);
		if(igualAbs.prueba(4, -4))
			System.out.println("los vaores absolutos son iguales");

	}

}
