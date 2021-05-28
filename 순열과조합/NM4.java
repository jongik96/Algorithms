import java.util.Scanner;

public class NM4 {

	static int N,M;
	static int [] arr;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		dfs(1,0);

	}

	private static void dfs(int at, int depth) {
		if(depth==M) {
			for(int val:arr) {
				System.out.print(val+" ");
			}System.out.println();
			return;
		}
		
		for(int i=at; i<=N; i++) {
			arr[depth]=i;
			dfs(i,depth+1);
		}
		
		
		
	}

}
