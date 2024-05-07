package inhatc.cse.spring.utils;

import inhatc.cse.spring.dto.MemberDto;

import java.lang.reflect.Member;

public class BuilderTest {

    public static void main(String[] args) {
        MemberDto memberDto = new MemberDto("abc@test.com","1111","홍길동",10,"123-1234-1233");
        MemberDto memberDto1 = MemberDto.builder()
                .moblie("010-222")
                .name("김길동")
                .build();
        System.out.println(memberDto1);
    }
}
