import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number");

int user_input = scan.nextInt(); 

System.out.println("Number of 1's in the binary number: "+bitCalc(user_input));



}



public static int bitCalc(int user_input){

int count = 0;

for(int i =0; i < 32; i++){

if((user_input & 1) == 1){

count++;

}

user_input  = user_input >> 1;

}

return count;

	}

}
