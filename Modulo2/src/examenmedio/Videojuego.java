package examenmedio;

public class Videojuego 
{

	int cve_vid;
	String nom_vid;
	int prov_vid;
	String cate_vid;
	float pre_vid;
	int cant_vid;
	public Videojuego( int cve_vid, String nom_vid, int prov_vid, String cate_vid,
			           float pre_vid, int cant_vid)
	{
		
		this.cve_vid = cve_vid;
		this.nom_vid = nom_vid;
		this.prov_vid = prov_vid;
		this.cate_vid = cate_vid;
		this.pre_vid = pre_vid;
		this.cant_vid = cant_vid;
	}
	
	public String toString() 
	{
		return cve_vid+"\t"+nom_vid+"\t"+prov_vid+"\t"+cate_vid+"\t"+pre_vid+"\t"+cant_vid;
	}

}
