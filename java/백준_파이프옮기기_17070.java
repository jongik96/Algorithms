import java.util.Scanner;

public class 백준_파이프옮기기1_17070 {

	static int N,count;
	static int [][] arr;
	
	public static void main(String[] args) {
		// 파이프를 1,1에서 n,n 까지 옮기기
		// https://www.acmicpc.net/problem/17070
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			for( int j=1; j<=N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		move(1,2,0);   // 첫좌표 1,2    방향은 가로 0
		System.out.println(count);
		
		
	}
	
	// 방향 = dir = 가로일때 0 세로일 때 1 대각선일 때 2
	private static void move(int x, int y, int dir) {
		
		// dfs?!
		if(x==N && y==N) {     // N,N에 도착하면 카운트 후 종료
			count++;
			return;
		}
		
		if(dir == 0) { // 가로방향일때는 가로, 대각선 방향만 밀기 가능
			if(x<=N && y+1<=N && arr[x][y+1]==0) { // 가로로 밀때
				move(x,y+1,0);
			}
			if(x+1<=N && y+1<=N && arr[x][y+1]==0 && arr[x+1][y]==0 &&arr[x+1][y+1]==0 ) {
				move(x+1,y+1,2);   // 대각선 밀기
			}
		}
		
		else if(dir == 1) {  // 세로 방향일 때는 대각선, 세로만 가능 
			if(x+1<=N && y<=N && arr[x+1][y]==0) { // 세로로 밀때
				move(x+1,y,1);
			}
			if(x+1<=N && y+1<=N && arr[x][y+1]==0 && arr[x+1][y]==0 &&arr[x+1][y+1]==0 ) {
				move(x+1,y+1,2);
			}
		}
		
		else if(dir == 2) {   // 대각선 방향일 때는 가로,세로,대각선 3방향 가능
			if(x<=N && y+1<=N && arr[x][y+1]==0) { // 가로로 밀때
				move(x,y+1,0);
			}
			if(x+1<=N && y+1<=N && arr[x][y+1]==0 && arr[x+1][y]==0 &&arr[x+1][y+1]==0 ) {
				move(x+1,y+1,2);   // 대각선 밀기
			}
			if(x+1<=N && y<=N && arr[x+1][y]==0) { // 세로로 밀때
				move(x+1,y,1);
			}
			
		}

		
	}

}
