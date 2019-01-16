package Testing;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Autodemo {
	
	public static class ChangeOut {
		public static void main(String args[]) {
		try {
		System.setOut(new PrintStream(new FileOutputStream("log.txt")));
		System.out.println("Now the output is redirected!");
		} catch(Exception e) {}
		}
		}
}
