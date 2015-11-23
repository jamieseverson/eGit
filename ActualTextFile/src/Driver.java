import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		try{
			
			File usa = new File("america.txt");
			Scanner stones = new Scanner(usa);
			
			int[] age = new int[3];
			String[] firstname = new String[3];
			String[] lastname = new String[3];
			
			PrintWriter pw = new PrintWriter ("muricaOut.txt");
			
			for(int i = 0; i<3; i++){
				
				age[i] = stones.nextInt();
				firstname[i] = stones.next();
				lastname [i] = stones.next();
				System.out.println(age[i] + " " + firstname[i] + " " + lastname[i]);

			}
				int newfirstname = (int) (Math.random() * firstname.length);
				int newlastname = (int) (Math.random() * lastname.length);
				
				pw.write(firstname[newfirstname].toUpperCase() + " " + lastname[newlastname].toUpperCase() +"\n");
				pw.write("Your first name starts with letter: " + firstname[newfirstname].substring(0, 1));
				pw.close();
				stones.close();
			}
		
		catch (Exception e) {
			System.out.println("You have an error!");
			//for exceptions print ^
		}
	}
}
