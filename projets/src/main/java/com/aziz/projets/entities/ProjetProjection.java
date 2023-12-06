package com.aziz.projets.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProj", types = { Projet.class })
public interface ProjetProjection {
	public String getNomProjet();
	}