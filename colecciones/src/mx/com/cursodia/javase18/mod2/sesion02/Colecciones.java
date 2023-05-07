package mx.com.cursodia.javase18.mod2.sesion02;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Colecciones 
{
		List<Articulo> lista = new ArrayList<Articulo>();
		public static void main(String[] args) 
		{
			Colecciones col = new Colecciones();
			col.lista.add(new Articulo(1, "Lavadora", 15200.5f, 4));
			col.lista.add(new Articulo(2, "Television", 19200.5f, 4));
			col.lista.add(new Articulo(3, "Sofa", 13400.5f, 4));
			col.lista.add(new Articulo(4, "Estufa", 5200.5f, 4));
			col.lista.add(new Articulo(5, "Calentador", 200.5f, 4));
			col.listas();
		}
		//leervsobre interfaz comparator // comparable
		private void listas()
		{
			//long t1 = System.currentTimeMillis();
			long t1 = System.nanoTime();
			lista.sort(Comparator.comparing(Articulo::getNombre)
					);
			Iterator<Articulo> i = lista.iterator();
			while(i.hasNext())
			{
				Articulo a = i.next();
				System.out.println(a.getId()+" || "+a.getNombre()+" || "+a.getPrecio()+" || "+a.getInventario());
			//	if(a.getId() == 3)
				//{
					//i.remove();
				//}
			}
			System.out.println("=============================================");
			for(Articulo a:lista)
			{
				System.out.println(a.getId()+" || "+a.getNombre()+" || "+a.getPrecio()+" || "+a.getInventario());
			}
			long t2 = System.nanoTime();
			System.out.println("=============================================");
			System.out.println("El tiempo del proceso es: "+(t2-t1));
		}
	}

	class Articulo
	{
		private int id;
		private String nombre;
		private float precio;
		private int inventario;
		public Articulo(int id, String nombre, float precio, int inventario) 
		{
			this.id = id;
			this.nombre = nombre;
			this.precio = precio;
			this.inventario = inventario;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public float getPrecio() {
			return precio;
		}
		public void setPrecio(float precio) {
			this.precio = precio;
		}
		public int getInventario() {
			return inventario;
		}
		public void setInventario(int inventario) {
			this.inventario = inventario;
		}
}


