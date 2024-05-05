package com.practice.organizationservice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDto {

        private Long id;

        @NotNull(message = "Where have you seen an organization with no name?????")
        private String organizationName;
        @NotNull(message = "Please enter organization code")
        private String organizationCode;
        private String organizationDescription;
        private LocalDateTime createdDate;

}
