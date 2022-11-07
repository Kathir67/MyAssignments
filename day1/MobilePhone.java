package week1.day1;

public class MobilePhone {
	//Creating variables
	String mobileBrandName = "SamsungM30";
	char mobileLogo = 'S';
	short noOfMobilePiece = 12;
	int modelNumber = 33002211;
	long mobileImeiNumber = 01234567L;
	float mobilePrice = 13550F;
	boolean isDamaged = true;


	public static void main(String[] args) {
		// Creating object
		MobilePhone mobilePhone = new MobilePhone();
		System.out.println(mobilePhone.mobileBrandName);
		System.out.println(mobilePhone.mobileLogo);
		System.out.println(mobilePhone.noOfMobilePiece);
		System.out.println(mobilePhone.modelNumber);
		System.out.println(mobilePhone.mobileImeiNumber);
		System.out.println(mobilePhone.mobilePrice);
		System.out.println(mobilePhone.isDamaged);

	}

}
