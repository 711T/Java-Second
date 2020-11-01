package Test;

public class Project {
	String name;
	public void show(String name) {
	Student s1=new Student();
	Teacher t1=new Teacher();
	Teacher t2=new Teacher();
	Course c1=new Course("语文");//通过toString方法进行传参
	Course c2=new Course("数学");
	
	s1.setId(1001);
	s1.setName("张三");
	s1.setAge(23);
	s1.setSex("男");
	int  student1Id=s1.getId();
	String student1Name=s1.getName();
	int  student1Age=s1.getAge();
	String student1Sex=s1.getSex();
	
	t1.setId(2001);
	t1.setName("李老师");
	t1.setAge(35);
	t1.setSex("女");
	t1.setCourse("授课语文");
	int  teacher1Id=t1.getId();//获取老师编号
	String teacher1Name=t1.getName();
	int  teacher1Age=t1.getAge();
	String teacher1Sex=t1.getSex();
	String teacher1Course=t1.getCourse();
	
	t2.setId(2002);
	t2.setName("张老师");
	t2.setAge(42);
	t2.setSex("女");
	t2.setCourse("授课数学");
	int  teacher2Id=t2.getId();
	String teacher2Name=t2.getName();
	int  teacher2Age=t2.getAge();
	String teacher2Sex=t2.getSex();
	String teacher2Course=t2.getCourse();
	
	c1.setCourseId(3001);
	c1.setCourseSite("101教室");
	c1.setTeacher("李老师");
	c1.setTime("上午7点");
	
	c2.setCourseId(3002);
	c2.setCourseSite("102教室");
	c2.setTeacher("张老师");
	c2.setTime("上午10点");
	
	if(name=="选课语文") {
		System.out.println("学生选课语文:");
		System.out.println("学生编号:"+student1Id+" 学生姓名:"+student1Name+" 学生年龄:"+student1Age+
				" 学生性别:"+student1Sex);
		System.out.println("老师编号:"+teacher1Id+" 老师姓名:"+teacher1Name+" 老师年龄:"+teacher1Age+
		" 老师性别:"+teacher1Sex+" 所授课程:"+teacher1Course);
		System.out.println("课程编号:"+c1.getCourseId()+" 课程名称:"+c1+" 课程地点:"+c1.getCourseSite()+
				" 授课老师:"+c1.getTeacher()+" 上课时间:"+c1.getTime());
		
	}
	else if(name=="退课语文") {
	System.out.println("学生退课语文:");
	System.out.println("学生编号:"+student1Id+" 学生姓名:"+student1Name+" 学生年龄:"+student1Age+
			" 学生性别:"+student1Sex);
	System.out.println("老师编号:"+teacher1Id+" 老师姓名:"+teacher1Name+" 老师年龄:"+teacher1Age+
	" 老师性别:"+teacher1Sex+" 所授课程:"+teacher1Course);
	System.out.println("课程编号:"+c1.getCourseId()+" 课程名称:"+c1+" 课程地点:"+c1.getCourseSite()+
			" 授课老师:"+c1.getTeacher()+" 上课时间:"+c1.getTime());
	
}
	else if(name=="选课数学") {
		System.out.println("学生选课数学:");
		System.out.println("学生编号:"+student1Id+" 学生姓名:"+student1Name+" 学生年龄:"+student1Age+
				" 学生性别:"+student1Sex);
		System.out.println("老师编号:"+teacher2Id+" 老师姓名:"+teacher2Name+" 老师年龄:"+teacher2Age+
		" 老师性别:"+teacher2Sex+" 所授课程:"+teacher2Course);
		System.out.println("课程编号:"+c2.getCourseId()+" 课程名称:"+c2+" 课程地点:"+c2.getCourseSite()+
				" 授课老师:"+c2.getTeacher()+" 上课时间:"+c2.getTime());
	}
	else if(name=="退课数学") {
	System.out.println("学生退课数学:");
	System.out.println("学生编号:"+student1Id+" 学生姓名:"+student1Name+" 学生年龄:"+student1Age+
			" 学生性别:"+student1Sex);
	System.out.println("老师编号:"+teacher2Id+" 老师姓名:"+teacher2Name+" 老师年龄:"+teacher2Age+
	" 老师性别:"+teacher2Sex+" 所授课程:"+teacher2Course);
	System.out.println("课程编号:"+c2.getCourseId()+" 课程名称:"+c2+" 课程地点:"+c2.getCourseSite()+
			" 授课老师:"+c2.getTeacher()+" 上课时间:"+c2.getTime());
}
		else {
			System.out.println("输入信息错误，重新输入");
		}
	}

}
