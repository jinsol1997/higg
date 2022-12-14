package com.lol.higg.service;


import com.lol.higg.dto.member.HiggMemberDTO;


public interface MemberService {
//사용자 Service interface

    //회원가입
    int insetMember(HiggMemberDTO memberDTO);

    //로그인
    HiggMemberDTO selectById(String uid);
}
