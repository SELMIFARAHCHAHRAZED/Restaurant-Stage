package RestaurantProject.spring.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Reservation {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private  int idRe; 
private String typeevent; 
private int nbrPlaces;
private Date dateRe;
private String nomPlat;
private String description; 

/*@OneToOne

private Utilisateur u;*/
public Reservation() {
	super();
	// TODO Auto-generated constructor stub
}



public String getTypeevent() {
	return typeevent;
}



public void setTypeevent(String typeevent) {
	this.typeevent = typeevent;
}



public String getNomPlat() {
	return nomPlat;
}



@Override
public String toString() {
	return "Reservation [idRe=" + idRe + ", typeevent=" + typeevent + ", nbrPlaces=" + nbrPlaces + ", dateRe=" + dateRe
			+ ", nomPlat=" + nomPlat + ", description=" + description + "]";
}



public void setNomPlat(String nomPlat) {
	this.nomPlat = nomPlat;
}



public String getDescription() {
	return description;
}



public void setDescription(String description) {
	this.description = description;
}



public Reservation(int idRe, String typeevent, int nbrPlaces, Date dateRe, String nomPlat, String description) {
	super();
	this.idRe = idRe;
	this.typeevent = typeevent;
	this.nbrPlaces = nbrPlaces;
	this.dateRe = dateRe;
	this.nomPlat = nomPlat;
	this.description = description;
}



public int getIdRe() {
	return idRe;
}
public void setIdRe(int idRe) {
	this.idRe = idRe;
}

public int getNbrPlaces() {
	return nbrPlaces;
}
public void setNbrPlaces(int nbrPlaces) {
	this.nbrPlaces = nbrPlaces;
}
public Date getDateRe() {
	return dateRe;
}
public void setDateRe(Date dateRe) {
	this.dateRe = dateRe;
}




}
