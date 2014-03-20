package smallFactorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(System.in));
			int size = Integer.parseInt(bufferedReader.readLine());
		
			for (int i=0; i<size; i++){
				int fact=1;
				int nr = Integer.parseInt(bufferedReader.readLine());
				for (int j=0; j<nr;j++){
					fact*=j+1;
				}
				System.out.println(fact);
			}
	}
}
