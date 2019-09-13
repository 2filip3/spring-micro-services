package dev.kosmaj.moviecatalogservice.model;

import java.util.ArrayList;

public class MovieSummary {

	private boolean adult;
	private String backdrop_path;
	Belongs_to_collection Belongs_to_collectionObject;
	private float budget;
	ArrayList<Object> genres = new ArrayList<Object>();
	private String homepage;
	private float id;
	private String imdb_id;
	private String original_language;
	private String original_title;
	private String overview;
	private float popularity;
	private String poster_path;
	ArrayList<Object> production_companies = new ArrayList<Object>();
	ArrayList<Object> production_countries = new ArrayList<Object>();
	private String release_date;
	private float revenue;
	private float runtime;
	ArrayList<Object> spoken_languages = new ArrayList<Object>();
	private String status;
	private String tagline;
	private String title;
	private boolean video;
	private float vote_average;
	private float vote_count;
	
	

	// Getter Methods

	public MovieSummary(boolean adult, String backdrop_path, Belongs_to_collection belongs_to_collectionObject,
			float budget, ArrayList<Object> genres, String homepage, float id, String imdb_id, String original_language,
			String original_title, String overview, float popularity, String poster_path,
			ArrayList<Object> production_companies, ArrayList<Object> production_countries, String release_date,
			float revenue, float runtime, ArrayList<Object> spoken_languages, String status, String tagline,
			String title, boolean video, float vote_average, float vote_count) {
		super();
		this.adult = adult;
		this.backdrop_path = backdrop_path;
		Belongs_to_collectionObject = belongs_to_collectionObject;
		this.budget = budget;
		this.genres = genres;
		this.homepage = homepage;
		this.id = id;
		this.imdb_id = imdb_id;
		this.original_language = original_language;
		this.original_title = original_title;
		this.overview = overview;
		this.popularity = popularity;
		this.poster_path = poster_path;
		this.production_companies = production_companies;
		this.production_countries = production_countries;
		this.release_date = release_date;
		this.revenue = revenue;
		this.runtime = runtime;
		this.spoken_languages = spoken_languages;
		this.status = status;
		this.tagline = tagline;
		this.title = title;
		this.video = video;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
	}
	
	public MovieSummary() {
		
	}


	public boolean getAdult() {
		return adult;
	}

	public String getBackdrop_path() {
		return backdrop_path;
	}

	public Belongs_to_collection getBelongs_to_collection() {
		return Belongs_to_collectionObject;
	}

	public float getBudget() {
		return budget;
	}

	public String getHomepage() {
		return homepage;
	}

	public float getId() {
		return id;
	}

	public String getImdb_id() {
		return imdb_id;
	}

	public String getOriginal_language() {
		return original_language;
	}

	public String getOriginal_title() {
		return original_title;
	}

	public String getOverview() {
		return overview;
	}

	public float getPopularity() {
		return popularity;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public String getRelease_date() {
		return release_date;
	}

	public float getRevenue() {
		return revenue;
	}

	public float getRuntime() {
		return runtime;
	}

	public String getStatus() {
		return status;
	}

	public String getTagline() {
		return tagline;
	}

	public String getTitle() {
		return title;
	}

	public boolean getVideo() {
		return video;
	}

	public float getVote_average() {
		return vote_average;
	}

	public float getVote_count() {
		return vote_count;
	}

	// Setter Methods

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}

	public void setBelongs_to_collection(Belongs_to_collection belongs_to_collectionObject) {
		this.Belongs_to_collectionObject = belongs_to_collectionObject;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public void setId(float id) {
		this.id = id;
	}

	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}

	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}

	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public void setPopularity(float popularity) {
		this.popularity = popularity;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}

	public void setRuntime(float runtime) {
		this.runtime = runtime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setVideo(boolean video) {
		this.video = video;
	}

	public void setVote_average(float vote_average) {
		this.vote_average = vote_average;
	}

	public void setVote_count(float vote_count) {
		this.vote_count = vote_count;
	}
}
