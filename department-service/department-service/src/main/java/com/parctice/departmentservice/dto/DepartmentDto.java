package com.parctice.departmentservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        name = "DepartmentDTO",
        description = "Data Transfer Object for Department Entity"
)
public class DepartmentDto {
    @Schema(
            description = "Database's unique identifier (primary key) for the department"
    )
    private long id;
    @Schema(
            description = "Name of the Department"
    )
    private String departmentName;
    @Schema(
            description = "Describes the department"
    )
    private String departmentDescription;
    @Schema(
            description = "Unique code that identifies Department"
    )
    private String departmentCode;
}
