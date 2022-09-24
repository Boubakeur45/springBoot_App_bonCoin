package com.m2i.boncoin.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.m2i.boncoin.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{
	
	//Récupérer tous les messages d'une annonce
	@Query("SELECT m FROM Message m WHERE m.idAnnonce =:idAnnonce ")
	
	public List<Message> getAllMessageByIdAnnonce(@Param("idAnnonce") int id);
	
    //Récupérer les messages envoyés par un utilisateur et trier les résultats par annonces
	
	@Query("SELECT m FROM Message m WHERE m.idAchteur =:idAchteur ORDER BY idAnnonce")
	public List<Message> getAllMessageByIdAchteur(@Param("idAchteur") int id);
	
}
