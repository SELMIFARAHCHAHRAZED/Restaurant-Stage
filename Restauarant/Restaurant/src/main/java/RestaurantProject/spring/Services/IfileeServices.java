package RestaurantProject.spring.Services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import RestaurantProject.spring.Entities.Filee;

public interface IfileeServices {
	public  Filee uploadFilee (MultipartFile  file) throws IOException ; 
}
