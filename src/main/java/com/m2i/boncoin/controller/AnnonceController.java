package com.m2i.boncoin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.boncoin.entity.Annonce;

import com.m2i.boncoin.service.AnnonceService;


@RestController
@RequestMapping("/api/annonce")
public class AnnonceController {
	
	
	@Autowired
	AnnonceService annonceService;
	
	
	@GetMapping("/allannonces")
	
	public List<Annonce> getannonce() {
		
		return annonceService.getAllAnnonce();
		
	}
	
	
	@PostMapping("/allannonces")
	
	public Annonce postAnnonce(@RequestBody Annonce a) {
		return annonceService.saveAnnonce(a);
		
	}
	
	@PutMapping("/allannonces")
	
	public Annonce putAnnonce(@RequestBody Annonce a) {
		
		return annonceService.putAnnonce(a);
	}
	
	@DeleteMapping("/{id}")
	
	public void deletAnnonce(@RequestParam int id) {
		
		annonceService.deletAnnonce(id);
		
	}
	
	//Récupérer toutes les annonces d'un utilisateur en recevant est id en paramètre
	
	@GetMapping("/utilisateur/{idUtilisateur}")
	public List<Annonce> getAllAnnonceByIdUtilisateur(@PathVariable int idUtilisateur){
		return annonceService.getAllAnnonceByIdUtilisateur(idUtilisateur);
	}
	
	  //Récupérer toutes les annonces inférieures au prix envoyer en paramètre
	
	@GetMapping("/prix/{prix}")
	public List<Annonce> getAllAnnonceByPrix(@PathVariable int prix){
		return annonceService.getAllAnnonceByPrix(prix);
	}
	
	@GetMapping("/titre/{titre}")
	public List<Annonce> getAllAnnonceByTitre(@PathVariable String titre){
		return annonceService.getAllAnnonceByTitre(titre);
	}
	 

}
