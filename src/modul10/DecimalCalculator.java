package modul10;

public class DecimalCalculator extends Calculator{

	public DecimalCalculator(String number1, String number2) {
		super(number1, number2);
	}

	@Override
	public String add() {
		int digit3_1 = Integer.parseInt(String.valueOf(getNumber1().charAt(2)));
		int digit3_2 = Integer.parseInt(String.valueOf(getNumber2().charAt(2)));
		
		String hasil3 = String.valueOf(digit3_1 + digit3_2);
		int carry3 = 0;
		if(hasil3.length() > 1){
			carry3 = Integer.parseInt(String.valueOf(hasil3.charAt(0)));
			hasil3 = String.valueOf(hasil3.charAt(1));
		}
		
		int digit2_1 = Integer.parseInt(String.valueOf(getNumber1().charAt(1)));
		int digit2_2 = Integer.parseInt(String.valueOf(getNumber2().charAt(1)));
		
		String hasil2 = String.valueOf(digit2_1 + digit2_2 + carry3);
		int carry2 = 0;
		if(hasil2.length() > 1){
			carry2 = Integer.parseInt(String.valueOf(hasil2.charAt(0)));
			hasil2 = String.valueOf(hasil2.charAt(1));
		}
		
		int digit1_1 = Integer.parseInt(String.valueOf(getNumber1().charAt(0)));
		int digit1_2 = Integer.parseInt(String.valueOf(getNumber2().charAt(0)));
		
		String hasil1 = String.valueOf(digit1_1 + digit1_2 + carry2);
		
		return hasil1 + hasil2 + hasil3;
	}

	@Override
	String substract() {
		int digit3_1 = Integer.parseInt(String.valueOf(getNumber1().charAt(2)));
		int digit3_2 = Integer.parseInt(String.valueOf(getNumber2().charAt(2)));
		
		int digit2_1 = Integer.parseInt(String.valueOf(getNumber1().charAt(1)));
		int digit2_2 = Integer.parseInt(String.valueOf(getNumber2().charAt(1)));
		
		int digit1_1 = Integer.parseInt(String.valueOf(getNumber1().charAt(0)));
		int digit1_2 = Integer.parseInt(String.valueOf(getNumber2().charAt(0)));
		
		if(digit3_1 < digit3_2) {
			digit2_1 = (digit2_1 - 1) % 10;
			digit3_1 += 10;
		}
		
		if(digit2_1 < digit2_2) {
			digit1_1 = (digit1_1 - 1) % 10;
			digit2_1 += 10;
		}
		
		String hasil3 = String.valueOf(digit3_1 - digit3_2);
		String hasil2 = String.valueOf(digit2_1 - digit2_2);
		String hasil1 = String.valueOf(digit1_1 - digit1_2);
		
		return hasil1 + hasil2 + hasil3;
	}
	
	
	
}
