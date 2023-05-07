package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="videojuegos")
public class Videojuego 
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int cve_vid;
	String tit_vid;
	String gen_vid;
	@ManyToOne
	@JoinColumn(name="cveprov_vid",insertable=false,updatable=false)//especificando que desde aqui no se puede actualizar un proveedor
	private provedor provedor;//lo que decimos es que ademas de conectarse tiene que tener una copia
	
	int cveprov_vid;
	float pre_vid;
	int inv_vid;
	
	public Videojuego( String tit_vid, String gen_vid, int cveprov_vid, float pre_vid, int inv_vid) 
	{
		
		this.tit_vid = tit_vid;
		this.gen_vid = gen_vid;
		this.cveprov_vid = cveprov_vid;
		this.pre_vid = pre_vid;
		this.inv_vid = inv_vid;
	}
	
	public Videojuego()
	{
	}
	
	public provedor getprovedor()//para regresar ese provedor y le sacamos la propiedad nombre en este caso
	{
		return provedor;	
	}
	
	public int getCve_vid() {
		return cve_vid;
	}

	public String getTit_vid() {
		return tit_vid;
	}

	public void setTit_vid(String tit_vid) {
		this.tit_vid = tit_vid;
	}

	public String getGen_vid() {
		return gen_vid;
	}

	public void setGen_vid(String gen_vid) {
		this.gen_vid = gen_vid;
	}

	public int getCveprov_vid() {
		return cveprov_vid;
	}

	public void setCveprov_vid(int cveprov_vid) {
		this.cveprov_vid = cveprov_vid;
	}

	public float getPre_vid() {
		return pre_vid;
	}

	public void setPre_vid(float pre_vid) {
		this.pre_vid = pre_vid;
	}

	public int getInv_vid() {
		return inv_vid;
	}

	public void setInv_vid(int inv_vid) {
		this.inv_vid = inv_vid;
	}
}
