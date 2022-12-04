package week3.day1;

public class Smart extends Android {
	
	public void connectWhatsapp() {
		System.out.println("Connecting Whatsapp");
	}
	//method override
	public void makeCall (){
		System.out.println("Calling from Smartphone");
	}

	public static void main(String[] args) {
		Smart overload = new Smart();
		overload.connectWhatsapp();
		overload.makeCall();
		overload.sendMessage();
		overload.saveContact();
		overload.takeVideo();
	}

}
