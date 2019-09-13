package dev.kosmaj.movieinfoservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import dev.kosmaj.movieinfoservice.model.Movie;
import dev.kosmaj.movieinfoservice.model.MovieSummary;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${api.key}")
	private String apiKey;

	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		
		Movie movieNull = new Movie(movieId, "no data", "no data");

		try {
			MovieSummary movieSummary = restTemplate.getForObject( 
					"https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey, MovieSummary.class);
			return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("\n********  There is no movie under ID: " + movieId + "  ********");
		}
		
		return movieNull;

	}

	/*
	 * @RequestMapping("/{movieId}") public Movie
	 * getMovie(@PathVariable("movieId")String movieId) { return new Movie(movieId,
	 * "name of the movie", "description of the movie"); }
	 */
}
