package com.lol.higg.service;

import com.lol.higg.dto.member.HiggMemberDTO;
import com.lol.higg.mapper.HiggMemberMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class MemberServiceImpl implements MemberService {
    //사용자 Service
    @Autowired(required = false)
    private HiggMemberMapper memberMapper;


    @Override
    public int insetMember(HiggMemberDTO memberDTO) {
        //회원가입
        log.info("회원가입 서비스");
        return memberMapper.insertMember(memberDTO);
    }

    @Override
    public HiggMemberDTO selectById(String uid) {
        return memberMapper.selectById(uid);
    }


}
