package RestaurantProject.spring.Entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Filee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int idfile; 
   private String typefile; 
   private String title; 
   @Column(length = 990000000)
   private byte[] taillefile;
   
  /*public Plat getPlat() {
	return plat;
}
public void setPlat(Plat plat) {
	this.plat = plat;
}

@OneToOne(mappedBy="file")
   private Plat plat; */
public Filee() {
	super();
	// TODO Auto-generated constructor stub
}
public Filee(int idfile, String typefile, String title, byte[] taillefile) {
	super();
	this.idfile = idfile;
	this.typefile = typefile;
	this.title = title;
	this.taillefile = taillefile;
}
public int getIdfile() {
	return idfile;
}
public void setIdfile(int idfile) {
	this.idfile = idfile;
}
public String getTypefile() {
	return typefile;
}
public void setTypefile(String typefile) {
	this.typefile = typefile;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public byte[] getTaillefile() {
	return taillefile;
}
public void setTaillefile(byte[] taillefile) {
	this.taillefile = taillefile;
}
@Override
public String toString() {
	return "Filee [idfile=" + idfile + ", typefile=" + typefile + ", title=" + title + ", taillefile="
			+ Arrays.toString(taillefile) + "]";
}
public Filee(String typefile, String title, byte[] taillefile) {
	super();
	this.typefile = typefile;
	this.title = title;
	this.taillefile = taillefile;
} 
   
   
}
