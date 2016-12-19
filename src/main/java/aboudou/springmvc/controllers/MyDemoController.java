package aboudou.springmvc.controllers;

import java.util.Random;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aboudou.springmvc.model.Account;

@Controller
public class MyDemoController {
	
	private static final Logger logger = Logger.getLogger(MyDemoController.class);

	private String[] quotes = { "To be or not to be Shakespeare", "Spring in nature's way of saying Let's Party",
			"The time is always right to do waht is right" };

	@RequestMapping(value = "/getQuote", method = RequestMethod.GET)
	public String getRandomQuote(Model model) {

		int rand = new Random().nextInt(quotes.length);

		model.addAttribute("randomQuote", quotes[rand]);

		return "quote";
	}

	@RequestMapping(value = "/createAccount")
	public String createAccount(@Valid @ModelAttribute("aNewAccount") Account account) {
		
		logger.info(account.toString());
		
		return "createAccount";
	}
}
