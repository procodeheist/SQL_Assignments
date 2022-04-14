package assignment4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many Student objects need to be created");
		int num = scan.nextInt();
		
		Student[] studentArr = new Student[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("Enter the student rollnum:");
			int roll = scan.nextInt();
			System.out.println("Enter the student name:");
			String name = scan.next();
			System.out.println("Enter the student Address:");
			String adress = scan.next();
			System.out.println("Enter the student marks");
			int marks = scan.nextInt();
			
			studentArr[i] = new Student(roll, name, adress, marks);
			System.out.println("==============================");
		}
		
		int stdMarks = 0;
		for(Student std:studentArr) {
			System.out.println("student rollnum: "+std.getRoll());
			System.out.println("student Name: "+std.getName());
			System.out.println("student Address: "+std.getAddress());
			System.out.println("student Marks: "+std.getMarks());
			System.out.println("==============================");
			stdMarks += std.getMarks();
		}
		
		System.out.println("The average of all the Student marks is:"+stdMarks/num);

	}

}
