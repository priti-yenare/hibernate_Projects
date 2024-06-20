package habernetprojject.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="anstable")
public class Answer {
	@Id
	private String ansid;
	private String answer;
	public String getAnsid() {
		return ansid;
	}
	public void setAnsid(String ansid) {
		this.ansid = ansid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
