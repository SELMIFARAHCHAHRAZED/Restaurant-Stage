package RestaurantProject.spring.Services;


import java.util.List;

import RestaurantProject.spring.Entities.Employer;
import RestaurantProject.spring.Entities.Plat;
import RestaurantProject.spring.Entities.Utilisateur;

public interface IEmployerServices {
	public Employer addEm(Employer e);
	public List<Employer>addlisteEmp(List<Employer>lem);
	public String addEmpTestTel(Employer emp);
	public Employer updateEmp(Employer emp , Integer  idEmp);
	public void deleteEmployer(Integer  idEmp  );
	public List<Employer> getAllEmployer(); 
	public List<Employer> getEmployerByJob(String ch);
	
}
