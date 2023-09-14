package semana4;

public class Factura 
{
	String concepto;
	float importe;
	public Factura(String concepto, float importe) 
	
	{
		super();
		this.concepto = concepto;
		this.importe = importe;
	}
	
	public String getConcepto() 
	{
		return concepto;
	}
	public void setConcepto(String concepto) 
	{
		this.concepto = concepto;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) 
	{
		this.importe = importe;
	}
	public String toString()
	{
		return concepto+"\t"+importe;
	}
}
