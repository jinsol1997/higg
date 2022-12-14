package com.lol.higg.service;

import com.lol.higg.dto.member.HiggCommentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    //댓글 Service interface

    List<HiggCommentDTO> getList(String searchNum);


    int insertComment(HiggCommentDTO higgCommentDTO);
}
