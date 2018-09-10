package webCrud.db;

import java.util.ArrayList;

import webCrud.domain.Message;

public class DB {
	private static DB instance;
	
	ArrayList<Message> data;
	
	
	private DB(){
		data = new ArrayList<Message>();
				
		Message msg1 = new Message();
		msg1.setId(1);
		msg1.setMsg("Primeira mensagem");
		msg1.setTo("Destinatario 1");
		
		Message msg2 = new Message();
		msg2.setId(2);
		msg2.setMsg("Segunda mensagem");
		msg2.setTo("Destinatario 2");
		
		Message msg3 = new Message();
		msg3.setId(3);
		msg3.setMsg("Terceira mensagem");
		msg3.setTo("Destinatario 3");
		
		data.add(msg1);
		data.add(msg2);
		data.add(msg3);
	}
	
	public static synchronized DB getInstance() {
		if(instance==null) {
			instance = new DB();
		}
		return instance;
	}

	public ArrayList<Message> getData() {
		return data;
	}

}
