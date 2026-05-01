package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	String inputString(String str) throws IOException {
		System.out.print(str);
		String str1 = reader.readLine();
		return str1;
	}

	int inputNumber(String str) throws IOException, NumberFormatException {
		System.out.print(str);
		String str2 = reader.readLine();
		return Integer.parseInt(str2);
	}

}
