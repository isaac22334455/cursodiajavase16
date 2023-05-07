package semana2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class coneccionvideojuegos 
{
	Connection con;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		coneccionvideojuegos cv= new coneccionvideojuegos();
		cv.conectar();
		cv.insertarvid2();
		cv.leervid();
		cv.cerrar();

	}
	
	private void conectar()//conectar a la base de datos
	{
		String servidor= "jdbc:mysql://localhost/games";//string de coneccion games=nombre de la base de datos
		String usuario="supervisor";//usuario que se conectara
		String pass="UkmAG54L";//contraseña
		
		try {
			con=DriverManager.getConnection(servidor,usuario,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(con!=null)
		{
			System.out.println("conectado");
			
		}
		
	}
	
	private void leervid()//leer el contenido de la tabla y mostrarlo
	{
		PreparedStatement pstm=null;
		ResultSet rs=null; //el resulset es parecido a un arreglo, es un array de direcciones de memoria donde poder buscar la informacion en la base de datos
		String query ="SELECT * FROM videojuegos";
		try 
		{
			pstm=con.prepareStatement(query);
			rs=pstm.executeQuery();//ya tengo la informacion en el resulset
			System.out.println("cve\t\ttitulo\t\tgenero\t\tproveedor\t\tprecio\t\texistencias");
			
			while(rs.next())
			{
				System.out.print(rs.getInt("cve_vid")+"\t\t");
				System.out.print(rs.getString("tit_vid")+"\t\t");
				System.out.print(rs.getString("gen_vid")+"\t\t");
				System.out.print(rs.getInt("cveprov_vid")+"\t\t");
				System.out.print(rs.getFloat("pre_vid")+"\t\t");
				System.out.println(rs.getInt("inv_vid")+"\t\t");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			try 
			{
				if(pstm!=null) pstm.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private void cerrar()//cerrar conexion
	{
		
			try 
			{
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private void insertarvid()//metodo1
	{
		//int cve = Integer.parseInt(JOptionPane.showInputDialog("Clave del videojuego:"));
		String tit = JOptionPane.showInputDialog("nombre del videojuego:");
		String gen = JOptionPane.showInputDialog("Categoria:");
		int cveprov = Integer.parseInt(JOptionPane.showInputDialog("Provedor:"));
		float pre = Float.parseFloat(JOptionPane.showInputDialog("Precio del videojuego:"));
		int inv = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a dar de alta:"));
		Statement st=null;
		
		try 
		{
			st= con.createStatement();
			st.executeUpdate("INSERT INTO videojuegos(tit_vid,gen_vid,cveprov_vid,pre_vid,inv_vid) VALUES('"+tit+"','"+gen+"',"+cveprov+","+pre+","+inv+")");
			//los strings les agregue comillas simples aparte por sintaxis.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
				try {
					if(st!=null)st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	private void insertarvid2()
	{
		//se crea la query
		String query = "INSERT INTO videojuegos(tit_vid,gen_vid,cveprov_vid,pre_vid,inv_vid) VALUES(?,?,?,?,?)"; 
		//int cve = Integer.parseInt(JOptionPane.showInputDialog("Clave del videojuego:"));
				String tit = JOptionPane.showInputDialog("nombre del videojuego:");
				String gen = JOptionPane.showInputDialog("Categoria:");
				int cveprov = Integer.parseInt(JOptionPane.showInputDialog("Provedor:"));
				float pre = Float.parseFloat(JOptionPane.showInputDialog("Precio del videojuego:"));
				int inv = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a dar de alta:"));
				
				PreparedStatement pstm=null;
				try 
				{
					//se pasa la query al preparedstatment
					pstm=con.prepareStatement(query);
					//despues se insertan los valores a cada uno de los espacios de los signos de interrogacion
					pstm.setString(1,tit);
					pstm.setString(2,gen);
					pstm.setInt(3,cveprov);
					pstm.setFloat(4,pre);
					pstm.setInt(5,inv);
					
					pstm.execute();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally
				{
					
						try {
							if(pstm!=null)pstm.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
	}
	

}


