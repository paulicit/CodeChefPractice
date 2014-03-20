package factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		int size = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < size; i++) {
			int nr = Integer.parseInt(bufferedReader.readLine());
			int zeros = 0;
			int myNo = 5;
			while (myNo <= nr) {
				zeros += nr / myNo;
				myNo *= 5;
			}
			System.out.println(zeros);
		}
	}
}
