package bank;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.Bank;
import domain.User;

@Controller
public class UserController {

	ArrayList<User> someList = new ArrayList<User>();
	Bank bank = new Bank();
	
	@RequestMapping(value = "/newUser")
	public String userForm() {
		return "newUser";
	}
	
	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public String newUserSubmit(@ModelAttribute("user") User user, Model model) {
		someList.add(user);
		bank.addUser(user);
        return "redirect:/user";
    }
	
	@RequestMapping(value = "/user")
	public String user(Model model) {
	model.addAttribute("user", bank.getUsers());
		return "user";
	}
}
