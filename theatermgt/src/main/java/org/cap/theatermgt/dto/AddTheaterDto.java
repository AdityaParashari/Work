package org.cap.theatermgt.dto;

import java.util.HashMap;

import org.cap.theatermgt.entities.Movie;
import org.cap.theatermgt.entities.Screen;

public class AddTheaterDto {
	
	private int theaterId;
	private String theaterName;
	private String theaterCity;
	private String managerName;
	private	String managerContact;
	HashMap<Integer, Movie> hsmovie = new HashMap<>();
	HashMap<Integer, Screen> listOfScreens; 
	
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
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
	
	

}
