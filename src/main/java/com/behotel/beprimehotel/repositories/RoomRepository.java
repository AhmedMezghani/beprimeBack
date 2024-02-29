package com.behotel.beprimehotel.repositories;

import com.behotel.beprimehotel.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
