package RestaurantProject.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import RestaurantProject.spring.Entities.Job;
import RestaurantProject.spring.Entities.Utilisateur;
import RestaurantProject.spring.Reposetory.EmployerRepository;
import RestaurantProject.spring.Reposetory.JobRepository;
import RestaurantProject.spring.Services.JobServices;

@RestController
@CrossOrigin("http://localhost:4200")
public class JobController {
	
@Autowired
JobServices jobServ;


@Autowired
private  JobRepository jobrep; 
private EmployerRepository emprep; 


@GetMapping("/")
public String home(Model m)
{
	List<Job> job=jobServ.getAllJobs();
	m.addAttribute("job",job);
	return "Job"; 
}
@RequestMapping("/Job/save")
public String saveJob(@ModelAttribute Job Job) {
	jobServ.addjob(Job);
	
return "Job"; 
}

@PostMapping("/addjob")
public Job addjob( @RequestBody Job j) {
	  return jobServ.addjob(j); 
}

@PostMapping("/addListjobs")
public List<Job> addlisteJobs( @RequestBody List<Job> ljob){
	return jobServ.addlisteJob(ljob); 
	      
}
@PostMapping("/addjobwithtestNomJob")
public String addJobWithTestNomJob( @RequestBody Job j) {
	return jobServ.addJobTestNom(j); 
	   
}

@PostMapping("/updatejob/{idjob}")
public Job updateJob(@RequestBody Job j,  @PathVariable("idjob") Integer idjob) {
	return jobServ.updatejob(j, idjob); 
	   
}
@DeleteMapping("/deletejob")
public void deleteJob(@Param("idjob") Integer  idjob) {
	jobServ.deletejob(idjob); 
}

@GetMapping("/gettalljobs")
public List<Job> getAllJobs(){
	return jobServ.getAllJobs();
}
@GetMapping("/getjobbyid/{idjob}")
public Job getjobbyid(@PathVariable Integer idjob) {
	return jobrep.findById(idjob).get();
}
@PutMapping("/updatejobupdate")
public Job jobupdatejob( @RequestBody Job job)
{
	return jobServ.jobupdatejob(job) ;
}

}
