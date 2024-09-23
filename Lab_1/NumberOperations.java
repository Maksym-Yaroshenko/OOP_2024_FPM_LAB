import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NumberOperations {
	public static void main(String[] args) {
		
		 double x = 2;
		 x = 10.1242422;
//		 System.out.println(x);
//		 System.out.println(x);
		 
		 List<Number> numbers = new ArrayList<> ();

		 numbers.add(10);
		 numbers.add(20.5);
		 numbers.add(30);
		 numbers.add(40.7);
		 numbers.add(50);
		 numbers.add(60.3);
		 numbers.add(70);
		 numbers.add(80.1);
		 numbers.add(80.1);
		 numbers.add(100.9);
		 
//		 Свої числа:
		 numbers.add(24.94224);
		 numbers.add(24252.966436325);
		 numbers.add(5522.1111);
		 numbers.add(334);
		 numbers.add(222);

		 
		 System.out.print("Original numbers: ");
		 for(Number number : numbers) {
			 System.out.print(number + "  ");
			}	
		 System.out.println("");
		 
		 
		 System.out.print("Integer numbers: ");
	        for (Number number : numbers) {
	            if (number instanceof Double) {
	            	String result = String.format("%.0f", number);
	                System.out.print(result + "  ");
	            } else {
	                
	                System.out.print(number + "  ");
	            }
	        }
//		 for(Number number : numbers) {
//			 System.out.print(number.intValue() + "  ");
//		 }
		 System.out.println("");
		 
		 
		 System.out.print("Numbers with a floating point: ");
//		 for (Number number : numbers) {
//			 
//			 if (number instanceof Float) {
//				 System.out.printf("%.2f", number);
//	            } else {
//	                System.out.print(number + "  ");
//	            }
//			 
//		 }
		 
		for (Number number : numbers) {
					 
					 
			System.out.printf("%.2f", number.doubleValue());
			System.out.print("  ");
		 }
		 System.out.println("");
		
		 
		 List<Integer> integerNumbers = new ArrayList<> ();
		 List<Double> doubleNumbers = new ArrayList<> ();
		 
		 
		 for (Number number : numbers) {
			 if (number instanceof Integer) {
				 integerNumbers.add((Integer) number);
			 } else if (number instanceof Double) {
				 doubleNumbers.add((Double) number); 
			 } else {
				 
			 }
		 }
		 
		 
//		 System.out.println(integerNumbers);
		 System.out.print("integerNumbers: ");
		 for(Number number : integerNumbers) {
			 System.out.print(number + "  ");
		 }
		 System.out.println("");
		 
		 
//		 System.out.println(doubleNumbers);
		 System.out.print("doubleNumbers: ");
		 for(Number number : doubleNumbers) {
			 System.out.printf(number + "  ");
		 }
		 System.out.println("");
				
		 
		 
//		 BigDecimal
		 
		 BigDecimal a = new BigDecimal("43255253443255324532543656546645645645.4325525344325532453254365654664564564543255253443255324532543656546645645645432552534432553245325436565466456456454325525344325532453254365654664564564543255253443255324532543656546645645645");
		 
		 System.out.println("Example of BigDecimal: " + a);
		 
		 
//		 Option 5
		 
//		 const a = [1, 42, 54, 57537, 57, 2.22, 86, 65];

//		 for (int i = 0; i < numbers.size(); i++) {
//		   int b;
//		   if (a[i] > b) {
//		     b === a[i];
//		   }
//		   console.log(b);
//		 }
//		 
		 Number maxNumber = numbers.get(0);
		 
		 for (Number number : numbers) {
			 
			 if (number.doubleValue() > maxNumber.doubleValue()) {
				 maxNumber = number;
			 }
		 }

		 System.out.println("The biggest number: " + maxNumber);
		 
		 
		 
	}

}
