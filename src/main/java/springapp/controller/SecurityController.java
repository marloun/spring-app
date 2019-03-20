package springapp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Simple Controller that handles the home page and login/logout pages
 */
@Controller
public class SecurityController {
	
	private Logger logger = LoggerFactory.getLogger(SecurityController.class);

    /**
     * The login page does not change based on the model and is a "static" page
     * @return home page view template
     */
	@GetMapping("/")
	 public String getClient() {
       return "home";
	}

    /**
     * The login page does not change based on the model and is a "static" page
     * @return login page view template
     */
	@GetMapping("/login")
	 public String login() {
      return "login";
	}
	

}