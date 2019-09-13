package dev.kosmaj.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kosmaj.ratingsdataservice.model.Rating;
import dev.kosmaj.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingsResources {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating("001", 10);
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) {
		
		List<Rating> ratings = Arrays.asList(
				new Rating("003", 7),
				new Rating("005", 6)
				);
		
		UserRating userRatings = new UserRating();
		userRatings.setUserRatings(ratings);
		return userRatings;
		
	}

}
