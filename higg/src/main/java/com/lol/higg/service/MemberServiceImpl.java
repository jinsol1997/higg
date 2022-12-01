package com.lol.higg.service;

import com.lol.higg.dto.HiggMemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class MemberServiceImpl implements MemberService {
    //사용자 Service



    @Override
    public void logout(HttpSession session) {

    }
}
