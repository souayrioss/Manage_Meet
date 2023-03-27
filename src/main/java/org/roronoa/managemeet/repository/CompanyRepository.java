package org.roronoa.managemeet.repository;

import org.roronoa.managemeet.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    Optional<Company> findByReference(String reference);
    Optional<Company> findByName(String name);
    List<Company> findAllByName(String name);

}