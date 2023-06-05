package RestaurantProject.spring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RestaurantProject.spring.Entities.Raiting;
import RestaurantProject.spring.Reposetory.RaitingRepository;

@Service
public class RaitingServices implements IRaitingServices {
@Autowired 
RaitingRepository raitrep;

@Override
public Raiting addRate(Raiting rate) {
	// TODO Auto-generated method stub
	return raitrep.save(rate);
}

@Override
public Raiting updateRaiting(Raiting rate, Integer idrate) {
	// TODO Auto-generated method stub
	Raiting rating= raitrep.findById(idrate).get();
	rating.setNote(rate.getNote());
	raitrep.save(rating); 
	
	
	return rating;
}

@Override
public void deleteRating(Integer idrate) {
	// TODO Auto-generated method stub
	raitrep.deleteById(idrate);
}

@Override
public List<Raiting> getAllRaiting() {
	// TODO Auto-generated method stub
	return (List<Raiting>)raitrep.findAll();
} 


}
