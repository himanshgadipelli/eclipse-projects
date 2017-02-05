package org.pradeep.javaperks;

public class Student implements Comparable{
	int nbr;
	String name;
	
	public Student (int nbr,String name){
		this.nbr=nbr;
		this.name=name;
		
	}
	@Override
	public int compareTo(Object obj){
		Student student = (Student) obj;
		System.out.println("Instance Nbr" +this.nbr);
		System.out.println("JVM Nbr" +student.nbr);

		if(this.nbr>student.nbr){
			return 1;
		}else if(this.nbr<student.nbr){
			return -1;
		}else{
			return 0;
		}
		
	}

}
