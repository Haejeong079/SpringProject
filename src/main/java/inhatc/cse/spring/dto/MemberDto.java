package inhatc.cse.spring.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDto {
    private int id;
    private String email;
    private String password;
    private String name;
    private int age;
    private String phone;
}
