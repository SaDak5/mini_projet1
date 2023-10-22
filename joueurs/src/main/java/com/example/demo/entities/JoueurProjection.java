package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "postJoueur", types = { Joueur.class })
public interface JoueurProjection {
	public String getPostJoueur();
}
