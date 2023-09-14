package semana4;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) 
	{
		ArrayList<Factura> fact = new ArrayList<Factura>();
		fact.add(new Factura("consola",7500f));
		fact.add(new Factura("television",500f));
		fact.add(new Factura("pc",8500f));
		//List no se puede instancear...
		List<Factura> list = fact;
		Optional<Factura> busqueda = list.stream().filter(elemento -> elemento.getImporte()>5000).findFirst();
    	System.out.println(busqueda.get().getConcepto());
		
		list.stream().forEach(System.out::println);
		
		list.stream().filter(f -> f.getImporte()>5000).forEach(System.out::println);
		
		List<Factura>Pc = list.stream().filter(f -> f.getImporte()>5000).collect(Collectors.toList());//collect es para guardar la informacion
		
		
	}
}
