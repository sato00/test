
public class Person {
<<<<<<< HEAD
	private String name=null;
	private int age=0;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
public Person() {}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
=======
	public String name=null;
	public int age=0;
	public String phoneNumber=null;
	public String address=null;

	public void talk(){
		System.out.println(this.name + "が話す");
	}
	public void walk(){
		System.out.println(this.name + "が歩く");
	}
	public void run(){
		System.out.println(this.name + "が走る");
	}
>>>>>>> 2ea2cf295fa00b05f8488e1cb56d7781f26b5767
}
