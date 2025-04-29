package com.example.uberreviewservice.Repository;

import com.example.uberreviewservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
