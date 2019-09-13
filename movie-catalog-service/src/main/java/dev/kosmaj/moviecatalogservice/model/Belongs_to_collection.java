package dev.kosmaj.moviecatalogservice.model;

public class Belongs_to_collection {
	private float id;
	private String name;
	private String poster_path;
	private String backdrop_path;

	// Getter Methods

	public Belongs_to_collection() {

	}

	public Belongs_to_collection(float id, String name, String poster_path, String backdrop_path) {
		super();
		this.id = id;
		this.name = name;
		this.poster_path = poster_path;
		this.backdrop_path = backdrop_path;
	}

	public float getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public String getBackdrop_path() {
		return backdrop_path;
	}

	// Setter Methods

	public void setId(float id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}
}
