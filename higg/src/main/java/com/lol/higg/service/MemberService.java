package com.lol.higg.service;


import javax.servlet.http.HttpSession;


public interface MemberService {
//사용자 Service interface


    //로그아웃
    public void logout(HttpSession session);
}
