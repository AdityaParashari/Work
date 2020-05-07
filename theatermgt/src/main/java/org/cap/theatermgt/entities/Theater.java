package org.cap.theatermgt.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table(name = "theaters")
public class Theater {

	@Id
	@GeneratedValue
	private Integer theaterId;
	
	private String theaterName;
	private String theaterCity;
	/* private Movie movie; */
	HashMap<Integer, Movie> hsmovie;
	HashMap<Integer, Screen> listOfScreens; 
	private String managerName;
	private	String managerContact;
	

	public Integer getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterCity() {
		return theaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	public HashMap<Integer, Movie> getHsmovie() {
		return hsmovie;
	}
	public void setHsmovie(HashMap<Integer, Movie> hsmovie) {
		this.hsmovie = hsmovie;
	}

	public HashMap<Integer, Screen> getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(HashMap<Integer, Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

}
