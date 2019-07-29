package dev.kosmaj.moviecatalogservice.resources;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import dev.kosmaj.moviecatalogservice.model.CatalogMovie;
import dev.kosmaj.moviecatalogservice.model.Movie;
import dev.kosmaj.moviecatalogservice.model.Rating;
import dev.kosmaj.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResources {
	
	@Autowired
	private RestTemplate restTemplate;
	// prva mala github izmena
	//@Autowired
	//private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogMovie> getMovies(@PathVariable("userId") String userId) {
		
		UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratings/users/" + userId, UserRating.class);
		
		return ratings.getUserRatings().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
			
			//Web client builder usage
			/*Movie movie = webClientBuilder.build() //web client
					.get()	//type
					.url("http://localhost:8081/movies/" + rating.getMovieId())	//url
					.retrieve()
					.bodyToMono(Movie.class)
					.block();
			*/
			return new CatalogMovie(movie.getName(),movie.getDescription(), rating.getRating());
		}).collect(Collectors.toList());
	}

}
