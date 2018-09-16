package webCrud.service;

import java.util.List;

import webCrud.dao.MessageDao;
import webCrud.dao.MessageDaoInterface;
import webCrud.domain.Message;
import webCrud.exception.DAOException;

public class MessageService {
	
	MessageDaoInterface dao = new MessageDao();
	
	public void insert(Message m) {
	    try {
            dao.insert(m);
        } catch (DAOException e) {
	        e.printStackTrace();
        }

	}
	
	public Message getById(Integer id) {
        try {
            return dao.getById(id);
        } catch (DAOException e) {
            e.printStackTrace();
        }
	}
	
	public List<Message> getAll(){
        try {
            return dao.getAll();
        } catch (DAOException e) {
            e.printStackTrace();
        }
	}
	
	public void update(Message m) {
        try {
            dao.update(m);
        } catch (DAOException e) {
            e.printStackTrace();
        }
	}

	public void delete(Integer id) {
        try {
            dao.delete(id);
        } catch (DAOException e) {
            e.printStackTrace();
        }
	}

}
