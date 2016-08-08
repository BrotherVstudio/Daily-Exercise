package ex04;

/**
 * 功能描述:客户端
 * */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个对象
		/*Student s1=new Student("张三",21,"洛阳");
		Student s2=new Student("李四",22,"洛阳");
		s1.setAddress("神都");
		System.out.println(s1.getAddress());
		System.out.println(s2.getAddress());*/
		
		Student2 s3=new Student2("张三",21);
		Student2 s4=new Student2("李四",22);
		Student2 s5=new Student2("李四",22);
		Student2 s7=new Student2("李四",22);
		System.out.println(s3.getCount());
		//SingleObject s=new SingleObject();
		SingleObject s1=SingleObject.getInstance();
		SingleObject s2=SingleObject.getInstance();
		System.out.println(s1==s2);
	}

}

/**
 * 功能描述：学生类
 * */
class Student{
	/**
	 * 定义变量，用来存储姓名
	 * */
	private String name;
	/**
	 * 定义变量,用来存储年龄
	 * */
	private int age;
	/**
	 * 定义变量，用来存储所在地
	 * */
	private String address;
	
	/**
	 * 方法描述：构造方法,无参数
	 * */
	public Student(){
		
	}
	/**
	 * 方法描述：构造方法
	 * @param name 姓名
	 * @param age 年龄
	 * @param address 地址
	 * */
	public Student(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	/**
	 * 方法描述：设置姓名
	 * @param name 姓名
	 * */
	public void setName(String name){
		this.name=name;
	}
	/**
	 * 方法描述：设置年龄
	 * @param age 年龄
	 * */
	public void setAge(int age){
		this.age=age;
	}
	/**
	 * 方法描述：设置地址
	 * @param adress 地址 
	 * */
	public void setAddress(String address){
		this.address=address;
	}
	/**
	 * 方法描述：获取姓名
	 * @return 返回姓名
	 * */
	public String getName(){
		return this.name;
	}
	/**
	 * 方法描述：获取年龄
	 * @return 返回年龄
	 * */
	public int getAge(){
		return this.age;
	}
	/**
	 * 方法描述：获取地址
	 * @return 返回地址
	 * */
	public String getAddress(){
		return this.address;
	}
}
/**
 * 功能描述：学生类
 * */



 class Student2{
	/**
	 * 定义变量，用来存储姓名
	 * */
	 
	 private String name;
	/**
	 * 定义变量,用来存储年龄
	 * */
	private int age;
	/**
	 * 定义变量，用来存储所在地
	 * */
	public static final String ADDRESS="神都";
	public static int count=0;
	/**
	 * 方法描述：构造方法,无参数
	 * */
	public Student2(){
		
	}
	/**
	 * 方法描述：构造方法
	 * @param name 姓名
	 * @param age 年龄
	 * @param address 地址
	 * */
	public Student2(String name,int age){
		this.name=name;
		this.age=age;
		count++;
		//this.address=address;
	}
	/**
	 * 方法描述：设置姓名
	 * @param name 姓名
	 * */
	public void setName(String name){
		this.name=name;
	}
	/**
	 * 方法描述：设置年龄
	 * @param age 年龄
	 * */
	public void setAge(int age){
		this.age=age;
	}
	
	/**
	 * 方法描述：获取姓名
	 * @return 返回姓名
	 * */
	public String getName(){
		return this.name;
	}
	/**
	 * 方法描述：获取年龄
	 * @return 返回年龄
	 * */
	public int getAge(){
		return this.age;
	}
	/**
	 * 方法描述：获取地址
	 * @return 返回地址
	 * */
	public static String getAddress(){
		return ADDRESS;
	}
	public int getCount(){
		return this.count;
	}
}
/**
 * 功能描述：单例类
 * */
class SingleObject{
	/**
	 * 方法描述：构造方法私有
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