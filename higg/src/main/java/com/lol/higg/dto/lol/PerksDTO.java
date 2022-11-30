package com.lol.higg.dto.lol;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PerksDTO {

    private PerkStatsDTO championId;
    private List<PerkStyleDTO> pickTurn;
}
