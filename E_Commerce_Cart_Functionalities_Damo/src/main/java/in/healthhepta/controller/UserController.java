package in.healthhepta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import in.healthhepta.service.UserService;



@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    
    @PostMapping("healthhepta/save")
    public String saveAll(){
    	userService.saveInitialBatch();
         return "Data Save Succfully";
    }
}