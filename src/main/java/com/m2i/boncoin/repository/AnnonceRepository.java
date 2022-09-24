package com.m2i.boncoin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.m2i.boncoin.entity.Annonce;

public interface AnnonceRepository extends JpaRepository<Annonce, Integer> {
	
	//Récupérer toutes les annonces d'un utilisateur en recevant est id en paramètre
	
	@Query("SELECT a FROM Annonce a WHERE a.idUtilisateur =:idUtilisateur")
	
	public  List<Annonce> getAllAnnonceByIdUtilisateur(@Param("idUtilisateur") int id);
	
	
	//Récupérer toutes les annonces inférieures au prix envoyer en paramètre
	
	@Query("SELECT a FROM Annonce a WHERE a.prix <:prix")
	public  List<Annonce> getAllAnnonceByPrix(@Param("prix") int prix);
	
	
	//Récupérer toutes les annonces contenant le texte envoyer en paramètre
	//dans leur titre tout en triant les réponses par un 2ème paramètre permettant de
	//choisir entre prix, date de publication ou titre.
    
	@Query("SELECT a FROM Annonce a WHERE a.titre LIKE %:titre% ORDER BY datePublication")
	
	public List<Annonce> getAllAnnonceByTitreOrderByDate(@Param("titre") String titre);
	
	
	
	//envoyer id une annonce en paramètre et récupérer un objet contenant : 
	//L'annonce ainsi qu'une liste contenant 2 users et tous les messages qu'ils se sont envoyé. Pour cela renseignes-toi sur les DAO (Dynamic Acces Objet)
	
	//@Query("SELECT a FROM Annonce a,Message m,Utilisateur u WHERE  u.id =:idUtilisateur")
     
}
