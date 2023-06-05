package RestaurantProject.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import RestaurantProject.spring.Entities.Employer;
import RestaurantProject.spring.Reposetory.EmployerRepository;
import RestaurantProject.spring.Services.EmployerServices;

@RestController
@CrossOrigin("http://localhost:4200")


public class EmployerController {

	@Autowired
	EmployerServices emSer;
	@Autowired
	EmployerRepository emrep; 
	@ResponseBody
	@PostMapping("/addEmployer")
	public Employer addEmp(@RequestBody Employer e) {
		  return emSer.addEm(e);
	}
	
	@PostMapping("/addListEmployer")
	   public List<Employer> addlisteEmployer( @RequestBody List<Employer> lem){
		return emSer.addlisteEmp(lem);
	}
	@PostMapping("/addemplwithTestTel")
	   public String addEmpTestTelephone( @RequestBody Employer emp) {
		return emSer.addEmpTestTel(emp);
		   
	   }
	@PostMapping("/updateemployer/{idEmp}")
	   public Employer updateEmployer(@RequestBody Employer emp,  @PathVariable("idEmp") Integer idEmp) {
		return emSer.updateEmp(emp, idEmp)
		   ;
	   }
	 @DeleteMapping("/deleteEmployer")
	   public void deleteEmp(@Param("idEmp") Integer  idEmp) {
		 emSer.deleteEmployer(idEmp);
		 
	   }
	 @GetMapping("/gettallemployers")
	   public List<Employer> getAllEmployer(){
		return emSer.getAllEmployer();
	   }
	 @GetMapping("/getemployerbyjob/{ch}")
	   public List<Employer> getEmployerByJob( @PathVariable String ch ){
		   return emSer.getEmployerByJob(ch);
	   }
	 @PostMapping("/addfileempl/{idEmp}")
	 public Employer addfile(@PathVariable("idEmp")  Integer idEmp, @RequestParam MultipartFile file  ) {
		 return emSer.addFile(idEmp,file);
	 }

}
