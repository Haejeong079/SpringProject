package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.PersonDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public PersonDto hello(){
        PersonDto person = new PersonDto("홍길동", 20, 172.4);

        return person;


    }
}