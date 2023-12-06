package com.aziz.projets;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aziz.projets.entities.Domaine;
import com.aziz.projets.entities.Projet;
import com.aziz.projets.repos.ProjetRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class ProjetsApplicationTests {
	@Autowired
	private ProjetRepository projetRepository;

	@Test
	public void testCreateProjet() {
		Projet proj = new Projet("agame","jack",8520,new Date());
		projetRepository.save(proj);
	}
	
	@Transactional
	@Test
	public void testFindProjet()
	{
	Projet p = projetRepository.findById(1L).get(); 
	System.out.println(p);
	}
	
	@Transactional
	@Test
	public void testUpdateProjet()
	{
	Projet p = projetRepository.findById(1L).get();
	p.setCout(7300.0);
	projetRepository.save(p);
	}
	
	@Test
	public void testDeleteProjet()
	{
	projetRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousProjets()
	{
	List<Projet> projs = projetRepository.findAll();
	for (Projet p : projs)
	{
	System.out.println(p);
	}
	}
	
	 @Test
	 public void testFindByNomProjett()
	 {
	 List<Projet> projs = projetRepository.findByNomProjet("agame");
	 for (Projet p : projs)
	 {
	 System.out.println(p);
	 }

	}
	 
	 @Test
	 public void testFindByNomProduitContains ()
	 {
	 List<Projet> projs=projetRepository.findByNomProjetContains("agame");
	 for (Projet p : projs)
	 {
	 System.out.println(p);
	 } }
	 
	 @Test
	 public void testfindByNomCout()
	 {
	 List<Projet> projs = projetRepository.findByNomCout("agame", 7500.0);
	 for (Projet p : projs)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testfindByDomaine()
	 {
	 Domaine dom = new Domaine();
	 dom.setIdDom(1L);
	 List<Projet> projs = projetRepository.findByDomaine(dom);
	 for (Projet p : projs)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void findByDomaineIdDom()
	 {
	 List<Projet> projs = projetRepository.findByDomaineIdDom(1L);
	 for (Projet p : projs)
	 {
	 System.out.println(p);
	 }
	  }
	 
	 @Test
	 public void testfindByOrderByNomProjetAsc()
	 {
	 List<Projet> projs = 
	 projetRepository.findByOrderByNomProjetAsc();
	 for (Projet p : projs)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testTrierProjetsNomsPrix()
	 {
	 List<Projet> projs = projetRepository.trierProjetsNomsCout();
	 for (Projet p : projs)
	 {
	 System.out.println(p);
	 }
	 }

}
