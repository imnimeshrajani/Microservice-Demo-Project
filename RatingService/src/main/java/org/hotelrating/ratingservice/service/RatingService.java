package org.hotelrating.ratingservice.service;

import org.hotelrating.ratingservice.model.Rating;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {

    //create
    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);




}