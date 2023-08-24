//Student entity i.e., Userdefined object
package com.cg.dayfourteen.userdefinedobject;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private float per;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int i, String string, float f) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}
	
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);//ascending oreder
		//return o.name.compareTo(this.name);
	}
	
	

}
