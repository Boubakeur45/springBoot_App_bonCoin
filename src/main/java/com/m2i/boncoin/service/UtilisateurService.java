package com.m2i.boncoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.boncoin.entity.Utilisateur;
import com.m2i.boncoin.repository.UtilisateurRepository;

@Service
public class UtilisateurService {
	
	
	@Autowired
	
	UtilisateurRepository repoUtilisateur;
	
	
	
	//Afficher utilisateur
	
	public List<Utilisateur>  getAllUtilisateur() {
		
		return repoUtilisateur.findAll();
	}
	
	
	//ajouter une utilisateur
	
	public Utilisateur saveUtilisateur(Utilisateur utilisateur){
		
		return repoUtilisateur.save(utilisateur);
	}
	
	
	//modification utilisateur
   
     public Utilisateur putUtilisateur(Utilisateur utilisateur) {
    	 
    	 Utilisateur newUtilisateur = repoUtilisateur.findById(utilisateur.getId()).orElse(null);
    	 
    	 newUtilisateur.setNom(utilisateur.getNom());
    	 newUtilisateur.setPrenom(utilisateur.getPrenom());
    	 newUtilisateur.setEmail(utilisateur.getEmail());
    	 newUtilisateur.setTelephone(utilisateur.getTelephone());
    	 
    	 repoUtilisateur.save(newUtilisateur);
    	 return newUtilisateur;
    	 
     }
     
     
     //supprimer une utilisateur
     
     public String deletUtilisateur(int id) {
    	 
    	 if (repoUtilisateur.findById(id).isPresent()) {
    		 repoUtilisateur.deleteById(id);
    		 return "Deleted Utilisateur"+id;
    	 }
      return "Utilisateur not found"+id;
}

}
