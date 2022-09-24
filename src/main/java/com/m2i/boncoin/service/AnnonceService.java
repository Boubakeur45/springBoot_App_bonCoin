package com.m2i.boncoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.boncoin.entity.Annonce;
import com.m2i.boncoin.repository.AnnonceRepository;

@Service
public class AnnonceService {
	
	
	@Autowired
	
    AnnonceRepository repoAnnonce;
	
	//afficher les annonces
	
	public List<Annonce> getAllAnnonce() {
		
		return repoAnnonce.findAll();
	}
	
	
	//ajouter une annonce
	
	public Annonce saveAnnonce(Annonce annonce){
		
		return repoAnnonce.save(annonce);
	}
	
	
	//modification Annonce

     public Annonce putAnnonce(Annonce annonce) {
    	 
    	 Annonce newAnnonce=repoAnnonce.findById(annonce.getId()).orElse(null);
    	 
    	 newAnnonce.setTitre(annonce.getTitre());
    	 newAnnonce.setDescription(annonce.getDescription());
    	 newAnnonce.setDatePublication(annonce.getDatePublication());
    	 newAnnonce.setPrix(annonce.getPrix());
    	 newAnnonce.setIdUtilisateur(annonce.getIdUtilisateur());
    	 
    	 repoAnnonce.save(newAnnonce);
    	 
    	 return newAnnonce;
     }
     
     
     //supprimer une annonce 
     
     public String deletAnnonce(int id) {
    	 
    	 if ((repoAnnonce.findById(id)).isPresent()){
    		 repoAnnonce.deleteById(id);
    		 return "Deleted Annonce"+id;
    	 }
    	 return "Annonce not found"+id;
     }
     
     //Récupérer toutes les annonces d'un utilisateur en recevant est id en paramètre
     
     public List<Annonce> getAllAnnonceByIdUtilisateur(int idUtilisateur){
          return repoAnnonce.getAllAnnonceByIdUtilisateur(idUtilisateur);
}

   //Récupérer toutes les annonces inférieures au prix envoyer en paramètre
     
     public List<Annonce> getAllAnnonceByPrix(int prix){
         return repoAnnonce.getAllAnnonceByPrix(prix);

     }
     
   //Récupérer toutes les annonces contenant le texte envoyer en paramètre
 	//dans leur titre tout en triant les réponses par un 2ème paramètre permettant de
 	//choisir entre prix, date de publication ou titre.
     
     public List<Annonce> getAllAnnonceByTitre(String titre){
         return repoAnnonce.getAllAnnonceByTitreOrderByDate(titre);

     }

}
