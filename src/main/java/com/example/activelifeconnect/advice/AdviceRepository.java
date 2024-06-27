package com.example.activelifeconnect.advice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdviceRepository extends JpaRepository<Advice, Long> {
    Iterable<Advice> findAllByCategory(AdviceCategory adviceCategory);
}
