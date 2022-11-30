package com.lol.higg.dto.lol;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TeamDTO {

    private List[BanDTO] bans;
    private ObjectivesDTO objectives;
    private int teamId;
    private boolean win;
}
