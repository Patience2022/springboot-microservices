package com.practice.organizationservice.service;

import com.practice.organizationservice.entity.Organization;

import java.util.Optional;

public interface OrganizationService {
    Organization saveOrganization(Organization organization);
   Organization getOrganizationByCode(String code);
}
