package com.lol.higg.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Log4j2
@Controller
@RequestMapping("member/register")
public class MemberRegController {

    @GetMapping
    public String regForm() {
       log.info("regForm...Get");
        return "member/regForm";
    }
}
