package com.JJoINT.CamPuzl.domain.booth.dto;

import com.JJoINT.CamPuzl.global.enums.TentNum;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoothDTO {
    //커밋용 주석
    private String boothName;
    private TentNum tentNum;
    private double totalRating;
    private String explanation;
    private String contents;
    private String event;
}
