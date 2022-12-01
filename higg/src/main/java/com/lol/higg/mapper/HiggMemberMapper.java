package com.lol.higg.mapper;

import com.lol.higg.dto.HiggMemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HiggMemberMapper {
    //사용자 Mapper

    /*회원가입*/
    int insertMember(HiggMemberDTO memberDTO);

}
