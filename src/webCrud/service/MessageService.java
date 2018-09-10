package webCrud.service;

import java.util.List;

import webCrud.dao.MessageDao;
import webCrud.dao.MessageDaoInterface;
import webCrud.domain.Message;

public class MessageService {
	
	MessageDaoInterface dao = new MessageDao();
	
	public void insert(Message m) {
		dao.insert(m);
	}
	
	public Message getById(Integer id) {
		return dao.getById(id);
	}
	
	public List<Message> getAll(){
		return dao.getAll();
	}
	
	public void update(Message m) {
		dao.update(m);
	}

	public void delete(Integer id) {
		dao.delete(id);
	}
}
