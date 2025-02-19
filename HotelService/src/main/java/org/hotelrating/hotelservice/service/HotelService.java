package org.hotelrating.hotelservice.service;


import org.hotelrating.hotelservice.model.Hotel;

import java.util.List;

public interface HotelService {

    //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(String id);

}