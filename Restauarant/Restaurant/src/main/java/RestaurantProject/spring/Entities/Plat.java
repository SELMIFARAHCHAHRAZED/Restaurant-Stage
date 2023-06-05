package RestaurantProject.spring.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Plat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idP; 
	
	private String nomP; 
	private String descriptionP;
	private float prixP;
	private String imageP;
	
	/* @OneToOne(
	            mappedBy = "plat")
	    private Commande commande;*/
	

	public Plat() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Plat [idP=" + idP + ", nomP=" + nomP + ", descriptionP=" + descriptionP + ", prixP=" + prixP
				+ ", imageP=" + imageP + "]";
	}

	public Plat(int idP, String nomP, String descriptionP, float prixP, String imageP) {
		super();
		this.idP = idP;
		this.nomP = nomP;
		this.descriptionP = descriptionP;
		this.prixP = prixP;
		this.imageP = imageP;
	}

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public String getNomP() {
		return nomP;
	}

	public void setNomP(String nomP) {
		this.nomP = nomP;
	}

	public String getDescriptionP() {
		return descriptionP;
	}

	public void setDescriptionP(String descriptionP) {
		this.descriptionP = descriptionP;
	}

	public float getPrixP() {
		return prixP;
	}

	public void setPrixP(float prixP) {
		this.prixP = prixP;
	}

	public String getImageP() {
		return imageP;
	}

	public void setImageP(String imageP) {
		this.imageP = imageP;
	}

	
	

}
