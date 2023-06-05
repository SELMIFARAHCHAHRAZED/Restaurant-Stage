package RestaurantProject.spring.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Employer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmp;
	 private String nomEm; 
	private String prenomEmp; 
	private String adresseEmp; 
	//private String picEmp; 
	private String jobEm; 
	private float salaire;
	private int telephonep;
	

  /*  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idjob", referencedColumnName = "idjob")
    @JsonIgnoreProperties("jobList")
    private Job Job;*/
	public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employer(int idEmp, String nomEm, String prenomEmp, String adresseEmp, String jobEm,
			float salaire, int telephonep) {
		super();
		this.idEmp = idEmp;
		this.nomEm = nomEm;
		this.prenomEmp = prenomEmp;
		this.adresseEmp = adresseEmp;
		//this.picEmp = picEmp;
		this.jobEm = jobEm;
		this.salaire = salaire;
		this.telephonep = telephonep;
	}
	
/*	public Employer(int idEmp, String nomEm, String prenomEmp, String adresseEmp, String jobEm, float salaire,
			int telephonep, RestaurantProject.spring.Entities.Job job) {
		super();
		this.idEmp = idEmp;
		this.nomEm = nomEm;
		this.prenomEmp = prenomEmp;
		this.adresseEmp = adresseEmp;
		this.jobEm = jobEm;
		this.salaire = salaire;
		this.telephonep = telephonep;
		Job = job;
	}
	public Job getJob() {
		return Job;
	}
	public void setJob(Job job) {
		Job = job;
	}*/
	/*@Override
	public String toString() {
		return "Employer [idEmp=" + idEmp + ", nomEm=" + nomEm + ", prenomEmp=" + prenomEmp + ", adresseEmp="
				+ adresseEmp + ", jobEm=" + jobEm + ", salaire=" + salaire + ", telephonep=" + telephonep + "]";
	}*/
	public String getJobEm() {
		return jobEm;
	}
	
	@Override
	public String toString() {
		return "Employer [idEmp=" + idEmp + ", nomEm=" + nomEm + ", prenomEmp=" + prenomEmp + ", adresseEmp="
				+ adresseEmp + ", jobEm=" + jobEm + ", salaire=" + salaire + ", telephonep=" + telephonep + "]";
	}
	public void setJobEm(String jobEm) {
		this.jobEm = jobEm;
	}
	public int getIdEmp() {
		return idEmp;
	}
	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}
	public String getNomEm() {
		return nomEm;
	}
	public void setNomEm(String nomEm) {
		this.nomEm = nomEm;
	}
	public String getPrenomEmp() {
		return prenomEmp;
	}
	public void setPrenomEmp(String prenomEmp) {
		this.prenomEmp = prenomEmp;
	}
	public String getAdresseEmp() {
		return adresseEmp;
	}
	public void setAdresseEmp(String adresseEmp) {
		this.adresseEmp = adresseEmp;
	}
	
/*	public String getJobEm() {
		return jobEm;
	}
	public void setJobEm(String jobEm) {
		this.jobEm = jobEm;
	}*/
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public int getTelephonep() {
		return telephonep;
	}
	public void setTelephonep(int telephonep) {
		this.telephonep = telephonep;
	}
	//@Override
	/*public String toString() {
		return "Employer [idEmp=" + idEmp + ", nomEm=" + nomEm + ", prenomEmp=" + prenomEmp + ", adresseEmp="
				+ adresseEmp + ", salaire=" + salaire + ", telephonep=" + telephonep + ", Job=" + Job + "]";
	}*/
	
	
}
