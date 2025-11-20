package com.deepesh.appointment.repository;

import com.deepesh.appointment.model.AppointmentSlot;
import com.deepesh.appointment.model.User;
import com.deepesh.appointment.model.SlotStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentSlotRepository extends JpaRepository<AppointmentSlot, Long> {

    List<AppointmentSlot> findByProviderAndDateAndStatus(User provider, LocalDate date, SlotStatus status);
}