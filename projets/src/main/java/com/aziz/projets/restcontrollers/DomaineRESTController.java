package com.aziz.projets.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aziz.projets.entities.Domaine;
import com.aziz.projets.repos.DomaineRepository;

@RestController
@RequestMapping("/api/dom")
@CrossOrigin("*")
public class DomaineRESTController {
	@Autowired
	DomaineRepository domaineRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Domaine> getAllDomaines()
	{
	return domaineRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Domaine getDomaineById(@PathVariable("id") Long id) {
	return domaineRepository.findById(id).get();
	}
	

	}
