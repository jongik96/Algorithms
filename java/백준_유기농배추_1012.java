import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준_유기농배추_1012 {
	
	static int M,N,K;
	static int [][] arr;
	static boolean [][] visited;
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	
	public static void bfs(int x, int y) {
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		
		qx.add(x);
		qy.add(y);
		
		while(!qx.isEmpty() && !qy.isEmpty()){
			x = qx.poll(); 
			y = qy.poll(); 
			visited[x][y] = true; 
			
			for (int i = 0; i < 4; i++){
				int _x = x + dx[i]; 
				int _y = y + dy[i]; 
				if(_x >= 0 && _y >= 0 && _x < M && _y < N){
					if(arr[_x][_y] == 1 && visited[_x][_y] == false){
						qx.add(_x); 
						qy.add(_y); 
						visited[_x][_y] = true;
					} 
				} 
			} 
		}

	}
	
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1012
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			
			int M = sc.nextInt();
			int N = sc.nextInt();
			int arr[][] = new int[M][N];
			int K = sc.nextInt();
			int count=0;
			
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j]=0;
				}
			}
			
			for(int i=0;i<K;i++) {
				arr[sc.nextInt()][sc.nextInt()]=1;
			}
			
			for(int i=0;i<M;i++) {
				for(int j=0; j<N;j++) {
					if(arr[i][j]==1 && !visited[i][j]) {
						bfs(i,j);
						count++;
					}
				}
			}
			
//			System.out.println();
//			for(int i=0;i<M;i++) {
//				for(int j=0;j<N;j++) {
//					System.out.print(arr[i][j]);
//				}System.out.println();
//			}
			

		}
	}

}
