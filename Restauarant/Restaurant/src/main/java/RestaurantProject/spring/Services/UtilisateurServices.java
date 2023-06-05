package RestaurantProject.spring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RestaurantProject.spring.Entities.Job;
import RestaurantProject.spring.Entities.Utilisateur;
import RestaurantProject.spring.Reposetory.UtilisateurRepository;
@Service
public class UtilisateurServices implements IUtilisateurServices {
 @Autowired
 UtilisateurRepository ur;

@Override
public Utilisateur addU(Utilisateur u) {
	// TODO Auto-generated method stub
	return ur.save(u);
}

@Override
public List<Utilisateur> addlisteUser(List<Utilisateur> lu) {
	// TODO Auto-generated method stub
	return (List<Utilisateur>) ur.saveAll(lu);
}

@Override
public String addUserTestEmail(Utilisateur u) {
	// TODO Auto-generated method stub
	String ch="";
	/*if( ur.existsByEmail(u.getEmail()))
	{
		ch="email est  deja utilisé !!!!";
	}
	else {
		ur.save(u);
		ch="utilisateur ajoutée";
	}*/
	return ch;
}

@Override
public Utilisateur updateUser(Utilisateur u, Integer idU) {
	// TODO Auto-generated method stub
	Utilisateur usr= ur.findById(idU).get(); 
	usr.setNom(u.getNom());
	//usr.setPrenom(u.getPrenom());
	ur.save(usr);
	return usr;
}

@Override
public void deleteUser(Integer idU) {
	// TODO Auto-generated method stub
	ur.deleteById(idU);
}

@Override
public List<Utilisateur> getAllUser() {
	// TODO Auto-generated method stub
	return (List<Utilisateur>) ur.findAll();
}

@Override
public List<Utilisateur> getUserByNom(String ch ) {
	// TODO Auto-generated method stub
	return ur.ListUsers(ch);
}
/*
@Override
public Utilisateur getBYEmail(String login, String pwd) {
	return   (Utilisateur) ur.	;
}*/

public Utilisateur userupdateuser(  Utilisateur u)
{
	Integer idU=u.getIdU(); 
	Utilisateur user=ur.findByIdU(idU).get();
	user.setLogin(u.getLogin());
	user.setNom(u.getNom());
	user.setPwd(u.getPwd());
	user.setRole(u.getRole());
	return ur.save(user); 
}


	
}
