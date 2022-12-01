package com.lol.higg.mapper;

import com.lol.higg.dto.HiggMemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HiggMemberMapper {
    //사용자 Mapper

    /*회원가입*/
    int insertMember(HiggMemberDTO memberDTO);

    HiggMemberDTO selectByIdPw(@Param("uid") String uid, @Param("pw") String pw);

}
