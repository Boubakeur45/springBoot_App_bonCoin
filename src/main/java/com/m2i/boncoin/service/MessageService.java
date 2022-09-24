package com.m2i.boncoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.m2i.boncoin.entity.Message;
import com.m2i.boncoin.repository.MessageRepository;

@Service
public class MessageService {
	
	
	@Autowired
	MessageRepository repoMessage;
	
	//afficher les message
	
		public List<Message>  getAllMessage() {
			
			return repoMessage.findAll();
		}
		
		
		//ajouter une message
		
		public Message saveMessage(Message message){
			
			return repoMessage.save(message);
		}
		
		
		//modification message
       
	     public Message putMessage(Message message) {
	    	 
	    	 Message newMessage = repoMessage.findById(message.getId()).orElse(null);
	    	 
	    	 newMessage.setText(message.getText());
	    	 newMessage.setIdAchteur(message.getIdAchteur());
	    	 newMessage.setIdAnnonce(message.getIdAnnonce());
	    	 newMessage.setDateMessage(message.getDateMessage());
	    	 
	    	 repoMessage.save(newMessage);
	    	 return newMessage;
	    	 
	     }
	     
	     
	     //supprimer une message 
	     
	     public String deletMessage(int id) {
	    	 
	    	 if (repoMessage.findById(id).isPresent()) {
	    		 repoMessage.deleteById(id);
	    		 return "Deleted Message"+id;
	    	 }
	      return "Message not found"+id;
}
	     
	     //Récupérer tous les messages d'une annonce
	     
	     public List<Message> getAllMessageByIdAnnonce(int idAnnonce){
	          return repoMessage.getAllMessageByIdAnnonce(idAnnonce);
	}
	     
	     //Récupérer les messages envoyés par un utilisateur et trier les résultats par annonces
	     
	     public List<Message> getAllMessageByIdAchteur(int idAchteur){
	          return repoMessage.getAllMessageByIdAchteur(idAchteur);
	}
}


	     
