package arrays;

class Student {
	String name;
	int age;

}

public class ArraysFirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stud = new Student[2];
		stud[0]=new Student();
		stud[1]=new Student();
		stud[0].name = "Saurabh";
		stud[0].age = 23;
		stud[1].name = "Aman";
		stud[1].age = 20;
		for (int i = 0; i < stud.length; i++) {
			System.out.println(stud[i].name);
			System.out.println(stud[i].age);
		}
		
		System.out.println(stud.getClass().getName());
		System.out.println(stud.getClass().getSimpleName());
		System.out.println(stud.getClass().getClassLoader());
		System.out.println(stud.getClass().getPackage().getPackages());

	}

}
