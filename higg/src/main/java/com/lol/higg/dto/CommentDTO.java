package com.lol.higg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CommentDTO {
    //닉네임
    private String nick;

    //비밀번호
    private String pw;
    //댓글
    private String comment;
    //게시글고유번호(출력시 )
    private int searchNum;

}
