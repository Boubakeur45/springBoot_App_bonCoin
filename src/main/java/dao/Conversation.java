package dao;

import java.util.List;

import com.m2i.boncoin.entity.Message;
import com.m2i.boncoin.entity.Utilisateur;

public class Conversation {
	
	public Utilisateur buyer;
	public List<Message> messagesList;
	
	
	
	public Conversation(Utilisateur buyer, List<Message> messagesList) {
		super();
		this.buyer = buyer;
		this.messagesList = messagesList;
	}
	public Utilisateur getBuyer() {
		return buyer;
	}
	public void setBuyer(Utilisateur buyer) {
		this.buyer = buyer;
	}
	public List<Message> getMessagesList() {
		return messagesList;
	}
	public void setMessagesList(List<Message> messagesList) {
		this.messagesList = messagesList;
	}
	
	
}