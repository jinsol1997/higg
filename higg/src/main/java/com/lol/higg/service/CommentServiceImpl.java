package com.lol.higg.service;

import com.lol.higg.dto.HiggCommentDTO;
import com.lol.higg.mapper.HiggCommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    //댓글 Service
    @Autowired(required = false)
    HiggCommentMapper higgCommentMapper;

    @Override
    public List<HiggCommentDTO> getList() {
        return (List<HiggCommentDTO>) higgCommentMapper.getList();
    }
}
