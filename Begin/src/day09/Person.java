package day09;
//도메인 객체 (VO-Value Object, DTO객체-Data Transfer Object
public class Person {
	private String name;
	private int age;
	
	public Person() {
		this("아무개", 3);
	}
	public Person(String n,int a) {
		name=n;
		age=a;
	}
	//settter, getter---
	public void setName(String name) {
		this.name = name;
	}
	public void setage(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}//////////
