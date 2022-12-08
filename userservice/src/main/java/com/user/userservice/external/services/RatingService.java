package com.user.userservice.external.services;

import com.user.userservice.entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

    @GetMapping("ratings/users/{userId}")
    Hotel getRating(@PathVariable String userId);
}
