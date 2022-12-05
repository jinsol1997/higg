package com.lol.higg.service;

import com.lol.higg.dto.member.HiggCommentDTO;
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
    public List<HiggCommentDTO> getList(String searchNum) {
        return higgCommentMapper.getList(searchNum);
    }

    @Override
    public int insertComment(HiggCommentDTO higgCommentDTO) {
        log.info("서비스 ");
        log.info(higgCommentDTO.getUid());
        log.info(higgCommentDTO.getMessage());
        log.info(higgCommentDTO.getSearchNum());
        return higgCommentMapper.insertComment(higgCommentDTO);
    }
}
