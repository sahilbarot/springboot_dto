package net.implementation.springboot_dto.repository;

import net.implementation.springboot_dto.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
