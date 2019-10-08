package com.durga.java8.MCreference;

interface interf2{
	public Sample get();
}

class Sample{
	
	Sample(){
		System.out.println("Constructor : Sample class");
	}	
}
public class TestCref {
	
	public static void main(String args[]) {
		
		interf2 i = Sample::new;
		
		Sample s = i.get();
		
	}

}


/**USING Lambda expression

public static void main(String args[]) {
	
	interf2 i = () -> {
						Sample s = new Sample():
						return s;
					}
	
	Sample s = i.get();
	
} **/
