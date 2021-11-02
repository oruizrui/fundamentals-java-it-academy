package src.base.scanner;

import java.util.Scanner;

public class Scann {
	static Scanner myScan = new Scanner(System.in);

	public static void close() {
		myScan.close();
	}
}
