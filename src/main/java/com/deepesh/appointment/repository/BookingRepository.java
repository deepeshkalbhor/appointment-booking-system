package com.deepesh.appointment.repository;

import com.deepesh.appointment.model.Booking;
import com.deepesh.appointment.model.User;
import com.deepesh.appointment.model.BookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByCustomer(User customer);

    List<Booking> findByStatus(BookingStatus status);
}

