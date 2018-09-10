package webCrud.dao;

import java.util.List;

import webCrud.domain.Message;

public interface MessageDaoInterface {
		
	public void insert(Message m);
	
	public Message getById(Integer id);
	
	public List<Message> getAll();
	
	public void update(Message m);

	public void delete(Integer id);
	
}
