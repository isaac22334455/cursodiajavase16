package semana1Ej4;

public class DemoLam 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FUncNum divpeq = (n) ->
		{
			int res=1;
			n = n < 0 ? -n : n;
			for(int i=2; i<=n/i; i++)
			{
				if((n%i)==0)
				{
					res=i;
					break;
				}
			}
			return res;
		};
		System.out.println("el divisor mas pequeño de 12 es: "+divpeq.func(12));

	}

}
