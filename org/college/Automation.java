package org.college;

public class Automation extends MultipleLanguage {
	

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Python();
		auto.java();
		auto.Selenium();
		auto.Ruby();
	}

	public void java() {
		System.out.println("My primary language is JAVA");
	}

	public void Selenium() {
		System.out.println("My Primary testing tool is Selenium");		
	}

	@Override
	public void Ruby() {
		System.out.println("My additional language is Ruby");		
	}

}
