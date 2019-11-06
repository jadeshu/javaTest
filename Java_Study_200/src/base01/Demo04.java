package base01;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo04 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		
		PrintStream out = System.out;
		PrintStream pStream = null;
		try {
			pStream = new PrintStream("./bin/base01/log.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setOut(pStream);
		System.out.println("年了121212货");
		System.out.println("skdjksjdksjdkjskdj");
		System.setOut(out);
	}

}
