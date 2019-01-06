package com.guru.string.tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringmain {
	
	public static void main(String[] args) {
		
		String s1="abc123efgabc789abc1";
		String s2=new String("abc");
		// Create a pattern to be searched
		Pattern pt=Pattern.compile(s2);
		// Search above pattern in "abc123efgabc789abc"
		Matcher ma=pt.matcher(s1);
		int count=0;
		while(ma.find()) {
			count++;
			System.out.println(ma.start() +" to "+ma.end());
		}
		System.out.println("Count is "+count );
		
		System.out.println((s1.hashCode() ==s2.hashCode()) && s1.equals(s2));
		
		String s3=s1.concat(s2);
		System.out.println(s3+">>>>>>>--"+s3.hashCode());
		s3=s3.substring(0,3);
		System.out.println(s1.hashCode());
		
		System.out.println(s1);
		System.out.println(s2.hashCode());
		System.out.println(s3+">>>>>>>++"+s3.hashCode());
		
		String sf=s1+ 5+false;
		StringBuilder sb=new StringBuilder();
		sb=sb.append(s1).append(5).append(false);
		String sc=s1.concat("5").concat("false");
		System.out.println(sf +"==="+sb+"===="+sc);
		
	}

}
