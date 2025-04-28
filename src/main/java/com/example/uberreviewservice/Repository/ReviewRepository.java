package com.example.uberreviewservice.Repository;

import com.example.uberreviewservice.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
