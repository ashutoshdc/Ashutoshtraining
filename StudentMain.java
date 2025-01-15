package cybernxt;

public class StudentMain {

	public static void main(String[] args) {
	 Student stu1=new Student(100,"kiran",'A'); 
	 //approach1-Assigning values using object reference variable
	// stu1.sid=100;
	// stu1.sname="kiran";
	//stu1.grade='A';
	// stu1.display();
	 
	 //Approach 2 by using method
	// stu1.getvalues(100,"kiran",'A');
	// stu1.display(); 
	 
	  //Approach 3=using constructor
	  stu1.display();
	 
	}

}
