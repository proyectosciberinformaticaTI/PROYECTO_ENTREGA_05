package com.proyecto.bootcamp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.bootcamp.bean.Curse;
import com.proyecto.bootcamp.bean.Parents;
import com.proyecto.bootcamp.repository.CurseReactiveRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class cursesServiceImpl implements cursesService{

	
	@Autowired
	private CurseReactiveRepository repo;
	
	
	
	@Override
	public Mono<Curse> findByComplementName(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Curse> findByNumberidentify(String numberidentify) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Curse> findDateBirthbetween(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Curse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Curse> save(Parents parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Curse> delete(Parents parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Curse> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
