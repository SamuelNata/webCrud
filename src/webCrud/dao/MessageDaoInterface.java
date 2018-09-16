package webCrud.dao;

import java.util.List;

import webCrud.domain.Message;
import webCrud.exception.DAOException;

public interface MessageDaoInterface {
		
	public void insert(Message m) throws DAOException;
	
	public Message getById(Integer id) throws DAOException;
	
	public List<Message> getAll() throws DAOException;
	
	public void update(Message m) throws DAOException;

	public void delete(Integer id) throws DAOException;
	
}
