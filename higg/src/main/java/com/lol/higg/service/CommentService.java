package com.lol.higg.service;

import com.lol.higg.dto.HiggCommentDTO;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    //댓글 Service interface
    // 댓글추가
    int insertComment(HiggCommentDTO commentDTO);

}
