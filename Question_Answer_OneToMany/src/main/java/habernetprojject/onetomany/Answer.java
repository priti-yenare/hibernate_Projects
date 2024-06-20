package habernetprojject.onetomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Answer {
   @Id
	private String ans_id;
	private String ans;
	@ManyToOne
	private Question que;
	public String getAns_id() {
		return ans_id;
	}
	public void setAns_id(String ans_id) {
		this.ans_id = ans_id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Question getQue() {
		return que;
	}
	public void setQue(Question que) {
		this.que = que;
	}
	
}
	
	
