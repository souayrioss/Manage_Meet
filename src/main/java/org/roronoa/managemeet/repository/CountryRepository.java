package org.roronoa.managemeet.repository;

import org.roronoa.managemeet.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}