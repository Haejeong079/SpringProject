package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.PersonDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(Model model){
        PersonDto person = new PersonDto("홍길동", 20, 172.4);
        model.addAttribute("name",person);
        return "index";


    }
}