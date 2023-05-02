package co.greatlearning.SkyScraper;

import java.util.Scanner;
public class SkyScraper {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int size  = sc.nextInt()+1;
		int [] arr = new int [size];
		for (int i=0; i<size; i++) {
			arr[i] = -1;
		}
		String res = "\n";
		int pointer = size-1;
		for (int i=1; i<size; i++) {
			System.out.println("enter the floor size given on day: "+i);
			arr[sc.nextInt()] = 1;
			res = res+"Day: "+i+"\n";
			while (arr[pointer]!=-1) {
				res = res+pointer+" ";
				pointer--;
			}
			res = res+"\n";
		}
		sc.close();
		System.out.print(res);
	}

}