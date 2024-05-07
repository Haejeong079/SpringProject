package inhatc.cse.spring.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDto {
    private String email;
    private String password;
    private String name;
    private int age;
    private String moblie;
}
