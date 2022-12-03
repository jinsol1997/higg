package com.lol.higg.service;

import com.lol.higg.dto.HiggCommentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    //댓글 Service interface

    List<HiggCommentDTO> getList();


    int insertComment(HiggCommentDTO higgCommentDTO);
}
