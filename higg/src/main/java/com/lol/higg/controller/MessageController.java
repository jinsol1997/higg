package com.lol.higg.controller;

import com.lol.higg.dto.HiggCommentDTO;
import com.lol.higg.service.CommentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/in")
public class MessageController {

    @Autowired
    CommentService commentService;

    @GetMapping
    public List<HiggCommentDTO> getList() {
        return commentService.getList();
    }

    @PostMapping
    @ResponseBody
    public String postin(@RequestBody HiggCommentDTO higgCommentDTO
//            @RequestBody HiggCommentDTO higgCommentDTO
    ) {
        log.info("포스트 채팅컨트롤러 통과");
        log.info("받아온 메시지" + higgCommentDTO.getMessage());
        log.info("받아온 메시지" + higgCommentDTO.getSearchNum());
        //HiggCommentDTO commentDTO = commentService.insertComment();


        return "메시지 컨트롤러 통과" ;
    }

}
