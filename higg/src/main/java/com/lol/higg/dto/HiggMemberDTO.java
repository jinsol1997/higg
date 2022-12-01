package com.lol.higg.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class HiggMemberDTO {
    //사용자 DTO

    //아이디
    private String uid;
    //비밀번호
    private String pw;

    public HiggLoginInfo toLoginInfo() {
        return HiggLoginInfo.builder().uid(this.uid).build();
    }

}
