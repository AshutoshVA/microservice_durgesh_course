package com.hotel.service.services;

import com.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {

    //crate
    Hotel create(Hotel hotel);

    //getall
    List<Hotel> getAll();

    //get single
    Hotel get(String id);
}
