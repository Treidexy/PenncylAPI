package me.Treidex.PenncylAPI;

import java.io.*;

public class file {

	public static void create (String file_name) {
		try {
			File f = new File(file_name);
			FileWriter fw = new FileWriter(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void write (String text, String file_name) {
		try {
			File f = new File(file_name);
			FileWriter fw = new FileWriter(f, true);
			fw.write(text);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void set(String text, String file_name) {
		try {
			File f = new File(file_name);
			FileWriter fw = new FileWriter(f);
			fw.write(text);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String read (String file_name) {
		try {
			File f = new File(file_name);
			FileReader fr = new FileReader(f);
			FileInputStream fis = new FileInputStream(f);
			byte[] d = new byte[(int) f.length()];
			fis.read(d);
			fis.close();
			
			String r = new String(d, "UTF-8");
			return r;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
