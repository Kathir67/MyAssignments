package week1.day1;

public class TwoWheeler {
	//Creating variables
	public int noOfWheels = 000000000000000004;
	public short noOfMirrors = 000004;
	public long chassisNumber = 1234567890123456789L;
	public boolean isPunctured = false;
	public String bikeName = "yamaha";
	public double runningKM = 1234567.0987654321D;

	public static void main(String[] args) {
		// Creating object
		TwoWheeler twowheel = new TwoWheeler();
		System.out.println(twowheel.noOfWheels);
		System.out.println(twowheel.noOfMirrors);
		System.out.println(twowheel.chassisNumber);
		System.out.println(twowheel.isPunctured);
		System.out.println(twowheel.bikeName);
		System.out.println(twowheel.runningKM);

	}

}
