package Test;

public class Project {
	String name;
	public void show(String name) {
	Student s1=new Student();
	Teacher t1=new Teacher();
	Teacher t2=new Teacher();
	Course c1=new Course("����");//ͨ��toString�������д���
	Course c2=new Course("��ѧ");
	
	s1.setId(1001);
	s1.setName("����");
	s1.setAge(23);
	s1.setSex("��");
	int  student1Id=s1.getId();
	String student1Name=s1.getName();
	int  student1Age=s1.getAge();
	String student1Sex=s1.getSex();
	
	t1.setId(2001);
	t1.setName("����ʦ");
	t1.setAge(35);
	t1.setSex("Ů");
	t1.setCourse("�ڿ�����");
	int  teacher1Id=t1.getId();//��ȡ��ʦ���
	String teacher1Name=t1.getName();
	int  teacher1Age=t1.getAge();
	String teacher1Sex=t1.getSex();
	String teacher1Course=t1.getCourse();
	
	t2.setId(2002);
	t2.setName("����ʦ");
	t2.setAge(42);
	t2.setSex("Ů");
	t2.setCourse("�ڿ���ѧ");
	int  teacher2Id=t2.getId();
	String teacher2Name=t2.getName();
	int  teacher2Age=t2.getAge();
	String teacher2Sex=t2.getSex();
	String teacher2Course=t2.getCourse();
	
	c1.setCourseId(3001);
	c1.setCourseSite("101����");
	c1.setTeacher("����ʦ");
	c1.setTime("����7��");
	
	c2.setCourseId(3002);
	c2.setCourseSite("102����");
	c2.setTeacher("����ʦ");
	c2.setTime("����10��");
	
	if(name=="ѡ������") {
		System.out.println("ѧ��ѡ������:");
		System.out.println("ѧ�����:"+student1Id+" ѧ������:"+student1Name+" ѧ������:"+student1Age+
				" ѧ���Ա�:"+student1Sex);
		System.out.println("��ʦ���:"+teacher1Id+" ��ʦ����:"+teacher1Name+" ��ʦ����:"+teacher1Age+
		" ��ʦ�Ա�:"+teacher1Sex+" ���ڿγ�:"+teacher1Course);
		System.out.println("�γ̱��:"+c1.getCourseId()+" �γ�����:"+c1+" �γ̵ص�:"+c1.getCourseSite()+
				" �ڿ���ʦ:"+c1.getTeacher()+" �Ͽ�ʱ��:"+c1.getTime());
		
	}
	else if(name=="�˿�����") {
	System.out.println("ѧ���˿�����:");
	System.out.println("ѧ�����:"+student1Id+" ѧ������:"+student1Name+" ѧ������:"+student1Age+
			" ѧ���Ա�:"+student1Sex);
	System.out.println("��ʦ���:"+teacher1Id+" ��ʦ����:"+teacher1Name+" ��ʦ����:"+teacher1Age+
	" ��ʦ�Ա�:"+teacher1Sex+" ���ڿγ�:"+teacher1Course);
	System.out.println("�γ̱��:"+c1.getCourseId()+" �γ�����:"+c1+" �γ̵ص�:"+c1.getCourseSite()+
			" �ڿ���ʦ:"+c1.getTeacher()+" �Ͽ�ʱ��:"+c1.getTime());
	
}
	else if(name=="ѡ����ѧ") {
		System.out.println("ѧ��ѡ����ѧ:");
		System.out.println("ѧ�����:"+student1Id+" ѧ������:"+student1Name+" ѧ������:"+student1Age+
				" ѧ���Ա�:"+student1Sex);
		System.out.println("��ʦ���:"+teacher2Id+" ��ʦ����:"+teacher2Name+" ��ʦ����:"+teacher2Age+
		" ��ʦ�Ա�:"+teacher2Sex+" ���ڿγ�:"+teacher2Course);
		System.out.println("�γ̱��:"+c2.getCourseId()+" �γ�����:"+c2+" �γ̵ص�:"+c2.getCourseSite()+
				" �ڿ���ʦ:"+c2.getTeacher()+" �Ͽ�ʱ��:"+c2.getTime());
	}
	else if(name=="�˿���ѧ") {
	System.out.println("ѧ���˿���ѧ:");
	System.out.println("ѧ�����:"+student1Id+" ѧ������:"+student1Name+" ѧ������:"+student1Age+
			" ѧ���Ա�:"+student1Sex);
	System.out.println("��ʦ���:"+teacher2Id+" ��ʦ����:"+teacher2Name+" ��ʦ����:"+teacher2Age+
	" ��ʦ�Ա�:"+teacher2Sex+" ���ڿγ�:"+teacher2Course);
	System.out.println("�γ̱��:"+c2.getCourseId()+" �γ�����:"+c2+" �γ̵ص�:"+c2.getCourseSite()+
			" �ڿ���ʦ:"+c2.getTeacher()+" �Ͽ�ʱ��:"+c2.getTime());
}
		else {
			System.out.println("������Ϣ������������");
		}
	}

}
