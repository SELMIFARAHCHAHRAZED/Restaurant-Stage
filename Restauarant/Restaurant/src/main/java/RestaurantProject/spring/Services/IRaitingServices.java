package RestaurantProject.spring.Services;

import RestaurantProject.spring.Entities.Raiting;


import java.util.List;

public interface IRaitingServices {
public Raiting addRate(Raiting rate); 
public Raiting updateRaiting(Raiting rate, Integer idrate); 
public void deleteRating(Integer idrate); 
public List <Raiting> getAllRaiting();

}
