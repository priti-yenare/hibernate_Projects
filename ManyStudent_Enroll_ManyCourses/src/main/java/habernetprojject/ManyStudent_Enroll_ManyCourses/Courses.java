package habernetprojject.ManyStudent_Enroll_ManyCourses;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Courses {
	@Id
	private int Course_Id;
	private String Course_Name;
	private String Course_Duration;
	@ManyToMany
	private List<Students> student;

	public int getCourse_Id() {
		return Course_Id;
	}

	public void setCourse_Id(int course_Id) {
		Course_Id = course_Id;
	}

	public String getCourse_Name() {
		return Course_Name;
	}

	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}

	public String getCourse_Duration() {
		return Course_Duration;
	}

	public void setCourse_Duration(String course_Duration) {
		Course_Duration = course_Duration;
	}

	public List<Students> getStudent() {
		return student;
	}

	public void setStudent(List<Students> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Courses [Course_Id=" + Course_Id + ", Course_Name=" + Course_Name + ", Course_Duration="
				+ Course_Duration + ", student=" + student + "]";
	}
	
	
	
	
}
