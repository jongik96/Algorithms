import java.util.Scanner;

public class NM2 {

	static int N,M;
	static int [] arr;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int [M];
		
		dfs(1,0);

	}


	private static void dfs(int at, int depth) {
		// 종료조건
		if(depth == M) {
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println();
			return;
		}
		
		// 탐색
		
		
		for(int i=at; i<=N; i++) {
			// 현재 깊이를 index로 하여 해당 위치에 i 값을 담음
			arr[depth] = i;
			
			// 재귀호출 : 현재 i값보다 다음 재귀에서 더 커야하므로
			// i+1의 값을 넘겨주고, 깊이 또한 1 증가시켜 재귀호출해준다.
			
			dfs(i+1,depth+1);
			
		}
	}

}
