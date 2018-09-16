package webCrud.domain;

public class Message {
	String to;
	String msg;
	Integer id;
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		if (!super.equals(object)) return false;
		Message message = (Message) object;
		return java.util.Objects.equals(to, message.to) &&
				java.util.Objects.equals(msg, message.msg) &&
				java.util.Objects.equals(id, message.id);
	}

	public int hashCode() {
		return Objects.hash(super.hashCode(), to, msg, id);
	}

}
