package dev.kosmaj.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kosmaj.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId")String movieId) {
		return new Movie("99", "Godzila", "movie about Godzila etc.");
	}
}
