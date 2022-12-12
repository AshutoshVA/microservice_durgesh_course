package com.user.userservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.user.userservice.entities.Rating;
import com.user.userservice.external.services.RatingService;

@SpringBootTest
class UserserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private RatingService ratingService;

	@Test
	void createRating() {
		Rating rating = Rating.builder().rating(10).userId("").hotelId("")
				.feedback("this is created using feign client").build();

		ResponseEntity<Rating> createRating = ratingService.createRating(rating);

		System.out.println("New Rating created");

	}

}
