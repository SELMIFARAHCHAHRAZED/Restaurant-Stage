package RestaurantProject.spring.Entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Reclam {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int  idRec; 
private String typeRec; 
private String descriptionRec;
public Reclam() {
	super();
	// TODO Auto-generated constructor stub
}







public Reclam(int idRec, String typeRec, String descriptionRec) {
	super();
	this.idRec = idRec;
	this.typeRec = typeRec;
	this.descriptionRec = descriptionRec;
}







public int getIdRec() {
	return idRec;
}
public void setIdRec(int idRec) {
	this.idRec = idRec;
}
public String getTypeRec() {
	return typeRec;
}
public void setTypeRec(String typeRec) {
	this.typeRec = typeRec;
}


public String getDescriptionRec() {
	return descriptionRec;
}

public void setDescriptionRec(String descriptionRec) {
	this.descriptionRec = descriptionRec;
}







@Override
public String toString() {
	return "Reclam [idRec=" + idRec + ", typeRec=" + typeRec + ", descriptionRec=" + descriptionRec + "]";
}







}
