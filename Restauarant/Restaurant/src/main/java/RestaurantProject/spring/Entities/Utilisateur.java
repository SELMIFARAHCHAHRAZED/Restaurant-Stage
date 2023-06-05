package RestaurantProject.spring.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Utilisateur {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private  int idU; 
	 private String nom; 
	 private String login; 
	// private String email; 
	 private String pwd; 
	 private String role; 
	 /*private String addresse;
	 private int telephone;*/
	 
	 
	/* @OneToOne(mappedBy = "user")
	   private Reservation reserv;*/
	 
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(int idU, String nom, String login, String pwd, String role) {
		super();
		this.idU = idU;
		this.nom = nom;
		this.login = login;
		this.pwd = pwd;
		this.role = role;
	}
	public int getIdU() {
		return idU;
	}
	public void setIdU(int idU) {
		this.idU = idU;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Utilisateur [idU=" + idU + ", nom=" + nom + ", login=" + login + ", pwd=" + pwd + ", role=" + role
				+ "]";
	}
	
	
	
	
	 
	 
	 
}
