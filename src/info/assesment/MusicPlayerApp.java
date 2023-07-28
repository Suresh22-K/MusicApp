package info.assesment;


import java.util.Scanner;

public class MusicPlayerApp {

	public static void rotate(int arr[], int d, int n, int inputvalue) {
		int p = 1;
		while (p <= d) {
			int last = inputvalue;
			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[n - 1] = last;
			p++;
		}

		for (int i = 0; i < n; i++) {
			System.out.print("S" + arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of songs you want to store: ");
		n = sc.nextInt();
		// creates an array in the memory of length n
		int[] arr = new int[n];
		System.out.println("Enter the songs of the list: ");
		for (int i = 0; i < arr.length; i++) {
			// reading array elements from the user
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			// Rotate 1 times
			int d = 1;
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Enter a song number to play: ");
			int value = sc1.nextInt();
			System.out.print("when S"+value+" song is played -> "); 
			// Function call
			rotate(arr, d, arr.length, value);
			System.out.println("");
		}

	}
}
