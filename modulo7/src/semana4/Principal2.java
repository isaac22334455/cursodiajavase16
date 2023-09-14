package semana4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Principal2 
{
	public static void main(String[] args) 
	{
		ArrayList<Factura> fact = new ArrayList<Factura>();
		fact.add(new Factura("consola",7500f));
		fact.add(new Factura("television",500f));
		fact.add(new Factura("pc",8500f));
		//List no se puede instancear...
		List<Factura> list = fact;
		//implementar predicados personalizados
		Predicate<Factura> predicado = new Predicate<Factura>()
		{
			@Override
			public boolean test(Factura f)
			{
				return f.getImporte()>7500;
			}
		};
		list.stream().filter(predicado).forEach(System.out::println);
	}
	
}
