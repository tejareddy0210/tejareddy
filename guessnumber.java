import java.io.*;
import java.util.*;
public class Guessnumber {
public static void Guessnumber() {
	Scanner input=new Scanner(System.in);
	int num=1+(int)(100*Math.random());
	int k=6;
	int i,guess,read;
	System.out.println("welcome to guess the number game");
	System.out.println("System generates a number between 1 to 100."+"guess the number within 6 trails");
	for(i=0;i<6;i++) {
		System.out.println("guess the number:");
		guess=input.nextInt();
		if(guess>100||guess<0) {
			System.out.println("guess the number between 1 to 100");
		}
		else if(num==guess) {
			System.out.println("congratulations!...you guessed the number");
			break;
		}
		else if(num<guess && i!=k-1) {
			System.out.println("oops!...number is less than"+guess);
		}
		else if(num>guess && i!=k-1) {
			System.out.println("oops!...number is greater than"+guess);
		}
	}
	if(i==k) {
		System.out.println("oh no..no.of attemps finished to guess the number");
		System.out.println("the number is"+num);
		System.out.println("do you want to play the game again?");
		System.out.println("enter 1 if YES"+"else enter 0");
		read=input.nextInt();
		if(read==1) {
			Guessnumber();
		}
		else {
			System.out.println("Thankyou....");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guessnumber();
	}
}
