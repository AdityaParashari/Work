package org.cap.theatermgt.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import net.bytebuddy.asm.Advice.Local;

@Entity
public class Movie {

	@Id
	private int movieId;
	private String movieName;
	private String movieGenre;
	private String movieDirector;
	private int movieLength;
	private String languages;
	private LocalDate movieReleaseDate;
	
	
	public Movie(int movieId, String movieName, String movieGenre, String movieDirector, int movieLength,
			String languages, LocalDate movieReleaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMovieId() {
		return movieId;
	}
	
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public int getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}
	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}


}

