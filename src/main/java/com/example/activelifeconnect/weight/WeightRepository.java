package com.example.activelifeconnect.weight;

import com.example.activelifeconnect.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeightRepository extends JpaRepository<Weight, Long> {
    Iterable<Weight> findAllByUser(User user);
}
