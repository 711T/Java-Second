package Test;

public class Course {
		int courseId;
		String courseName=null;//设置课程名对象为空
		String courseSite;
		String time;
		String teacher;


		public Course(String name) {
			this.courseName=name;
		}
		@Override
		public String toString() {
		return courseName;
		}//toString构造方法
		public  int getCourseId() {
			return courseId;
		}
		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}
		public String getCourseSite() {
			return courseSite;
		}
		public void setCourseSite(String courseSite) {
			this.courseSite = courseSite;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getTeacher() {
			return teacher;
		}
		public void setTeacher(String teacher) {
			this.teacher = teacher;
		}	
}

