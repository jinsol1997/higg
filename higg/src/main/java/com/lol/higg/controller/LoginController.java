package com.lol.higg.controller;

import com.lol.higg.dto.member.HiggMemberDTO;
import com.lol.higg.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Log4j2
@Controller
@RequestMapping("main/Login")
public class LoginController {
    //로그인 Controller
    @Autowired
    private MemberService memberService;


    @PostMapping
    public String login(HiggMemberDTO memberDTO, HttpSession session) {

        HiggMemberDTO member = memberService.selectByIdPw(memberDTO.getUid(), memberDTO.getPw());

        if (member != null) {
            session.setAttribute("loginInfo", member.toLoginInfo());
        }

        return "/higg/main";
    }


}
