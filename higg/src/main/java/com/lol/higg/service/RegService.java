package com.lol.higg.service;

import com.lol.higg.mapper.HiggCommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegService {

    @Autowired(required = false)
    private HiggCommentMapper higgCommentMapper;



}
