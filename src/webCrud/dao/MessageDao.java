package webCrud.dao;

import java.util.ArrayList;
import java.util.List;

import webCrud.db.DB;
import webCrud.domain.Message;
import webCrud.exception.DAOException;


public class MessageDao implements MessageDaoInterface {
	ArrayList<Message> db = DB.getInstance().getData();
	
	public MessageDao(){}

	public void insert(Message m) {
		Integer maxId = 0;
		for(int i=0 ; i<db.size() ; i++) {
			if(db.get(i).getId()==m.getId()) {
				throw new DAOException("Erro ao inserir no banco de dados");
			}
			maxId = db.get(i).getId()>maxId? db.get(i).getId() : maxId;  
		}
		m.setId(maxId+1);
		db.add(m);
	}
	
	public Message getById(Integer id){
		for(Message m : db) {
			if(m.getId()==id) {
				return m;
			}
		}
		throw new DAOException("Houve um erro na busca, id não encontrado");
	}
	
	public List<Message> getAll(){
		if (db == null) {
			throw new DAOException("Houve um erro na busca, lista não inicializada");
		}
		return db;
	}
	
	public void update(Message m) {
		for(int i=0 ; i<db.size(); i++) {
			if(db.get(i).getId()==m.getId()) {
				db.get(i).setMsg(m.getMsg());
				db.get(i).setTo(m.getTo());
				return;
			}
		}
		throw new DAOException("Erro em atualizar a mensagem, id não encontrado");
	}

	public void delete(Integer id) {
		for(int i=0 ; i<db.size(); i++) {
			if(db.get(i).getId()==id) {
				db.remove(i);
				System.out.println("Removed");
				return;
			}
		}
		throw new DAOException("Erro em deletar a mensagem, id não encontrado");
		return;
	}
	
}



