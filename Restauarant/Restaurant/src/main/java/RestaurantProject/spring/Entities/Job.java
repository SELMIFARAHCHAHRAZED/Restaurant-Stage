package RestaurantProject.spring.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int  idjob; 
	private String nomjob; 
	private int nbrheures;
	
	
/*	 public List<Employer> getEmploye() {
		return Employe;
	}
	public void setEmploye(List<Employer> employe) {
		Employe = employe;
	}*/
	/*@OneToMany(fetch = FetchType.EAGER, mappedBy = "Job", cascade = CascadeType.ALL)
	    @JsonIgnoreProperties("Job")
	    private List<Employer> Employe = new ArrayList<>();*/
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Job(int idjob, String nomjob, int nbrheures) {
		super();
		this.idjob = idjob;
		this.nomjob = nomjob;
		this.nbrheures = nbrheures;
	}
	public int getIdjob() {
		return idjob;
	}
	public void setIdjob(int idjob) {
		this.idjob = idjob;
	}
	public String getNomjob() {
		return nomjob;
	}
	public void setNomjob(String nomjob) {
		this.nomjob = nomjob;
	}
	public int getNbrheures() {
		return nbrheures;
	}
	public void setNbrheures(int nbrheures) {
		this.nbrheures = nbrheures;
	}
	/*@Override
	public String toString() {
		return "Job [idjob=" + idjob + ", nomjob=" + nomjob + ", nbrheures=" + nbrheures + ", Employe=" + Employe + "]";
	}*/

	@Override
	public String toString() {
		return "Job [idjob=" + idjob + ", nomjob=" + nomjob + ", nbrheures=" + nbrheures + "]";
	}
	
	
}
