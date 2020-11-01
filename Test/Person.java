package Test;

public class Person {
	static int id;
	static String name;
	static String sex;
	static int age;
	
	public Person(int id,String name,int age,String sex) {//设置Person构造方法
		this.id=id;
		this.name=name;
		this.age=age;
		this.sex=sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}                   