package com.rating.service.controller;

import com.rating.service.entities.Rating;
import com.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	// create rating
	@PostMapping("/create")
	public ResponseEntity<Rating> create(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
	}

	@GetMapping
	public ResponseEntity<List<Rating>> getAllRating() {
		return ResponseEntity.ok(ratingService.getRatings());
	}

	// Get all ratings of user

	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId) {
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
	}

	// get all ratings of all hotels

	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId) {
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}
}
