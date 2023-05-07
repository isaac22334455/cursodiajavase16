package gestor;

public class lanzador 
{
	public static void main(String[] args) 
	{
		modelo mtv= new modelo();
		VistaPrinsipal vtv= new VistaPrinsipal();
		VistaModificar vtv2= new VistaModificar();
		controlador controlador= new controlador(vtv,mtv,vtv2);

	}


}
