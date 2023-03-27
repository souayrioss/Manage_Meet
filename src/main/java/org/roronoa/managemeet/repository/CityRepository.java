package org.roronoa.managemeet.repository;

import org.roronoa.managemeet.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}