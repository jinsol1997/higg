package com.lol.higg.controller;

import com.lol.higg.dto.HiggCommentDTO;
import com.lol.higg.service.CommentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@Controller
@RequestMapping("/comment/ajaxselect")
public class MessageController {

    @Autowired
    CommentService commentService;


    @GetMapping
    @ResponseBody
    public List<HiggCommentDTO> getList() {
        return commentService.getList();
    }

    @PostMapping
    public String postin(
            @RequestParam("searchNum") String searchNum,
            @RequestParam("message") String message,
            @RequestParam("uid") String uid
    ) {
        log.info("메시지 컨트롤러");
        HiggCommentDTO higgCommentDTO = new HiggCommentDTO();
        higgCommentDTO.setSearchNum(searchNum);
        higgCommentDTO.setMessage(message);
        higgCommentDTO.setUid(uid);
        commentService.insertComment(higgCommentDTO);

        return "redirect:/higg/list";
    }

}
