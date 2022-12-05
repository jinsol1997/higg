package com.lol.higg.controller;

import com.lol.higg.dto.member.HiggCommentDTO;
import com.lol.higg.service.CommentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/comment/ajaxselect")
public class MessageController {

    @Autowired
    CommentService commentService;

    @GetMapping("/{puuid}")
    public List<HiggCommentDTO> getList(@PathVariable("puuid") String puuid, Model model) {

        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+puuid);
        model.addAttribute("comment", commentService.getList(puuid));
        log.info("comment@@@@@@@@@@@@@@@@@@@" + commentService.getList(puuid));
        return commentService.getList(puuid);
    }

    @PostMapping
    public void postin(@RequestBody HiggCommentDTO higgCommentDTO
    ) {
       log.info(higgCommentDTO + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        commentService.insertComment(higgCommentDTO);
    }

}
