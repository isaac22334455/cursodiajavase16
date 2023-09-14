package formulaGeneral;
import javax.swing.JOptionPane;

public class lanzador {
	public static void main(String[] args) 
	{
		double A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese A: "));
		double B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese B: "));
		double C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese C: "));
		DentroRaiz dr = (a,c) ->
		{	
			double resul=4-(4*(a*c));
			return resul;
		};
		SacarRaiz sr = (r)-> r > 0;
		Divicion x1 = (b,a,res) ->
		{
			double resul = ((-1*b)+res)/(2*a);
			return resul;
		};
		Divicion x2 = (b,a,res) ->
		{
			double resul = ((-1*b)-res)/(2*a);
			return resul;
		};
		
		if(sr.calc(dr.calc(A, C)))
		{
			double res=Math.sqrt(dr.calc(A,C));
			System.out.println("El resultado de x1 es: "+x1.calc(B, A, res));
			System.out.println("El resultado de x1 es: "+x2.calc(B, A, res));
		}
		else
		{
			System.out.println("no se puede sacar raiz a numeros imaginarios");	
		}
		
	}
}
