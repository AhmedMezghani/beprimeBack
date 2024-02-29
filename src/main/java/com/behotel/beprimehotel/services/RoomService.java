package com.behotel.beprimehotel.services;

import com.behotel.beprimehotel.models.Room;
import com.behotel.beprimehotel.repositories.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService implements IRoomService {

    private final RoomRepository roomRepository;
    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room addRoom(Room newRoom) {
        return roomRepository.save(newRoom);
    }
}
