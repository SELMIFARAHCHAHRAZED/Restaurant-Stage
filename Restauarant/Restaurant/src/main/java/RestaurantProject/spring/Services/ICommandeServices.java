package RestaurantProject.spring.Services;

import java.util.List;


import RestaurantProject.spring.Entities.Commande;



public interface ICommandeServices {
	public Commande addC(Commande c);
	public List<Commande>addlisteCommande(List<Commande>lc);
	public Commande updateCommande(Commande c , Integer  idC);
	public void deleteCommande(Integer idC);
	public List <Commande> getAllCommande();
	public List <Commande> getCommandeByEtat(String ch);
}
