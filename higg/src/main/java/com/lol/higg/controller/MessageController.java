package com.lol.higg.controller;

import com.lol.higg.dto.HiggCommentDTO;
import com.lol.higg.service.CommentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Log4j2
@Controller
public class MessageController {

    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/insetChat", method = RequestMethod.POST)
    public @ResponseBody String insetChat(HiggCommentDTO commentDTO, HttpSession session) {
        if (session.getAttribute("loginId") != null) {
            String userid = (String) session.getAttribute("loginId");
            commentDTO.setUid(userid);
            commentDTO.setSearchNum(commentDTO.getSearchNum());
            log.info("세션에 등록되어있는 유저 아이디" + userid);
            log.info("세션에 등록되어있는 시리얼넘버" + commentDTO.getSearchNum());


        }
        log.info("if 문 통과");
        return null;
    }
}
