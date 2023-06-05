package RestaurantProject.spring.Services;

import java.util.List;

import RestaurantProject.spring.Entities.Job;


public interface IJobServices {
public Job addjob(Job j); 
public List<Job>addlisteJob(List<Job>ljob);
public String addJobTestNom(Job j); 
public Job updatejob(Job j, Integer idjob ); 
//public Job updatejob(Job j, String nomjob);
public void deletejob(Integer idjob); 
public List<Job>getAllJobs();
}
