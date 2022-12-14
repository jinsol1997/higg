package com.lol.higg.mapper;

import com.lol.higg.dto.member.HiggMemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HiggMemberMapper {
    //사용자 Mapper

    /*회원가입*/
    int insertMember(HiggMemberDTO memberDTO);

    @Select("select * from higg_member where uid=#{uid}")
    HiggMemberDTO selectById(String uid);

}
