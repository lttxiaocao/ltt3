package cn.liu;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("����","��",11);
		System.out.println("Ա��1"+person1.getName()+person1.getGender()+person1.getAge());
		System.out.println("Ա��2"+person2.getName()+person2.getGender()+person2.getAge());

	}

}
