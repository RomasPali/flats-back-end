package com.flats.flats.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.flats.flats.files.Flat;
import com.flats.flats.files.QFlat;
import com.flats.flats.files.SearchDTO;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class FlatSearchService {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Flat> searchFlats(SearchDTO dto){
		final JPAQuery<Flat> query = new JPAQuery<>(em);
        final QFlat qflat = QFlat.flat;
		return query.from(qflat).where(qflat.price.between(dto.getPriceFrom(), dto.getPriceTo()).
				and(qflat.floor.between(dto.getFloorsFrom(), dto.getFloorsTo()))).fetch();
		
	}

}
