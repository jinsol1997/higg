package com.lol.higg.dto.down;

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
