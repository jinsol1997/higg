package com.lol.higg.controller;

import com.lol.higg.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@Controller
@RequestMapping("/main/Login")
public class LoginController {
    //로그인 Controller
    @Autowired
    private MemberService memberService;


  /*  @PostMapping
    public String login(
            @RequestParam("uid") String uid,
            @RequestParam("pw") String pw,
            @RequestParam("searchNum") String searchNum,
            HttpServletRequest request
    ) {
        String uid2 = request.getParameter("uid");
        String pw2 = request.getParameter("pw");
        String searchNum2 = request.getParameter("searchNum");

        log.info("uid => " + uid2);
        log.info("pw  => " + pw2);
        log.info("SearchNum  => " + SearchNum2);

        boolean memberDTO = memberService.LoginService(uid, pw, searchNum);

        request.getSession().setAttribute("loginInfo", uid);

        return "redirect:/higg/main";

    }*/


}
