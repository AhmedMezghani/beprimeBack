package com.behotel.beprimehotel.services;

import com.behotel.beprimehotel.models.Room;

import java.util.List;

public interface IRoomService {
    List<Room> getAllRooms();

    Room addRoom(Room newRoom);
}
