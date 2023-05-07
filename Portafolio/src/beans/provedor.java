package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="provedor")
public class provedor 
{
	@Id @GeneratedValue
	int cve_prov;
	String nom_prov;
	String tel_prov;
	String email_prov;
	String dir_prov;
	
	//@JoinColumn(name="cveprov_vid")
	public provedor(int cve_prov, String nom_prov, String tel_prov, String email_prov, String dir_prov) 
	{
		this.cve_prov = cve_prov;
		this.nom_prov = nom_prov;
		this.tel_prov = tel_prov;
		this.email_prov = email_prov;
		this.dir_prov = dir_prov;
	}
	
	public provedor()
	{
		
	}

	public String getNom_prov() {
		return nom_prov;
	}

	public void setNom_prov(String nom_prov) {
		this.nom_prov = nom_prov;
	}

	public String getTel_prov() {
		return tel_prov;
	}

	public void setTel_prov(String tel_prov) {
		this.tel_prov = tel_prov;
	}

	public String getEmail_prov() {
		return email_prov;
	}

	public void setEmail_prov(String email_prov) {
		this.email_prov = email_prov;
	}

	public String getDir_prov() {
		return dir_prov;
	}

	public void setDir_prov(String dir_prov) {
		this.dir_prov = dir_prov;
	}

	public int getCve_prov() {
		return cve_prov;
	}

}
