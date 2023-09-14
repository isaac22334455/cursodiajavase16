package semana1Ej5;

public class demol5 {

	public static void main(String[] args) 
	{
		NumDiv md = (m,n) -> 
		{
			m = m < 0 ? -m : m;
			n = n < 0 ? -n : n;
			int div=1;
			
			if(n<m)
			{
				for(int i=2;i<=n;i++)
				{
					if((n%i)==0)
					{
						if((m%i)==0)
						{
							div=i;
							break;
						}
					}
				}
			}
			else
			{
				for(int i=2;i<=m;i++)
				{
					if((m%i)==0)
					{
						if((n%i)==0)
						{
							div=i;
							break;
						}
					}
				}
			}
			
			return div;
		};

		System.out.println("el minimo comun divisor entre 50 y 15 es: "+ md.getval(50, 15));
	}

}
