package webCrud.dao;

import java.util.ArrayList;
import java.util.List;

import webCrud.db.DB;
import webCrud.domain.Message;

public class MessageDao implements MessageDaoInterface {
	ArrayList<Message> db = DB.getInstance().getData();
	
	public MessageDao(){}
	
	
	public void insert(Message m) {
		Integer maxId = 0;
		for(int i=0 ; i<db.size() ; i++) {
			if(db.get(i).getId()==m.getId()) {
				return;
			}
			maxId = db.get(i).getId()>maxId? db.get(i).getId() : maxId;  
		}
		m.setId(maxId+1);
		db.add(m);
		return;
	}
	
	public Message getById(Integer id){
		for(Message m : db) {
			if(m.getId()==id) {
				return m;
			}
		}
		return null;
	}
	
	public List<Message> getAll(){
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
		return;
	}

	public void delete(Integer id) {
		for(int i=0 ; i<db.size(); i++) {
			if(db.get(i).getId()==id) {
				db.remove(i);
				System.out.println("Removed");
				return;
			}
		}
		System.out.println("Not Removed");
		return;
	}
	
}



