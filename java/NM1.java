import java.util.Scanner;

public class NM1 {

	static int N;
	static int M;
	static int arr[];
	static int check[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[9];
		check = new int[9];
		dfs(0);
	}

	private static void dfs(int cnt) {
		if(cnt == M) {
			for(int i=0;i<M;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=1; i<=N; i++) {
			if(check[i]==1) continue;
			check[i]=1;
			arr[cnt]=i;
			dfs(cnt+1);
			check[i]=0;
		}
		
	}

}
