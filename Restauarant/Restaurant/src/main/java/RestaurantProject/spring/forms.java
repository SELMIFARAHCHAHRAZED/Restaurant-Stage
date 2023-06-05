package RestaurantProject.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class forms {
	@GetMapping("/job")
	public String gohome() {
		return "job"; 
	}
}
