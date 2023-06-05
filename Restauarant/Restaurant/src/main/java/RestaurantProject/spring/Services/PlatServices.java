package RestaurantProject.spring.Services;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import RestaurantProject.spring.Entities.Employer;
import RestaurantProject.spring.Entities.Filee;
import RestaurantProject.spring.Entities.Job;
import RestaurantProject.spring.Entities.Plat;
import RestaurantProject.spring.Reposetory.PlatRepository;

@Service
public class PlatServices  implements IPlatServices{
	@Autowired
	 PlatRepository pr;
	@Autowired
	FileeServices fileServ;
	@Override
	public Plat addPlat(Plat p) {
		
		return pr.save(p);
	}
	@Override
	public List<Plat> addlistePlat(List<Plat> lp) {
		// TODO Auto-generated method stub
		return (List<Plat>) pr.saveAll(lp);
	}
	@Override
	public String addPLatTestNomP(Plat p) {
		// TODO Auto-generated method stub
		String ch="";
		if( pr.existsByNomP(p.getNomP()))
		{
			ch="plat exixte deja !!!!";
		}
		else {
			pr.save(p);
			ch="plat ajoutée";
		}
		return ch;
	}
	@Override
	public Plat updatePlat(Plat p, Integer idP) {
		// TODO Auto-generated method stub
		Plat plat= pr.findById(idP).get(); 
		plat.setDescriptionP(p.getDescriptionP());
		plat.setNomP(p.getNomP());
		plat.setPrixP(p.getPrixP());
		plat.setImageP(p.getImageP());
		pr.save(plat);
		return plat;
	}
	@Override
	public void deletePlat(Integer idP) {
		// TODO Auto-generated method stub
	      pr.deleteById(idP);
	}
	@Override
	public List<Plat> getAllPlat() {
		// TODO Auto-generated method stub
      return (List<Plat>) pr.findAll();
	}
	@Override
	public List<Plat> getUserByPrix(float prixP) {
		return pr.ListPlat(prixP);
	}

	
	public Plat addFile(Integer idP,MultipartFile file) {
	       Plat p= pr.findById(idP).get();
	       try {
			Filee f1 =fileServ.uploadFilee(file);
			//p.setFile(f1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
			return pr.save(p);
			
		}
	public Plat platupdateplat(  Plat plat)
	{
		Integer idP=plat.getIdP(); 
		Plat p=pr.findById(idP).get();
		p.setDescriptionP(plat.getDescriptionP());
		p.setNomP(plat.getNomP());
		p.setImageP(plat.getImageP());
		p.setDescriptionP(plat.getDescriptionP());
		p.setPrixP(plat.getPrixP());
		
		return pr.save(plat); 
	}

 
	 public List<Plat>  getprix(Integer  idP) {
		return pr.ListPlat2(idP);
	}
public List<Plat>getidPlat(Integer idP){
	return pr.ListPlat2(idP);
}
}
