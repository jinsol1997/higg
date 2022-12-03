package com.lol.higg.controller;

import com.lol.higg.dto.HiggCommentDTO;
import com.lol.higg.service.CommentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Log4j2
@Controller
@RequestMapping("/in")
public class MessageController {

    @Autowired
    CommentService commentService;


    @GetMapping
    public List<HiggCommentDTO> getList() {
        return commentService.getList();
    }

    @PostMapping
    public String postin(
            @RequestParam("searchNum") String searchNum,
            @RequestParam("message") String message,
            @RequestParam("uid") String uid
    ) {
        HiggCommentDTO higgCommentDTO = new HiggCommentDTO();
        higgCommentDTO.setSearchNum(searchNum);
        higgCommentDTO.setMessage(message);
        higgCommentDTO.setUid(uid);
        commentService.insertComment(higgCommentDTO);

        return "redirect:/higg/list";
    }

}
