package com.flats.flats.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flats.flats.files.Flat;
import com.flats.flats.repository.FlatsCrudRepository;

@Service
public class FlatEntityService {

	@Autowired
	private FlatsCrudRepository flatsCrudRepository;

	public List<Flat> findAll() {
		List<Flat> flats = (List<Flat>) flatsCrudRepository.findAll();
		return flats;
	}

	public Optional<Flat> findById(long id) {
		Optional<Flat> flat = flatsCrudRepository.findById(id);
		return flat;
	}
	
	public void deleteById(long id) {
		Optional<Flat> flat = flatsCrudRepository.findById(id);
		flatsCrudRepository.delete(flat.get());
	}

	public void put(Flat flat, long id) {
		flat.setId(id);
		flatsCrudRepository.save(flat);
	}
	
	public void post(Flat flat) {
		flatsCrudRepository.save(flat);
	}
}
