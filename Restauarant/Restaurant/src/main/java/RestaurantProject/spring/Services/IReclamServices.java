package RestaurantProject.spring.Services;

import java.util.List;

import RestaurantProject.spring.Entities.Reclam;


public interface IReclamServices {
	public Reclam addReclam(Reclam r);
	public List<Reclam>addlisteReclam(List<Reclam>lrec);
    public Reclam updateReclam(Reclam rec , Integer  idRec);
    public void deleteReclam(Integer idRec);
    public List <Reclam> getAllReclam();
    public List <Reclam> getReclamByType(String ch);
}
