package inhatc.cse.spring.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/save")
    public String save(){
        log.info("===================회원 가입 처리중");
        return "member/save";
    }

    @PostMapping("/save")
    public String memberInsert(){

        return "";
    }
}