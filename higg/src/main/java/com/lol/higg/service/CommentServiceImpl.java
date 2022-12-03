package com.lol.higg.service;

import com.lol.higg.dto.HiggCommentDTO;
import com.lol.higg.mapper.HiggCommentMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class CommentServiceImpl implements CommentService {
    //댓글 Service
    @Autowired(required = false)
    HiggCommentMapper higgCommentMapper;

    @Override
    public List<HiggCommentDTO> getList() {
        return higgCommentMapper.getList();
    }

    @Override
    public int insertComment(HiggCommentDTO higgCommentDTO) {
        return 0;
    }
}
