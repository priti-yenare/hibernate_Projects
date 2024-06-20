package habernetprojject.ManyStudent_Enroll_ManyCourses;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Students {
	@Id
	private int Student_Id;
	private String Student_Name;
	@ManyToMany
	private List<Courses> course;

	public int getStudent_Id() {
		return Student_Id;
	}

	public void setStudent_Id(int student_Id) {
		Student_Id = student_Id;
	}

	public String getStudent_Name() {
		return Student_Name;
	}

	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public List<Courses> getCourse() {
		return course;
	}

	public void setCourse(List<Courses> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Students [Student_Id=" + Student_Id + ", Student_Name=" + Student_Name + ", course=" + course + "]";
	}
	
	
	
}
