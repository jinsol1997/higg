package com.lol.higg.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SummonerDTO {

    private String id;
    private String accountId;
    private String puuid;
    private String name;
    private String profileIconId;
    private String revisionDate;
    private int summonerLevel;

}
