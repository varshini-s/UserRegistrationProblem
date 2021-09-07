package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{

	static String firstNamePattern="^[A-Z][a-z]{2,}";
	static String lastNamePattern="^[A-Z][a-z]{2,}";

	String firstName,lastName;

	public  void validation(String fieldToValidate)
	{
		String patternToCompile="";

		switch (fieldToValidate) 
		{
		case "firstName":
			patternToCompile=firstNamePattern;
			break;
		case "lastName":

			patternToCompile=lastNamePattern;
			break;



		}

		String validString="";
		while(true)
		{
			Scanner scanner = new Scanner(System.in);

			System.out.println("enter valid "+fieldToValidate);
			validString=scanner.nextLine();
			Pattern pattern = Pattern.compile(patternToCompile);
			Matcher matcher = pattern.matcher(validString);
			boolean matchFound = matcher.find();
			if(matchFound)
			{
				break;
			}


		}

		switch (fieldToValidate) 
		{
		case "firstName":
			firstName=validString;
			break;
		case "lastName":

			lastName=validString;
			break;



		}

	}

	public static void main(String[] args) 

	{

		System.out.println("welcome to user Registration problem");
	}
}
