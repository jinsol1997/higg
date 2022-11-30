package com.lol.higg.dto.lol;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatchDTO {

    private MetadataDTO metadata;
    private InfoDTO info;

}
