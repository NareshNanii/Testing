package FB;

import java.util.Scanner;

public class Pattern {
public static void main(String[] args) {
	//int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num");
	int rows = sc.nextInt();
	System.out.println("pattern below");
	for(int i=1; i<=rows;i++){
		for(int j=1; j<=i; j++){
			System.out.print(j);
		}
		System.out.println();
	}
	for(int i=rows-1;i>=1;i--){
		for(int j=1; j<=i;j++){
			System.out.print(j);
		}
		System.out.println();
	}
	sc.close();
}
}
