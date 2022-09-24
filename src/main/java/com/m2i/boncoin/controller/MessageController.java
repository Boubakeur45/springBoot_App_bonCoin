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


import com.m2i.boncoin.entity.Message;
import com.m2i.boncoin.service.MessageService;



@RestController
@RequestMapping("/api/message")
public class MessageController {
	
	
	@Autowired
	MessageService messageService;
	
	

	@GetMapping("/allmessages")
	
	public List<Message> getmessages() {
		
		return messageService.getAllMessage();
		
	}
	
	
	@PostMapping("/allmessages")
	
	public Message postMessage(@RequestBody Message m) {
		return messageService.saveMessage(m);
		
	}
	
	@PutMapping("/allmessages")
	
	public Message putMessage(@RequestBody Message m) {
		
		return messageService.putMessage(m);
	}
	
	@DeleteMapping("/{id}")
	
	public void deletMessage(@RequestParam int id) {
		
		messageService.deletMessage(id);
		
	}
	
	////Récupérer tous les messages d'une annonce
	
	@GetMapping("/annonce/{idAnnonce}")
	public List<Message> getAllMessageByIdAnnonce(@PathVariable int idAnnonce){
		return messageService.getAllMessageByIdAnnonce(idAnnonce);
	}
	
	//Récupérer les messages envoyés par un utilisateur et trier les résultats par annonces
	
	@GetMapping("/achteur/{idAchteur}")
	public List<Message> getAllMessageByIdAchteur(@PathVariable int idAchteur){
		return messageService.getAllMessageByIdAchteur(idAchteur);
	}
	

}
