package com.lol.higg.service;


import com.lol.higg.dto.HiggMemberDTO;

import javax.servlet.http.HttpSession;


public interface MemberService {
//사용자 Service interface

    //로그인 체크
    public boolean loginCheck(HiggMemberDTO higgMemberDTO, HttpSession session);

    //로그아웃
    public void  logout(HttpSession session);
}
