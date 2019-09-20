package com.apple.interviewQns;

class Base{
	public static void display() {
		System.out.println("static method from Base class");
	}
	public void foo() {
		System.out.println("non static method from Base");
	}
}
class Derived extends Base{
	public static void display() {
		System.out.println("static method from derived");
	}
	public void foo() {
		System.out.println("non static method from derived");
	}
}

public class StaticOverride {
	
	public static void main(String[] args) {
		Base obj = new Derived();
		Derived.display();
		obj.display();
		obj.foo();
	}

}
