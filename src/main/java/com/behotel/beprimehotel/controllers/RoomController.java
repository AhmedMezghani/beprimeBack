package com.behotel.beprimehotel.controllers;
import com.behotel.beprimehotel.models.Room;
import com.behotel.beprimehotel.services.IRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
@RequiredArgsConstructor
@CrossOrigin()
public class RoomController {

    private final IRoomService roomService;

    @GetMapping
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> rooms = roomService.getAllRooms();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }
    @PostMapping("/addRoom")
    public ResponseEntity<Room> addRoom(@RequestBody Room newRoom) {
        Room addedRoom = roomService.addRoom(newRoom);
        return new ResponseEntity<>(addedRoom, HttpStatus.CREATED);
    }




}
