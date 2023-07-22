package week03;

import java.util.Arrays;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		//remove changes    
		//System.out.println("/n");
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] numbers = {1, 5, 2, 8, 13, 6};

		
		// 2. Print out the first element in the array
		System.out.println(numbers[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(numbers[numbers.length-1]);
		
		
		// 4. Print out the element in the array at position 6, what happens?
		System.out.println(numbers[5]);
		//Error: index 6 is out of bounds for length 6

		
		// 5. Print out the element in the array at position -1, what happens?
		System.out.println(numbers[0]);
		//Error: index is out of bounds

			
		// 6. Write a traditional for loop that prints out each element in the array
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for(int number: numbers) {
			System.out.println(number);
		}

		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		double sum = 0;
		for(int i: numbers) {
			sum += i;
		}
		System.out.println(sum);

			
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum/numbers.length;
		System.out.println(average);

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for(int number: numbers) {
			if(number%2!=0) {
				System.out.println(number);
			}
		}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};

		
		// 12. Calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for(String name: names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);

		

		//
		// Methods:
		//
		String name = "Sam";
		greeting(name);
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		System.out.println();
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(greetingAnother(name));

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		String s = "Something";
		int num = 15;
		System.out.println(numberOfLetters(s, num));
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		String[] kids= {"Guppies", "Blue", "Paw Patrol"};
		String x = "Guppies";
		System.out.println(stringList(kids, x));
		
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int[] number = {5, 7, 3, 4, 8, 10, 13, 6};	
		System.out.println("Minimum value in the list: " + findMin(number));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] doubleList = {1.2, 3.14, 4.4, 9.8};
		System.out.println("Average double: " + findAverage(doubleList));
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		String listOfAnimals[] = {"DOg", "Kitten", "Lion", "Animal"};
		//System.out.println("Returned Array: " + countEachString(listOfAnimals));
		System.out.println(Arrays.toString(countEachString(listOfAnimals)));
		

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		String [] toCompare  = {"Dog", "car", "internet", "commercial", "sofa", "sleep"};
		System.out.println(compareSums(toCompare));
		

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		String checkThis = "mama";
		System.out.println(isPalendrome(checkThis));
		
		

		
		
	}
	

	
	// Method 13:
	public static void greeting(String str) {
		System.out.print("Hello " + str);
	}


	// Method 14:
	public static String greetingAnother(String str) {
		return "Hello " + str;
	}

	
	// Method 15:
	public static boolean numberOfLetters(String str, int num) {
		if(str.length()> num)
			return true;
		else
			return false;
	}

	
	// Method 16:
	public static boolean stringList(String[] str, String s) {
		boolean found = false;
		for(String word: str) {
			if(word.equalsIgnoreCase(s)) {
				found = true;
			}
		}
		return found;
	}

	
	// Method 17:
	public static int findMin(int[] numbers) {
		int min = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

	
	// Method 18:
	public static double findAverage(double[] num) {
		double sum = 0;
		for(double n : num) {
			sum += n;
		}
		return sum/num.length;
	}

	
	// Method 19:
	public static int[] countEachString(String[] words) {
		int secondArr [] = new int [words.length];
		for (int i = 0; i < words.length; i++) {
			secondArr[i] = words[i].length();
		}
		return secondArr;
	}

	
	// Method 20:
	public static boolean compareSums(String [] words) {
		int evenSum = 0;
		int oddSum = 0;
		for(String word : words) {
			if(word.length()%2==0) {
				evenSum += word.length();
			} else {
				oddSum += word.length();
			}
		}
		if(evenSum > oddSum) {
			return true;
		} else {
			return false;
		}
	}

	
	// Method 21:
	public static boolean isPalendrome(String s) {
		//boolean isPal = true;
		String opposite = "";
		int l  = s.length();
		for(int i = 0; i < l; i++) {
			//System.out.println(s.charAt(i));
			opposite += s.charAt(l-i -1);
			}
		if(opposite.equalsIgnoreCase(s)) {
			return true;
		} else {
			return false;
		}
		}
	
}