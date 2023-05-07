package com.cursodia.java16.semana3;

public class Videojuego 
{
	int id_vid;
	int cve_vid;
	String nom_vid;
	int prov_vid;
	String cate_vid;
	float pre_vid;
	int cant_vid;
	public Videojuego(int id_vid, int cve_vid, String nom_vid, int prov_vid, String cate_vid,
			           float pre_vid, int cant_vid)
	{
		this.id_vid = id_vid;
		this.cve_vid = cve_vid;
		this.nom_vid = nom_vid;
		this.prov_vid = prov_vid;
		this.cate_vid = cate_vid;
		this.pre_vid = pre_vid;
		this.cant_vid = cant_vid;
	}
	
	public String toString() 
	{
		return id_vid+"\t\t"+cve_vid+"\t\t"+nom_vid+"\t\t"+prov_vid+"\t\t"+cate_vid+"\t\t"+pre_vid+"\t\t"+cant_vid;
	}

}
