package bizz.global77.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	@RequestMapping(value={"/","/{home}"}	)
	public String home(){
		return "index";
	}
	@RequestMapping(value="/about_us")
	public String aboutUs(){
		return "about_us";
	}


}
