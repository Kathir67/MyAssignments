package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("My desktop size is 40 inches");

	}

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}

}
