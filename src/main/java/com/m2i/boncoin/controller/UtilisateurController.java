package com.m2i.boncoin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.boncoin.entity.Utilisateur;
import com.m2i.boncoin.service.UtilisateurService;

@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateurController {
	
	
	@Autowired
	UtilisateurService utilisateurservice;
	
	
	@GetMapping("/allutilisateurs")
	
	public List<Utilisateur> getUtilisateur() {
		
		return utilisateurservice.getAllUtilisateur();
		
	}
	
	
	@PostMapping("/allutilisateurs")
	
	public Utilisateur postUtilisateur(@RequestBody Utilisateur u) {
		return utilisateurservice.saveUtilisateur(u);
		
	}
	
	@PutMapping("/allutilisateurs")
	
	public Utilisateur putUtilisateur(@RequestBody Utilisateur u) {
		
		return utilisateurservice.putUtilisateur(u);
	}
	
	@DeleteMapping("/{id}")
	
	public void deletUtilisateur(@RequestParam int id) {
		
		utilisateurservice.deletUtilisateur(id);
		
	}

}
