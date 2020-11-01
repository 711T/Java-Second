# Java-Second
第二次作业
# 2020322062 计G201 苗广汉
  ## 1.实验目的
  + 1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法。
  + 2.掌握面向对象的类设计方法（属性、方法）。
  + 3.学会使用super()，用于实例化子类。
  + 4.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
  ## 2.实验要求
  + 1.教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
  + 2.编写上述实体类以及测试主类（注意类之间继承关系的适用）。
  + 3.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
  ## 3.实验设计
  + 1.创建Person类，设置静态属性。
  ```
  static int id;
  static String name;
  static String sex;
  static int age;
  ```
  + 2.在Person类中，添加构造方法。
  ```
  public Person(int id,String name,int age,String sex) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
  ```
  + 3.在Person类中，属性id,name,sex,age设置get，set方法。例如：getId,setId。
  ```
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
  ```
  + 4.创建Student类，继承Person父类，构造方法里调用super父类构造方法。
  ```
  public class Student extends Person{
	public Student() {
		super(id, name, age, sex);//调用父类的构造方法
	}
}
  ```
  + 5.创建Teacher类，继承Person父类，构造方法里调用super父类构造方法。
  ```
  public class Teacher extends Person{
	public Teacher() {
		super(id,name,age,sex);
	}
  }
  ```
  + 6.在Teacher类中设置course属性，并添加course的get,set方法。
  ```
  String course;
  public String getCourse(){
        return course;
  }
  public void setCourse(String course){
        this.course=course;
  }
  ```
  + 7.创建Course类，在Course类中设置属性。
  ```
  	int courseId;
		String courseName=null;//设置课程名对象为空
		String courseSite;
		String time;
		String teacher;
   ```
   + 8.在Course类，设置toString方法以及设置get,set方法。例如getCoureId,setCourseId。
   ```
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
   ```
   + 10.创建Test类，创建main方法，在主方法下使用new运算符可以创建p对象，并调用p.show方法。
   ```
   public class Test {
	public static void main(String[] args) {
		Project p=new Project();
		p.show("选课语文");
	}
}
```
  ## 4.核心方法
  + 1.创建Project类，添加name属性以及show方法，在show方法中使用new运算符创建多个不同的对象。
  ```
  public class Project {
	String name;
	public void show(String name) {
	Student s1=new Student();
	Teacher t1=new Teacher();
	Course c1=new Course("语文");//通过toString方法进行传参
	}	
  ```
  + 2.在show方法下给学生，老师，课程添加值。
  ```
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
	c1.setCourseId(3001);
	c1.setCourseSite("101教室");
	c1.setTeacher("李老师");
	c1.setTime("上午7点");	
  ```
  + 3.在show方法下设置if-else if-else语句，判断选课/退课语文，打印课程信息以及学生和老师信息。
  ```
  if(name=="选课语文") {
	System.out.println("学生选课语文:");
	System.out.println("学生编号:"+student1Id+" 学生姓名:"+student1Name+" 学生年龄:"+student1Age+" 学生性别:"+student1Sex);
	System.out.println("老师编号:"+teacher1Id+" 老师姓名:"+teacher1Name+" 老师年龄:"+teacher1Age+" 老师性别:"+teacher1Sex+" 所授课程:"+teacher1Course);
	System.out.println("课程编号:"+c1.getCourseId()+" 课程名称:"+c1+" 课程地点:"+c1.getCourseSite()+" 授课老师:"+c1.getTeacher()+" 上课时间:"+c1.getTime());
  }
	else if(name=="退课语文") {
	System.out.println("学生退课语文:");
	System.out.println("学生编号:"+student1Id+" 学生姓名:"+student1Name+" 学生年龄:"+student1Age+" 学生性别:"+student1Sex);
	System.out.println("老师编号:"+teacher1Id+" 老师姓名:"+teacher1Name+" 老师年龄:"+teacher1Age+" 老师性别:"+teacher1Sex+" 所授课程:"+teacher1Course);
	System.out.println("课程编号:"+c1.getCourseId()+" 课程名称:"+c1+" 课程地点:"+c1.getCourseSite()+" 授课老师:"+c1.getTeacher()+" 上课时间:"+c1.getTime());
  }
	else {
		  System.out.println("输入信息错误，重新输入");
	}
  ```
  ## 5.实验结果
  ```
学生选课语文:
学生编号:1001 学生姓名:张三 学生年龄:23 学生性别:男
老师编号:2001 老师姓名:李老师 老师年龄:35 老师性别:女 所授课程:授课语文
课程编号:3001 课程名称:语文 课程地点:101教室 授课老师:李老师 上课时间:上午7点
  ```
  ## 6.实验感想
  + 1.学会类的设计方法。
  + 2.掌握了类的继承用法。
  + 3.学会使用super();
  + 4.了解如何使用Object根类的toString()方法。
