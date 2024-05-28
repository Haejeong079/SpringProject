package inhatc.cse.spring.controller;

import inhatc.cse.spring.dto.MemberDto;
import inhatc.cse.spring.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin
public class MemberApiController {

    private final MemberService memberService;
    @PostMapping("/login")
    public ResponseEntity<?> login(@ModelAttribute MemberDto memberDto){
        boolean result = memberService.login(memberDto);
        return new ResponseEntity<>(result, HttpStatus.OK);

    }
    @PostMapping("/save")
    public ResponseEntity<?> memberInsert(MemberDto memberDto){
        System.out.println("================" + memberDto);
        int result = memberService.save(memberDto);

        System.out.println("================" + memberDto);
        return new ResponseEntity<>(result, HttpStatus.OK);

    }

}
