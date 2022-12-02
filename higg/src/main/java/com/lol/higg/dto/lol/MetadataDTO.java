package com.lol.higg.dto.lol;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MetadataDTO {

    private String dataVersion;
    private String matchId;
    private List<String> participants;

}
