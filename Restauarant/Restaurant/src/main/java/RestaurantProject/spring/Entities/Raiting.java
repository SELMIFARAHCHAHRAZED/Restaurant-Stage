package RestaurantProject.spring.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Raiting {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idrate; 
	private String  nomPlat; 
	private  String nomU; 
	private String prenomU; 
	private int note;
	public Raiting() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Raiting(int idrate, String nomPlat, String nomU, String prenomU, int note) {
		super();
		this.idrate = idrate;
		this.nomPlat = nomPlat;
		this.nomU = nomU;
		this.prenomU = prenomU;
		this.note = note;
	}
	public int getIdrate() {
		return idrate;
	}
	public void setIdrate(int idrate) {
		this.idrate = idrate;
	}
	public String getNomPlat() {
		return nomPlat;
	}
	public void setNomPlat(String nomPlat) {
		this.nomPlat = nomPlat;
	}
	public String getNomU() {
		return nomU;
	}
	public void setNomU(String nomU) {
		this.nomU = nomU;
	}
	public String getPrenomU() {
		return prenomU;
	}
	public void setPrenomU(String prenomU) {
		this.prenomU = prenomU;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "raiting [idrate=" + idrate + ", nomPlat=" + nomPlat + ", nomU=" + nomU + ", prenomU=" + prenomU
				+ ", note=" + note + "]";
	} 
	
}
