package Week3.Day1;

public class AxisBank extends BankInfor {
	public void deposit() {
		System.out.println("The depostied amount in AxisBank is Rs:90,00,000");
	}

	public static void main(String[] args) {
		AxisBank bankdetails = new AxisBank();
		bankdetails.saving();
		bankdetails.fixed();
		System.out.println("The value should be printed as:");
		bankdetails.deposit();
	}
}
