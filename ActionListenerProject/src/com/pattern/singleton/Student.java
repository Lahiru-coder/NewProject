/**
 * 
 */
package com.pattern.singleton;

/**
 * @author uobsep22
 *
 */
public class Student {
	private String name;
	//instance to send outside
	private static Student instance = new Student();
	
	//below code will create only one instance
	//private static final Student instance = new Student();

	//the private constructor
	private Student() {
		this.name="Chamindu";
	}
	
	//method to send the student instance outside
	public static Student getInstance() {
		return instance;
	}
	
	public void display() {
		System.out.println("Student name is "+name);
	}
}
