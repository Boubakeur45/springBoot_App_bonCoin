package dao;

import java.util.List;

import com.m2i.boncoin.entity.Annonce;
import com.m2i.boncoin.entity.Utilisateur;

public class LongAnnonce {

	public Annonce annonce;
	public Utilisateur seller;
	public List<Conversation> conversation;
	
	
	
	
	
	public LongAnnonce(Annonce annonce, Utilisateur seller, List<Conversation> conversation) {
		super();
		this.annonce = annonce;
		this.seller = seller;
		this.conversation = conversation;
	}
	public Annonce getAnnonce() {
		return annonce;
	}
	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}
	public Utilisateur getSeller() {
		return seller;
	}
	public void setSeller(Utilisateur seller) {
		this.seller = seller;
	}
	public List<Conversation> getConversation() {
		return conversation;
	}
	public void setConversation(List<Conversation> conversation) {
		this.conversation = conversation;
	}
	
	
}