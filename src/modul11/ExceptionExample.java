package modul11;

import java.util.ArrayList;

public class ExceptionExample {
	public static void main(String[] args) {
		System.out.println("Pertanyaan 2:");
		question2(args);
		
		System.out.println("Pertanyaan 3:");
		question3(args);
	}
	
	public static void question2(String[] args) {
		int i = 0;
        ArrayList<Integer> filtered = new ArrayList<>();
        System.out.print("Input: ");
        for(String s : args){
            System.out.print(s + " ");
        }
        System.out.println();

        while(i < args.length){
            try{
                filtered.add(Integer.parseInt(args[i]));
            }catch (NumberFormatException e){
                System.out.println("Invalid input: " + args[i]);
            }finally {
            	i++;
            }
        }
        
        System.out.print("Output: ");
        //mencetak hasil parsing
        for(Integer x : filtered){
            System.out.print(x + " ");
        }
        System.out.println();
	}
	
	public static void question3(String[] args) {
		int i = 0;
        ArrayList<Integer> filtered = new ArrayList<>();
        System.out.print("Input: ");
        for(String s : args){
            System.out.print(s + " ");
        }
        System.out.println();

        while(i < args.length){
            try{
                filtered.add(Integer.parseInt(args[i]));
                i++;
            }catch (NumberFormatException e){
                int j = 0;
                String n = "";
                if(args[i].equals("")){
                    i++;
                }else{
                    while(j < args[i].length()){
                        if(Character.isDigit(args[i].charAt(j))){
                            n = n + args[i].charAt(j);
                        }
                        j++;
                    }
                    args[i] = n;
                }
            }
        }
        
        System.out.print("Output: ");
        //mencetak hasil parsing
        for(Integer x : filtered){
            System.out.print(x + " ");
        }
        System.out.println();
	}
}
