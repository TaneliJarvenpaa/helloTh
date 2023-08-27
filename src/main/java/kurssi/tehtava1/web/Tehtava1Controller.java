package kurssi.tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Tehtava1Controller {
	
	
	
	@GetMapping("/hello")
	
	public String sayHello(
			@RequestParam (name="name")String nimi, 
			@RequestParam(name="age") int ika, 
			Model model){
		nimi=nimi.substring(0,1).toUpperCase()+nimi.substring(1);
		model.addAttribute("name",nimi);
		model.addAttribute("age",ika);
		
		return "hello";
		
	}
	
	
	
}

