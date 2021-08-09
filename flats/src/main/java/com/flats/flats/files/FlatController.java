package com.flats.flats.files;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flats.flats.repository.FlatSearchService;
import com.flats.flats.service.FlatEntityService;

@RestController
public class FlatController {
	
	@Autowired
	private FlatSearchService flatSearchService;
	
	@Autowired
	private FlatEntityService entityService;
	
	@GetMapping("flats")
	public List<Flat> findAll(){
		return entityService.findAll();
	}
	
	@GetMapping("flats/{id}")
	public Optional<Flat> findById(@PathVariable long id) {
		return entityService.findById(id);
	}
	
	@PutMapping("flats/{id}")
	public void update(@PathVariable long id, @RequestBody Flat flat) {
		entityService.put(flat, id);
	}

	@PostMapping("flats")
	public void post(@RequestBody Flat flat) {
		entityService.post(flat);
	}
	
	@DeleteMapping("flats/{id}")
	public void deleteById(@PathVariable long id) {
		entityService.deleteById(id);
	}
	
	@PostMapping("search")
	public List<Flat> search(@RequestBody SearchDTO dto) {
	return flatSearchService.searchFlats(dto);
	}
}
