package com.lol.higg.controller;

import com.lol.higg.dto.HiggMemberDTO;
import com.lol.higg.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public String login(
            @RequestParam("uid") String uid,
            @RequestParam("pw") String pw,
            HttpServletRequest request
    ) {
        String uid2 = request.getParameter("uid");
        String pw2 = request.getParameter("pw");

        log.info("uid => " + uid2);
        log.info("pw  => " + pw2);

        /* request.getSession().setAttribute("loginInfo", uid);*/

        HiggMemberDTO memberDTO = memberService.selectByIdPw(uid, pw);
        log.info("로그인 서비스 통과 후 컨트롤러 도착 memberDTO값 ->" + memberDTO);

        if (memberDTO != null) {
            HttpSession session = request.getSession();
            session.setAttribute("loginInfo", memberDTO.toLoginInfo());
        }


        return "redirect:/higg/main";

    }


}
