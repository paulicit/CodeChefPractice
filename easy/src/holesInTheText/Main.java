package holesInTheText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		int size = Integer.parseInt(bufferedReader.readLine());
				for (int i = 0; i < size; i++) {
			int count = 0;
			String s = bufferedReader.readLine();
			for (int j=0; j<s.length(); j++){
				char c = s.charAt(j);
				if (c == 'B'){
					count= count +2;
				} else if (c == 'A' || c=='D' || c=='O' || c=='P' || c=='Q' || c=='R'){
					count = count +1;
				} 
			}
			System.out.println(count);
		}
	}
}
