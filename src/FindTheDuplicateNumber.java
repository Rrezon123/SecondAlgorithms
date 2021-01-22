import java.util.*;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("No.of array:");
		int n=in.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Vlaue of X%d = ",i);
			int k=in.nextInt();
			a[i]=k;
			k=0;
		}
		//int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
		if (duplicate(a) == -1) {
			System.out.println("NO DUPLICATE");
		} else {
			System.out.println("First Duplicate is "+duplicate(a));
		}

	}

	public static int duplicate(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i]))
				return arr[i];
		}
		return -1;
	}

}
