package com;

import java.util.Arrays;
import java.util.Scanner;

//	Main Class to Sort String and Words
public class StringSort {
	
	//	Method which is implemented to sort
	public void displaySortedString(String userInput){
		String[] stringSplit = userInput.split("\\W+");						//	User entered string is split to words with space as delimiter
		Arrays.sort(stringSplit, String.CASE_INSENSITIVE_ORDER);			//	Calling the Arrays sort method to sort the String
		
		System.out.println();
		System.out.print("The sorted order of the string is : ");
		for(int i = 0 ; i<stringSplit.length; i++){							//	Loop to print the sorted string of words
			System.out.print(stringSplit[i] + " ");
		}
		
		System.out.println();
		System.out.println();
				
		for (int i=0; i<stringSplit.length; i++){							//	Loop to sort alphabets in each word of the above user entered string
			String word = stringSplit[i];									//	each word is a string in the string array wordSplit[] 
			String[] wordSplit = word.split("");							//	splits each character of the word
			Arrays.sort(wordSplit, String.CASE_INSENSITIVE_ORDER);			//	sorts the character of the word 
			System.out.print("The sorted order of the word - " + stringSplit[i] + " - is : ");	
			for(int j=0;j<wordSplit.length;j++){							//	loop to print the sorted characters of word 
				System.out.print(wordSplit[j]+" ");
			}
			System.out.println();
		}
	}

	//	Main Method
	public static void main(String[] args) {
		StringSort stringSort = new StringSort();							//	Object of the Class
		
		Scanner userInput = new Scanner(System.in);							//	Scanner to get the user input from the console
		System.out.println("Enter the string ");
		
		stringSort.displaySortedString(userInput.nextLine());				//	Calling the sorting method from the class object
		
		userInput.close();													//	Closing the Scanner 
	}
}
