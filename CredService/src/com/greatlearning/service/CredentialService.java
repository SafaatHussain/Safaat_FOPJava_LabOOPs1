package com.greatlearning.service;


import java.util.Random;


public class CredentialService {

	
	public String generateEmailID(String firstname, String surname, String department)
	{
		return firstname+surname+"@"+department+".gl.com";
	}
	
	public char[] generatePassword()
	{
		String capLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String splchars="!@#$%^&*;<>+-/";
		String value=capLetters+smallletters+numbers+splchars;
		int i;
		char p[]=new char[8];
		
		Random random=new Random();
		for(i=0;i<8;i++)
		{
			p[i]=value.charAt(random.nextInt(value.length()));
		}
		return p;
		}
		
	
	public void displayEmpDetails(String firstname, String surname, String generateEmail, char[] genPwd)
	{
		
		System.out.println("Dear " + firstname + " " +  surname + " your generated credentials are as follows");
		//System.out.println("Emp FirstName is "+firstname);
		//System.out.println("Emp LastName is "+surname);
		System.out.println("Email ----> "+generateEmail);
		System.out.println("Password ----> "+genPwd);
	}
}