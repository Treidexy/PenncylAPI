package me.Treidex.PenncylAPI;

import java.io.*;
import java.util.*;

public class console {
	
	console (String err) {
		
	}
/////////////////////////////////////////////////////////////////////
//		console.log();
		public static void log(String s) {
			System.out.println(s);
		}
		
		public static void log(char c) {
			System.out.println(c);
		}
		
		public static void log(float f) {
			System.out.println(f);
		}
		
		public static void log(double d) {
			System.out.println(d);
		}
		
		public static void log(int i) {
			System.out.println(i);
		}
		
		public static void log(char[] s) {
			System.out.println(s);
		}
		
		public static void log(long l) {
			System.out.println(l);
		}
		
		public static void log(byte b) {
			System.out.println(b);
		}
		
		public static void log(byte[] s) {
			System.out.println(s);
		}
		
		public static void log(Object o) {
			System.out.println(o);
		}
////////////////////////////////////////////////////////////////////////////////////////////////
//		console.error();
		public static void error(String s) {
			System.err.println(s);
		}
		
		public static void error(char c) {
			System.err.println(c);
		}
		
		public static void error(float f) {
			System.err.println(f);
		}
		
		public static void error(double d) {
			System.err.println(d);
		}
		
		public static void error(int i) {
			System.err.println(i);
		}
		
		public static void error(char[] s) {
			System.err.println(s);
		}
		
		public static void error(long l) {
			System.err.println(l);
		}
		
		public static void error(byte b) {
			System.err.println(b);
		}
		
		public static void error(byte[] s) {
			System.err.println(s);
		}
		
		public static void error(Object o) {
			System.err.println(o);
		}
////////////////////////////////////////////////////////////////////////
//	get
	public static String get()  {
		Scanner i = new Scanner(System.in);
    	
    	return i.next();
    
	}
	public static String get(String prompt)  {
		Scanner i = new Scanner(System.in);
    	
		System.out.println(prompt);
    	return i.next();
    
	}

}
