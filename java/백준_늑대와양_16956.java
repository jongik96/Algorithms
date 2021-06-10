import java.util.Scanner;

public class 백준_늑대와양_16956 {
	// 늑대 사방에 울타리를 치는 경우네 ㅅㅂ
	
	private static int[] dx= {-1,1,0,0};
	private static int[] dy= {0,0,-1,1};
	
	public static void main(String[] args) {
		// 울타리설치
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int C = sc.nextInt();
		boolean flag = true;
		char[][] arr = new char[R][C];
		
		for(int i=0;i<R;i++) {
			String str = sc.next();
			for(int j=0; j<C; j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				if(arr[i][j] =='W') {
					for(int dir=0;dir<4;dir++) {
						int nx = i+dx[dir];
						int ny = j+dy[dir];
						
						if(0<=nx && nx<R && 0<=ny && ny<C) {
							if(arr[nx][ny]=='.') {
								arr[nx][ny]='D';
							}else if(arr[nx][ny]=='S') {
								flag=false;
							}
						}
					}
				}
			}
		}
		if(!flag) {
			System.out.println(0);
		}else {
			System.out.println(1);
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					System.out.print(arr[i][j]+" ");
				}System.out.println();
			}
		}
		
		
		
//		for(int i=0;i<R;i++) {
//			for(int j=0; j<C; j++) {
//				System.out.print(arr[i][j]+" ");
//			}System.out.println();
//		}
		
		
		
	}

}
