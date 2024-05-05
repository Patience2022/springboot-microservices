package com.practice.organizationservice.service.Impl;

import com.practice.organizationservice.entity.Organization;
import com.practice.organizationservice.repository.OrganizationRepository;
import com.practice.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private OrganizationRepository repository;
    @Override
    public Organization saveOrganization(Organization organization) {
        return repository.save(organization);
    }

    @Override
    public Organization getOrganizationByCode(String code) {
        return repository.findOrganizationByOrganizationCode(code).orElseThrow();
    }
}
