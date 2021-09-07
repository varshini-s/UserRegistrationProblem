package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{

	static String firstNamePattern="^[A-Z][a-z]{2,}";
	static String lastNamePattern="^[A-Z][a-z]{2,}";
	static String mailIdPattern="^[a-z0-9]+([+[.]_-][a-z0-9]+){0,1}@[a-z0-9]+[.][a-z]{2,4}([.][a-z]{2,4}){0,1}$";
	static String phoneNumberPattern="^[0-9]{2}[ ][0-9]{10}$";
	static String passWordPattern="^(?=.*[0-9])(?=.*[A-Z])(?=.{8,}$)$";




	String firstName,lastName,mailId,phoneNumber,password;

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
		case "mailID":

			patternToCompile=mailIdPattern;
			break;

		case "phoneNumber":

			patternToCompile=phoneNumberPattern;
			break;
		case "passWord":

			patternToCompile=passWordPattern;
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

			scanner.close();

		}

		switch (fieldToValidate) 
		{
		case "firstName":
			firstName=validString;
			break;
		case "lastName":

			lastName=validString;
			break;
		case "mailID":

			mailId=validString;
			break;
		case "phoneNumber":

			phoneNumber=validString;
			break;
		case "passWord":

			password=validString;
			break;



		}

	}

	public static void main(String[] args) 

	{

		System.out.println("welcome to user Registration problem");
	}
}
