




package ArraysAndMethods;

import java.time.Year;
import java.util.Arrays;

public class Week3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			System.out.println("Answer 1:");
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};  
		
		//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
					int lengthOfArr = ages.length; 
					int difference = Math.absExact(ages[lengthOfArr - lengthOfArr] - ages[lengthOfArr -1]); 
					System.out.println("Difference of first and last element in ages[] = " + difference);
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
					int[] newAgeAdded = new int[ages.length];
					System.arraycopy(ages, 0, newAgeAdded, 0, ages.length);
					lengthOfArr = newAgeAdded.length;
					newAgeAdded[lengthOfArr - 1] = 100;
					difference = Math.abs(newAgeAdded[lengthOfArr - lengthOfArr] - newAgeAdded[lengthOfArr - 1]);
					System.out.println("Difference of first and last element in newAges[] = " + difference);
					
		//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
					int sum = 0; 
					for (int i = 0; i < newAgeAdded.length; i++) {
						sum += newAgeAdded[i];
					}
					double average = sum / lengthOfArr;
					System.out.println("The average age in newAges[] = " + average);
					
					
	

	//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
					System.out.println(" ");
					System.out.println("Answer 2:");

					String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
					sum = 0;
		
		//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			
					for (int i = 0; i < names.length; i++) {
						sum += names[i].length();
					}
					average = sum / names.length;
				System.out.println("The average number of letters per name in names[] = " + average);
		
		//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
				System.out.println(" ");
				System.out.println("Answer 2 Part B:");
				String allNames = "";
				for (int i = 0; i < names.length; i++) {
					allNames += names[i] + " ";
				}
				System.out.println(allNames); 
				
				
	
		//3.	How do you access the last element of any array?
				System.out.println(" ");
				System.out.println("Answer 3:");
				System.out.println("Use array[arr.length] to access the last element of an array");
				
				
				
		//4.	How do you access the first element of any array?
				System.out.println(" ");
				System.out.println("Answer 4:");
				System.out.println("Use array[0] to access the last element of an array");
				
				
		//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
				int[] nameLengths = new int[names.length];
				for (int i = 0; i < names.length; i++) {
					nameLengths[i] = names[i].length();
				}
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
				System.out.println(" ");
				System.out.println("Answer 6:");
				sum = 0;
					for (int i = 0; i < nameLengths.length; i++) {
						sum += nameLengths[i];
					}
						System.out.println("The sum of all lengths in nameLengths[] = " + sum);
						
						
						//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
						System.out.println(" ");
						System.out.println("Answer 7:");
						System.out.println(duplicateWord("Hello", 2));
						
						
						
						
						
						//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
						System.out.println(" ");
						System.out.println("Answer 8:");
						System.out.println(getFullName("Bruce", "Banner"));
						
						
						
						
						
						
						//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
						System.out.println(" ");
						System.out.println("Answer 9:");
						System.out.println("checkIfSumGreaterThan100() returns => " + checkIfSumGreaterThan100(ages));
						
						
						
						
						//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
						double[] doubleArr = {0.1, 1.0, 236.4592, 1000.1};
						double[] emptyDoubleArr = {};
						System.out.println(" ");
						System.out.println("Answer 10:");
						System.out.println("getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(doubleArr));
						System.out.println("Passing empty double[] to getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(emptyDoubleArr));
						
						
						
						
						//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
						double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
						System.out.println(" ");
						System.out.println("Answer 11:");
						System.out.println("isFirstArrAvgGreater returns => " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
						
						
						
						//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
						System.out.println(" ");
						System.out.println("Answer 12:");
						System.out.println("getAge() returns => " + getAge(2004));
						
						
						
						//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it. 
						
						//Trying to find the largest number between two values
						System.out.println(" ");
						System.out.println("Answer 13:");
						System.out.print("The first number: " + 5);
				        System.out.println(" ");
				        System.out.print("The Second number: " + 6);
				        System.out.println(" ");
				        System.out.print("The largest value is " + largest(5, 6)+ "\n" );
	
}
	
	
	
	
	
	
	
	
	
	
				private static String duplicateWord(String word, int n) {
					String duplicatedWord = "";
					for (int i = 0; i < n; i++) {
						duplicatedWord += word;
					}
					return "duplicatedWord() returns => " + duplicatedWord;
				
				}
				private static String getFullName(String firstName, String lastName) {
					return "getFullName() returns => " + firstName + " " + lastName;
				}
				private static Boolean checkIfSumGreaterThan100(int[] arr) {
					return Arrays.stream(arr).sum() > 100;
				}
				private static double getAverageOfDoubleArr(double[] arr) {
					// We need to use .orElse() in case an empty array is passed in
					return Arrays.stream(arr).average().orElse(Double.NaN);
				}
				private static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
					return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr); 
				}
				private static int getAge(int birthYear) {
					return Year.now().getValue() - birthYear;
				}
				private static double largest(double x, double y) {
					return Math.max(Math.max(x, y), 0);
				}
	
	
}