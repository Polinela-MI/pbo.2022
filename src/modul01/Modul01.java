package modul01;

public class Modul01 {
	public static void main(String[] args) {
		if(args.length > 0) {
			int input = Integer.parseInt(args[0]);
			int[] operators = new int[input];
			int[] operand1 = new int[input];
			int[] operand2 = new int[input];
			int[] result = new int[input];
			
			for(int i = 1, j = 0; i < input*3; i=i+3, j++) {
				operators[j] = Integer.parseInt(args[i]);
				operand1[j] = Integer.parseInt(args[i+1]);
				operand2[j] = Integer.parseInt(args[i+2]);
			}
			
			for (int i = 0; i < operators.length; i++) {
				if(operators[i] == 1) {
					result[i] = operand1[i] + operand2[i];
				} else if(operators[i] == 2) {
					result[i] = operand1[i] - operand2[i];
				} else if(operators[i] == 3) {
					result[i] = operand1[i] * operand2[i];
				}
			}
			
			for (int i : result) {
				System.out.print(i +" ");
			}
		}
	}
}
