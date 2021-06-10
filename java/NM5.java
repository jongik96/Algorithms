import java.util.Arrays;
import java.util.Scanner;

public class NM5 {

	static int N,M;
	static int [] arr;
	static int [] answer;
	static boolean [] visited;
	
	public static void main(String[] args) {
		// N개의 자연수 중에서 M개를 고른 수열
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		answer = new int[M];
		visited = new boolean[N+1];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		dfs(0);
		
		
	}

	private static void dfs(int depth) {
		if(depth==M) {
			for(int i=0;i<answer.length;i++) {
				System.out.print(answer[i]+" ");
			}System.out.println();
			return;
		}
		
		for(int i=0; i<N;i++) {
			if(!visited[i]) {
				visited[i] = true;
				answer[depth] = arr[i];
				dfs(depth+1);
				visited[i] = false;
			}
		}
		
		
		
	}

}
