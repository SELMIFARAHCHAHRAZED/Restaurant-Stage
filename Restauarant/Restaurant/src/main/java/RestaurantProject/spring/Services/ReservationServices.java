package RestaurantProject.spring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RestaurantProject.spring.Entities.Reservation;
import RestaurantProject.spring.Entities.Utilisateur;
import RestaurantProject.spring.Reposetory.ReservationRepository;
@Service
public class ReservationServices implements IReservationServices {
  @Autowired
  ReservationRepository resService;
	@Override
	public Reservation addReservation(Reservation reserv) {
		// TODO Auto-generated method stub
		return resService.save(reserv);
	}

	@Override
	public List<Reservation> addlisteReservation(List<Reservation> lreserv) {
		// TODO Auto-generated method stub
		return (List<Reservation>) resService.saveAll(lreserv);
	}
	@Override
	public Reservation updateReservation(Reservation reserv, Integer idRe) {
		// TODO Auto-generated method stub
		Reservation rese= resService.findById(idRe).get(); 
		rese.setDateRe(reserv.getDateRe());
		rese.setNbrPlaces(reserv.getNbrPlaces());
		resService.save(rese);
		return rese;
	}

	@Override
	public void deleteReservation(Integer idRe) {
		// TODO Auto-generated method stub
		resService.deleteById(idRe);
		
	}

	@Override
	public List<Reservation> getAllReservation() {
		// TODO Auto-generated method stub
		 return (List<Reservation>) resService.findAll();
	}

	@Override
	public List<Reservation> getReservationbyNomU(String ch) {
		// TODO Auto-generated method stub
		return resService.ListReserv(ch);
	}

	
	public Reservation reservupdatereser(  Reservation  r)
	{
		Integer idRe=r.getIdRe(); 
		Reservation reserv=resService.findById(idRe).get();
		reserv.setDateRe(r.getDateRe());
		reserv.setDescription(r.getDescription());
		reserv.setNbrPlaces(r.getNbrPlaces());
		reserv.setNomPlat(r.getNomPlat());
		reserv.setTypeevent(r.getTypeevent());
		
		return resService.save(reserv); 
	}
}
