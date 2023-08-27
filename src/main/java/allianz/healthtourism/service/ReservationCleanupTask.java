package allianz.healthtourism.service;

import allianz.healthtourism.repository.AppointmentRepository;
import allianz.healthtourism.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ReservationCleanupTask {

    @Autowired
    private AppointmentRepository appointmentRepository;  // Varsayılan repository'niz

    @Autowired
    private HotelRepository hotelRepository;  // Varsayılan repository'niz

    @Scheduled(fixedRate = 60000)  // Her 60 saniyede bir çalıştır
    public void invalidateOldReservations() {
        LocalDateTime now = LocalDateTime.now();

        // Kesinleşmeyen ve 10 dakikadan eski randevuları geçersiz kıl
        appointmentRepository.findAll().stream()
                .filter(appointment -> !appointment.isConfirmed() &&
                        appointment.getCreatedAt().plusMinutes(1).isBefore(now))
                .forEach(appointment -> {
                    appointment.setInvalid(true);
                    appointmentRepository.save(appointment);
                });

        // Kesinleşmeyen ve 10 dakikadan eski otel rezervasyonlarını geçersiz kıl
        hotelRepository.findAll().stream()
                .filter(hotel -> !hotel.isConfirmed() &&
                        hotel.getCreatedAt().plusMinutes(1).isBefore(now))
                .forEach(hotel -> {
                    hotel.setInvalid(true);
                    hotelRepository.save(hotel);
                });
    }
}
