package com.practice.organizationservice.controller;

import com.practice.organizationservice.dto.OrganizationDto;
import com.practice.organizationservice.entity.Organization;
import com.practice.organizationservice.service.OrganizationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/organization")
@AllArgsConstructor
public class OrganizationController {
    private ModelMapper modelMapper;
    private OrganizationService organizationService;

    @PostMapping
    public OrganizationDto saveOrganization(@RequestBody @Valid OrganizationDto dto){
        Organization newOrganization =modelMapper.map(dto, Organization.class);
        OrganizationDto savedOrganization = modelMapper.map(organizationService.saveOrganization(newOrganization),OrganizationDto.class);
        return savedOrganization;
    }
    @GetMapping("{code}")
    public OrganizationDto getOrganizationByCode(@PathVariable String code){
        return modelMapper.map(organizationService.getOrganizationByCode(code), OrganizationDto.class);
    }
}
