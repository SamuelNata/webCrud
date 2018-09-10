package webCrud.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import webCrud.domain.Message;
import webCrud.service.MessageService;

@ManagedBean
@SessionScoped
public class MsgBean {
	MessageService service = new MessageService(); 
	Message newMessage = new Message();
	
	public MsgBean(){}
	
	public List<Message> getList(){
		return service.getAll();
	}
		
	
	public String insert(){
		service.insert(newMessage);
		newMessage = new Message();
		return "list.xhtml";
	}
	
	public String update(){
		service.update(newMessage);
		newMessage = new Message();
		return "list.xhtml";
	}
	
	public String delete(Integer id) {
		service.delete(id);
		return "list.xhtml";
	}
	
	public void loadEditMsg() {
		String id;
		FacesContext context = FacesContext.getCurrentInstance();
		id = context.getExternalContext().getRequestParameterMap().get("id");
		System.out.println("id: " + id);
		if(id!=null && !id.equals("")) {
			newMessage = service.getById(Integer.parseInt(id));
		}
	}
	
	public Message getNewMessage() {
		return newMessage;
	}
}
