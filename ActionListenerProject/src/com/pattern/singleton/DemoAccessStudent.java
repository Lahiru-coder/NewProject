/**
 * 
 */
package com.pattern.singleton;

/**
 * @author uobsep22
 *
 */
public class DemoAccessStudent {

	/**
	 * Access the student
	 * @param args
	 */
	public static void main(String[] args) {
		// Since student class is hidden, cannot use the constructor
 		//Student student = new Student();
		
		// This is how to access an instance of student class
		Student student = Student.getInstance();
		student.display();
	}

}
