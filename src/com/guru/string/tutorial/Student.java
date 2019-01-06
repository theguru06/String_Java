package com.guru.string.tutorial;
// An immutable class 

public final class Student 
{ 
	final String name; 
	final int regNo; 
	final Age age;   //mutable obj

	public Student(String name, int regNo,Age age) 
	{ 
		this.name = name; 
		this.regNo = regNo;
		Age cloneage=new Age();
		cloneage.setDay(age.getDay());
		cloneage.setMonth(age.getMonth());
		cloneage.setYear(age.getYear());
		this.age=cloneage;
	} 
	public String getName() 
	{ 
		return name; 
	} 
	public int getRegNo() 
	{ 
		return regNo; 
	}
	public Age getAge() 
	{ 
		Age cloneage=new Age();
		cloneage.setDay(age.getDay());
		cloneage.setMonth(age.getMonth());
		cloneage.setYear(age.getYear());
		return cloneage; 
	}
} 

class Age{
	private int day;
    private int month;
    private int year;
    public Age(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public Age() {
		// TODO Auto-generated constructor stub
	}
	public int getDay() {
        return day;
    }
    public void setDay(int day) {
    this.day = day;
    }
    public int getMonth() {
    return month;
    }
    public void setMonth(int month) {
    this.month = month;
    }
    public int getYear() {
    return year;
    }
    public void setYear(int year) {
    this.year = year;
    }

}
// Driver class 
class Test 
{ 
	public static void main(String args[]) 
	{ 
		Age age=new Age(1,1,1992);
		Student s = new Student("ABC", 101,age); 
		System.out.println(s.name); 
		System.out.println(s.age.getYear()); 
		age.setYear(2019);
		s.getAge().setYear(2018);
		System.out.println(s.age.getYear()); 
		
		// Uncommenting below line causes error 
		//s.regNo = 102; 
	} 
} 
