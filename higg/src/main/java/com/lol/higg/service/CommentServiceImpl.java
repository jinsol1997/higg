package com.lol.higg.service;

import com.lol.higg.dto.HiggCommentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    //댓글 Service
    @Autowired(required = false)
    HiggCommentDTO higgCommentDTO;

    @Override
    public int insertComment(HiggCommentDTO commentDTO) {

        return 0;
    }
}
