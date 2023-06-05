package RestaurantProject.spring.Services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import RestaurantProject.spring.Entities.Commande;
import RestaurantProject.spring.Entities.Employer;
import RestaurantProject.spring.Entities.Filee;
import RestaurantProject.spring.Reposetory.EmployerRepository;
 @Service
public class EmployerServices implements IEmployerServices {

	 @Autowired
	 EmployerRepository emprep; 
	 FileeServices fileServ; 
	 @Override
	public Employer addEm(Employer e) {
		// TODO Auto-generated method stub
		return emprep.save(e) ;
	}
	@Override
	public List<Employer> addlisteEmp(List<Employer> lem) {
		// TODO Auto-generated method stub
		 return (List<Employer>)emprep.saveAll(lem);
	}
	@Override
	public String addEmpTestTel(Employer emp) {
		// TODO Auto-generated method stub
		String ch="";
		if( emprep.existsByTelephonep(emp.getTelephonep()))
		{
			ch="employer existe deja  !!!!";
		}
		else {
			emprep.save(emp);
			ch="employer ajouté";
		}
		return ch;
	}
	@Override
	public Employer updateEmp(Employer emp, Integer idEmp) {
		// TODO Auto-generated method stub
		Employer employer= emprep.findById(idEmp).get();
		//employer.setJobEm(emp.getJobEm());
		employer.setSalaire(emp.getSalaire());
		emprep.save(emp);
		return employer; 
	}
	@Override
	public void deleteEmployer(Integer idEmp) {
		// TODO Auto-generated method stub
		emprep.deleteById(idEmp);
	}
	@Override
	public List<Employer> getAllEmployer() {
		// TODO Auto-generated method stub
		return (List<Employer>)emprep.findAll();
	}
	@Override
	public List<Employer> getEmployerByJob(String ch) {
		// TODO Auto-generated method stub
		 return emprep.ListEmployer(ch);}
	
	public Employer addFile(Integer idEmp,MultipartFile file) {
       Employer emp= emprep.findById(idEmp).get();
       try {
		Filee f1 =fileServ.uploadFilee(file);
		///emp.setFile(f1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
		return emprep.save(emp);
		
	}

}
