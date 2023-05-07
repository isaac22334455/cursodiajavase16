package beans;

public class Videojuego 
{
	int cve_vid;
	String tit_vid;
	String gen_vid;
	int cveprov_vid;
	float pre_vid;
	int inv_vid;
	
	public Videojuego(int cve_vid, String tit_vid, String gen_vid, int cveprov_vid, float pre_vid, int inv_vid) 
	{
		this.cve_vid = cve_vid;
		this.tit_vid = tit_vid;
		this.gen_vid = gen_vid;
		this.cveprov_vid = cveprov_vid;
		this.pre_vid = pre_vid;
		this.inv_vid = inv_vid;
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
