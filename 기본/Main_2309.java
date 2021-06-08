import java.util.Arrays;
import java.util.Scanner;

public class Main_2309 {

	public static void main(String[] args) {
		// 일곱난쟁이
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int [] arr = new int[9];
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		int num1=0;
		int num2=0;
	
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i; j<arr.length; j++) {
				if( (sum-(arr[i]+arr[j]))==100 && i!=j   ) {
					num1=arr[i];
					num2=arr[j];
					break;
				}
				
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(num1==arr[i] || num2==arr[i])
				continue;
			
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
