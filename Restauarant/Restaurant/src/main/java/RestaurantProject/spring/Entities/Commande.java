package RestaurantProject.spring.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Commande {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int idCommande; 
	 private String etatC;
	 private String livraison; 
	 private String modePayement;
	 private String nomPlat;
	 private int  prixC;
	 private int qte;
	/* @OneToOne()
	    @JoinColumn(name = "plat_idP", nullable = true)
	    private Plat plat;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Plat getPlat() {
		return plat;
	}


	public void setPlat(Plat plat) {
		this.plat = plat;
	}*/


	


	

	public int getIdCommande() {
		return idCommande;
	}
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public String getEtatC() {
		return etatC;
	}
	public void setEtatC(String etatC) {
		this.etatC = etatC;
	}
	public String getLivraison() {
		return livraison;
	}
	public void setLivraison(String livraison) {
		this.livraison = livraison;
	}
	public String getModePayement() {
		return modePayement;
	}
	public void setModePayement(String modePayement) {
		this.modePayement = modePayement;
	}
	public String getNomPlat() {
		return nomPlat;
	}
	public void setNomPlat(String nomPlat) {
		this.nomPlat = nomPlat;
	}
	
	public int getPrixC() {
		return prixC;
	}
	public void setPrixC(int prixC) {
		this.prixC = prixC;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public Commande(int idCommande, String etatC, String livraison, String modePayement, String nomPlat, int prixC,
			int qte) {
		super();
		this.idCommande = idCommande;
		this.etatC = etatC;
		this.livraison = livraison;
		this.modePayement = modePayement;
		this.nomPlat = nomPlat;
		this.prixC = prixC;
		this.qte = qte;
	}
	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", etatC=" + etatC + ", livraison=" + livraison
				+ ", modePayement=" + modePayement + ", nomPlat=" + nomPlat + ", prixC=" + prixC + ", qte=" + qte + "]";
	}


	
	
	  
	  
	  
	  
	  
}
