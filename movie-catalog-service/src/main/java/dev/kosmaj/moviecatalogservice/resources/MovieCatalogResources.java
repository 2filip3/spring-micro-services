package dev.kosmaj.moviecatalogservice.resources;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.configuration.resolver.CatalogResolver.Catalog;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
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

	// ClientHttpRequestFactory requestFactory = new
	// HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());

	@Autowired
	private RestTemplate restTemplate;

	// @Autowired
	// private WebClient.Builder webClientBuilder;

	@RequestMapping("/{userId}")
	public List<CatalogMovie> getMovies(@PathVariable("userId") String userId) {

		// Web client builder usage
		/*
		 * Movie movie = webClientBuilder.build() //web client .get() //type
		 * .url("http://localhost:8081/movies/" + rating.getMovieId()) //url .retrieve()
		 * .bodyToMono(Movie.class) .block();
		 */
		String noData = "no data";
		UserRating ratings = restTemplate.getForObject("http://ratings-data-service:8082/ratings/users/" + userId,
				UserRating.class);

		return ratings.getUserRatings().stream().map(rating -> {

			Movie movie = restTemplate.getForObject("http://movie-info-service:8081/movies/" + rating.getMovieId(), Movie.class);
			if (movie.getName().equalsIgnoreCase(noData)) {
				return new CatalogMovie("no data", "no data", 0);
			}

			return new CatalogMovie(movie.getName(), movie.getDescription(), rating.getRating());
		}).collect(Collectors.toList());

	}

}
