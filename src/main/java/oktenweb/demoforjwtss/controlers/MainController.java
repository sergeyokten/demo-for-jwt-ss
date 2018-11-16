package oktenweb.demoforjwtss.controlers;

import oktenweb.demoforjwtss.models.User;
import oktenweb.demoforjwtss.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/user/get")
    public String userGetRequest() {
        return "it`s ok!";
    }


    @Autowired
    private UserService userService;

    @GetMapping("/saveUser")
    public String saveUser(@RequestParam String username, @RequestParam String password) {
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);
        userService.save(user);

        return "save done";
    }
}
