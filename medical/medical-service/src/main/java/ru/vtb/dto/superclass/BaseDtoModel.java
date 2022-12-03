package ru.vtb.dto.superclass;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class BaseDtoModel {

    @Schema(description = "Дата последнего изменения сущности")
    private String lastModifiedDate;

    @Schema(description = "Дата создания сущности")
    private String dateTimeCreation;
}
