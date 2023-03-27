package org.roronoa.managemeet.repository;

import org.roronoa.managemeet.entity.Company;
import org.roronoa.managemeet.entity.Meet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MeetRepository extends JpaRepository<Meet, Integer> {
    Optional<Meet> findByReference(String reference);
}