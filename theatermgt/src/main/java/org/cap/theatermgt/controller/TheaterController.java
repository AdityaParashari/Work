package org.cap.theatermgt.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.cap.theatermgt.dto.ScreenDto;
import org.cap.theatermgt.dto.TheaterDetailsDto;
import org.cap.theatermgt.dto.AddTheaterDto;
import org.cap.theatermgt.entities.Screen;
import org.cap.theatermgt.entities.Theater;
import org.cap.theatermgt.service.ITheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theaters")
public class TheaterController {
	
	@Autowired
	private ITheaterService service;
	
	/*
	 * Adding only theater without movie and screens
	 */
	@PostMapping("/add")
	public ResponseEntity<Theater> addTheater(@RequestBody AddTheaterDto theaterDto)
	{
		Theater theater =  convert(theaterDto);
		service.save(theater);
		ResponseEntity<Theater> response = new ResponseEntity<Theater>(theater, HttpStatus.OK);
		return response;
	}
	
	@GetMapping
	public ResponseEntity<List<Theater>> fetchAll()
	{
		List<Theater> theaters = service.fetchAll();
		ResponseEntity<List<Theater>> response = new ResponseEntity<>(theaters, HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/findTheater/{id}")
	public ResponseEntity<Theater> fetchById(@PathVariable("id") int theaterId){
		Theater th = service.fetchById(theaterId);
		ResponseEntity<Theater> response = new ResponseEntity<Theater>(th, HttpStatus.OK);
		return response;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTheater(@PathVariable("id") int theaterId){
		String result = service.delete(theaterId);
		ResponseEntity<String> response = new ResponseEntity<String>(result, HttpStatus.OK);
		return response;
	}
	
	/*
	 * ------------------------    Screen    --------------------------------
	 */
	@PostMapping("/addScreen")
	public ResponseEntity<Screen> addScreen(@RequestBody ScreenDto dto){
		/*
		 * HashMap<Integer, Screen> hashscreen = convertScreen(dto); 
		 * Theater theater = service.fetchById(dto.getTheaterId()); 
		 * theater.setListOfScreens(hashscreen);
		 */
		//service.save(theater); ---> error here
		Screen screen = convertScreen(dto);
		ResponseEntity<Screen> response = new ResponseEntity<Screen>(screen, HttpStatus.OK);
		return response;
	}

	public Screen convertScreen(ScreenDto dto) {
		Screen screen = new Screen();
		screen.setScreenId(dto.getScreenId());
		screen.setTheaterId(dto.getTheaterId());
		screen.setScreenName(dto.getScreenName());
		screen.setRow(dto.getRows());
		screen.setColumn(dto.getColumns());
		
		return screen;
	}
	
	private HashMap<Integer, Screen> hashScreen(ScreenDto dto)
	{
		HashMap<Integer, Screen> hashScreen = new HashMap<>();
		Screen screen = new Screen();
		screen.setScreenId(dto.getScreenId());
		screen.setTheaterId(dto.getTheaterId());
		screen.setScreenName(dto.getScreenName());
		screen.setRow(dto.getRows());
		screen.setColumn(dto.getColumns());
		hashScreen.put(dto.getScreenId(), screen); 
		return hashScreen;
	}
	
	
	private Theater convert(AddTheaterDto theaterdto) {
		Theater theater = new Theater();
		theater.setTheaterId(theaterdto.getTheaterId());
		theater.setTheaterName(theaterdto.getTheaterName());
		theater.setTheaterCity(theaterdto.getTheaterCity());
		theater.setManagerName(theaterdto.getManagerName());
		theater.setManagerContact(theaterdto.getManagerContact());
		return theater;
	}
}


