package ru.fischerski.shamalnotepad.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class SpaceDTO {

    @NotNull
    private Long spaceId;
    private String spaceName;
    private String editors;
    private String viewers;
}
