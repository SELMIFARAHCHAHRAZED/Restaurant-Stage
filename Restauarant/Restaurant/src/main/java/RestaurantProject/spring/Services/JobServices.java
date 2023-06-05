package RestaurantProject.spring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import RestaurantProject.spring.Entities.Job;
import RestaurantProject.spring.Reposetory.JobRepository;
@Service
public class JobServices implements IJobServices {
  @Autowired
  JobRepository jobrep; 
	@Override
	public Job addjob(Job j) {
		// TODO Auto-generated method stub
		return jobrep.save(j);
	}
	
	@Override
	public List<Job> addlisteJob(List<Job> ljob) {
		// TODO Auto-generated method stub
		return (List<Job>)jobrep.saveAll(ljob);
	}
	@Override
	public String addJobTestNom(Job j) {
		
		String ch="";
		if( jobrep.existsByNomjob(j.getNomjob()))
		{
			ch="job existe dejà !!!!";
		}
		else {
			jobrep.save(j);
			ch="job ajoutée";
		}
		return ch;

}
	@Override
	public Job updatejob(Job j, Integer idjob) {
		// TODO Auto-generated method stub
	Job job=jobrep.findById(idjob).get(); 
	job.setNomjob(j.getNomjob());
	job.setNbrheures(j.getNbrheures());
	jobrep.save(job); 
	return job; 
	}
	
	@Override
	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		return (List<Job>)jobrep.findAll();
	}

	@Override
	public void deletejob(Integer idjob) {
		// TODO Auto-generated method stub
		 jobrep.deleteById(idjob);
	}
	public Job jobupdatejob(  Job job)
	{
		Integer idjob=job.getIdjob(); 
		Job j=jobrep.findById(idjob).get();
		j.setNbrheures(job.getNbrheures());
		j.setNomjob(job.getNomjob());
		return jobrep.save(j); 
	}
}
