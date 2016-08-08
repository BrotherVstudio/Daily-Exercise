package ex04;

/**
 * ��������:�ͻ���
 * */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		/*Student s1=new Student("����",21,"����");
		Student s2=new Student("����",22,"����");
		s1.setAddress("��");
		System.out.println(s1.getAddress());
		System.out.println(s2.getAddress());*/
		
		Student2 s3=new Student2("����",21);
		Student2 s4=new Student2("����",22);
		Student2 s5=new Student2("����",22);
		Student2 s7=new Student2("����",22);
		System.out.println(s3.getCount());
		//SingleObject s=new SingleObject();
		SingleObject s1=SingleObject.getInstance();
		SingleObject s2=SingleObject.getInstance();
		System.out.println(s1==s2);
	}

}

/**
 * ����������ѧ����
 * */
class Student{
	/**
	 * ��������������洢����
	 * */
	private String name;
	/**
	 * �������,�����洢����
	 * */
	private int age;
	/**
	 * ��������������洢���ڵ�
	 * */
	private String address;
	
	/**
	 * �������������췽��,�޲���
	 * */
	public Student(){
		
	}
	/**
	 * �������������췽��
	 * @param name ����
	 * @param age ����
	 * @param address ��ַ
	 * */
	public Student(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	/**
	 * ������������������
	 * @param name ����
	 * */
	public void setName(String name){
		this.name=name;
	}
	/**
	 * ������������������
	 * @param age ����
	 * */
	public void setAge(int age){
		this.age=age;
	}
	/**
	 * �������������õ�ַ
	 * @param adress ��ַ 
	 * */
	public void setAddress(String address){
		this.address=address;
	}
	/**
	 * ������������ȡ����
	 * @return ��������
	 * */
	public String getName(){
		return this.name;
	}
	/**
	 * ������������ȡ����
	 * @return ��������
	 * */
	public int getAge(){
		return this.age;
	}
	/**
	 * ������������ȡ��ַ
	 * @return ���ص�ַ
	 * */
	public String getAddress(){
		return this.address;
	}
}
/**
 * ����������ѧ����
 * */



 class Student2{
	/**
	 * ��������������洢����
	 * */
	 
	 private String name;
	/**
	 * �������,�����洢����
	 * */
	private int age;
	/**
	 * ��������������洢���ڵ�
	 * */
	public static final String ADDRESS="��";
	public static int count=0;
	/**
	 * �������������췽��,�޲���
	 * */
	public Student2(){
		
	}
	/**
	 * �������������췽��
	 * @param name ����
	 * @param age ����
	 * @param address ��ַ
	 * */
	public Student2(String name,int age){
		this.name=name;
		this.age=age;
		count++;
		//this.address=address;
	}
	/**
	 * ������������������
	 * @param name ����
	 * */
	public void setName(String name){
		this.name=name;
	}
	/**
	 * ������������������
	 * @param age ����
	 * */
	public void setAge(int age){
		this.age=age;
	}
	
	/**
	 * ������������ȡ����
	 * @return ��������
	 * */
	public String getName(){
		return this.name;
	}
	/**
	 * ������������ȡ����
	 * @return ��������
	 * */
	public int getAge(){
		return this.age;
	}
	/**
	 * ������������ȡ��ַ
	 * @return ���ص�ַ
	 * */
	public static String getAddress(){
		return ADDRESS;
	}
	public int getCount(){
		return this.count;
	}
}
/**
 * ����������������
 * */
class SingleObject{
	/**
	 * �������������췽��˽��
	 * */
	public static SingleObject so=null;
	private SingleObject(){}
	public static SingleObject getInstance(){
		if(so==null){
			so=new SingleObject();
		}
		return so;
		
	}
}