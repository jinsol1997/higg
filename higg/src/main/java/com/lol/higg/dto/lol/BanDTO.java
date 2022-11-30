package com.lol.higg.dto.lol;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BanDTO {

    private int championId;
    private int pickTurn;
}
