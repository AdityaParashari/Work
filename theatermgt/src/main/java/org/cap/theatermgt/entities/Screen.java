package org.cap.theatermgt.entities;

import javax.persistence.Entity;

import javax.persistence.Id;

import java.util.*;

@Entity
public class Screen {
	
	@Id
	private int screenId;
	private int theaterId;
	private String screenName;
	HashMap<Integer, Show> hsshows;
	private int row;
	private int column;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public HashMap<Integer, Show> getHsshows() {
		return hsshows;
	}
	public void setHsshows(HashMap<Integer, Show> hsshows) {
		this.hsshows = hsshows;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	
}
