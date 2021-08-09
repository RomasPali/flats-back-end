package com.flats.flats.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flats.flats.files.Flat;

@Repository
public interface FlatsCrudRepository extends CrudRepository<Flat, Long>{

}
