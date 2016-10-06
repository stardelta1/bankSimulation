package Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHelper {
	public static String getInput() {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.flush();
		try {
			return stdin.readLine();
		} catch (IOException e) {
			return "ERROR:" +e.getMessage();
		}		 
	}
}
