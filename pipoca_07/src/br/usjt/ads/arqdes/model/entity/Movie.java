package br.usjt.ads.arqdes.model.entity;

import java.util.Date;

public class Movie {
    private String poster_path;
    private Boolean adult;
    private String overview;
    private Date release_date;
    private int[] genre_ids;
    private int id;
    public double getPopularity() {
		return popularity;
	}

	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}

	private String original_title;
    private String original_language;
    private String title;
    private String backdrop_path;
    private double popularity;
    private String vote_count;
    private boolean video;
    private double vote_average;
    
    
	public String getPoster_path() {
		return poster_path;
	}
	
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	
	public Boolean getAdult() {
		return adult;
	}
	
	public void setAdult(Boolean adult) {
		this.adult = adult;
	}
	
	public String getOverview() {
		return overview;
	}
	
	public void setOverview(String overview) {
		this.overview = overview;
	}
	
	public Date getRelease_date() {
		return release_date;
	}
	
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	
	public int[] getGenre_ids() {
		return genre_ids;
	}
	
	public void setGenre_ids(int[] genre_ids) {
		this.genre_ids = genre_ids;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getOriginal_title() {
		return original_title;
	}
	
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}
	
	public String getOriginal_language() {
		return original_language;
	}
	
	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBackdrop_path() {
		return backdrop_path;
	}
	
	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}
	
	public String getVote_count() {
		return vote_count;
	}
	
	public void setVote_count(String vote_count) {
		this.vote_count = vote_count;
	}
	
	public boolean isVideo() {
		return video;
	}
	
	public void setVideo(boolean video) {
		this.video = video;
	}
	
	public double getVote_average() {
		return vote_average;
	}
	
	public void setVote_average(double vote_average) {
		this.vote_average = vote_average;
	}
}
