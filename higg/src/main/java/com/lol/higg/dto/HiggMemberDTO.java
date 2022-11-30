package com.lol.higg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class HiggMemberDTO {
    //사용자 DTO

    //아이디
    private String uid;
    //비밀번호
    private String pw;
    //자기 롤 닉네임
    private String SearchNum;

}
