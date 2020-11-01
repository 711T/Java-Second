package Test;

public class Teacher extends Person{
	String course;
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	public Teacher() {
		super(id,name,age,sex);
	}


}
