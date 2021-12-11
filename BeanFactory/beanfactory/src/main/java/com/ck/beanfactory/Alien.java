package com.ck.beanfactory;

public class Alien {

	private int age ;        // value in property tag 
//	private Laptop laptop ;  // we have to use 'ref' in property tag to use laptop class reference
	
	private Computer comp ;  // using computer interface instead of a class
	
//	public Alien()
//	{
//		System.out.println("Contsructor called");
//	}
	
	// using Contructor injection <constructor-arg> tag is used in bean xml
	
	public Alien(int age)
	{
		this.age = age ;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age assigned");
		this.age = age;
	}

//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}
	
	public void code()
	{
		System.out.println("I am coding");
		comp.compile();
	}

}
