import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author 은서파
 * @since 2021. 3. 25.
 * @see 
 * @mem 90,284 kb, 328 ms
 * @time 
 * @caution
 * [고려사항]
 * [입력사항]
 * [출력사항]
 */
public class 방향전환 {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder output = new StringBuilder();
	static StringTokenizer tokens;
	
	static int T;
	static Queue<Point> q;
	static int x1, y1, x2, y2;
	
	// 이동 방향을 잡을 때 세로세로, 가로가로 형태로.
	static int [][] deltas = {{-1, 0},{1, 0},{0, 1},{0, -1}};
	
	public static void main(String[] args) throws IOException {
		input = new BufferedReader(new StringReader(src));
		T = Integer.parseInt(input.readLine());
		for(int t=1; t<=T; t++) {
			tokens = new StringTokenizer(input.readLine(), " ");
			x1 = Integer.parseInt(tokens.nextToken()) +100;
			y1 = Integer.parseInt(tokens.nextToken()) +100;
			x2 = Integer.parseInt(tokens.nextToken()) +100;
			y2 = Integer.parseInt(tokens.nextToken()) +100;
			
			output.append("#").append(t).append(" ").append(bfs()).append("\n");
		}
		System.out.println(output);
	}
	
	static int bfs() {
		q = new LinkedList<>();
		// 관리해야 할 상태가 무려 3개!!!
		boolean [][][] visited = new boolean [201][201][2];
		// 수평으로, 수직으로 어디든 갈 수 있다.
		q.add(new Point(y1, x1, true));
		q.add(new Point(y1, x1, false));	
		visited[y1][x1][0] = true;
		visited[y1][x1][1] = true;
		
		int time = 0;
		while(!q.isEmpty()) {
			int size = q.size();
			while(size-->0) {
				// 1. 처음 녀석 가져오기
				Point head = q.poll();
				// 2. 필요하면 사용하기
				if(head.r==y2 && head.c== x2) {
					return time;
				}
				// 3. 다음 자식 가보기
				if(head.isHor) {
					for(int d=0; d<2; d++) {
						int nr = head.r + deltas[d][0];
						int nc = head.c + deltas[d][1];
						if(isIn(nr, nc) && !visited[nr][nc][1]) {
							visited[nr][nc][1]=true;
							q.offer(new Point(nr, nc, false));
						}
					}
				}else {
					for(int d=2; d<4; d++) {
						int nr = head.r + deltas[d][0];
						int nc = head.c + deltas[d][1];
						if(isIn(nr, nc) && !visited[nr][nc][0]) {
							visited[nr][nc][0]=true;
							q.offer(new Point(nr, nc, true));
						}
					}
				}
			}
			time++;
		}
		return -1;
	}
	
	static boolean isIn(int r, int c) {
		return 0<=r && r<201 && 0<=c && c<201;
	}
	
	
	
	static class Point{
		int r, c;
		boolean isHor;
		public Point(int r, int c, boolean isHor) {
			super();
			this.r = r;
			this.c = c;
			this.isHor = isHor;
		}
		@Override
		public String toString() {
			return "Point [r=" + r + ", c=" + c + ", isHor=" + isHor + "]";
		}
	}

	private static String src = "3\r\n" + 
			"0 0 1 0\r\n" + 
			"-1 -1 0 0\r\n" + 
			"0 0 0 2";
}
