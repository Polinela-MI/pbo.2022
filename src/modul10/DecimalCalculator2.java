package modul10;

public class DecimalCalculator2 extends Calculator{

	public DecimalCalculator2(String number1, String number2) {
		super(number1, number2);
	}

	@Override
	String add() {
		int dig3n1 = Integer.parseInt(String.valueOf(getNumber1().charAt(2)));
		int dig3n2 = Integer.parseInt(String.valueOf(getNumber2().charAt(2)));
		String result3 = String.valueOf((dig3n1 + dig3n2) % 10);
		int carry3 = (dig3n1 + dig3n2) / 10; 
		
		int dig2n1 = Integer.parseInt(String.valueOf(getNumber1().charAt(1)));
		int dig2n2 = Integer.parseInt(String.valueOf(getNumber2().charAt(1)));
		String result2 = String.valueOf((dig2n1 + dig2n2 + carry3) % 10);
		int carry2 = (dig2n1 + dig2n2 + carry3) / 10;
		
		int dig1n1 = Integer.parseInt(String.valueOf(getNumber1().charAt(0)));
		int dig1n2 = Integer.parseInt(String.valueOf(getNumber2().charAt(0)));
		String result1 = String.valueOf((dig1n1 + dig1n2 + carry2) % 10);
		
		return result1 + result2 + result3;
	}

	@Override
	String substract() {
		int dig3n1 = Integer.parseInt(String.valueOf(getNumber1().charAt(2)));
		int dig3n2 = Integer.parseInt(String.valueOf(getNumber2().charAt(2)));
		String result3 = String.valueOf((dig3n1 - dig3n2 + 10) % 10);
		 
		int dig2n1 = Integer.parseInt(String.valueOf(getNumber1().charAt(1)));
		int dig2n2 = Integer.parseInt(String.valueOf(getNumber2().charAt(1)));
		
		if(dig3n1 < dig3n2) {
			dig2n1--;
		}
		
		String result2 = String.valueOf((dig2n1 - dig2n2 + 10) % 10);
		
		int dig1n1 = Integer.parseInt(String.valueOf(getNumber1().charAt(0)));
		int dig1n2 = Integer.parseInt(String.valueOf(getNumber2().charAt(0)));
		
		if(dig2n1 < dig2n2) {
			dig1n1--;
		}
		String result1 = String.valueOf((dig1n1 - dig1n2 + 10) % 10);
		
		return result1 + result2 + result3;
	}
	
}
