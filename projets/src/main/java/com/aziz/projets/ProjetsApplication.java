package com.aziz.projets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.aziz.projets.entities.Projet;

@SpringBootApplication
public class ProjetsApplication  implements CommandLineRunner {
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(ProjetsApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Projet.class);

}
}