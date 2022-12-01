package com.lol.higg.service;


import com.lol.higg.dto.HiggMemberDTO;


public interface MemberService {
//사용자 Service interface


    //회원가입
    public int insetMember(HiggMemberDTO memberDTO);
}
