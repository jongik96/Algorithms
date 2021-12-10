import java.util.Scanner;
 
public class Expert_1868지뢰찾기 {
    static int num;
    static int dx[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int dy[] = { 0, 1, -1, -1, 1, -1, 0, 1 };
    static int map[][];
    static boolean check[][];
    
    static void solution(int x,int y) {
        check[x][y]=true;
        for(int i=0;i<8;i++) {
            // 주변 칸이 방문하지 않은 0일 경우 해당 칸에 solution 실행 
            if(map[x+dx[i]][y+dy[i]]==0&&!check[x+dx[i]][y+dy[i]]) {
                solution(x+dx[i],y+dy[i]);
            }
            // 0의 주변 칸이 숫자일 경우 방문 처리
            else if(map[x+dx[i]][y+dy[i]]!=-1&&map[x+dx[i]][y+dy[i]]!=99&&!check[x+dx[i]][y+dy[i]]) {
                check[x+dx[i]][y+dy[i]]=true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            num = 0;
            int N = sc.nextInt();
            map = new int[N + 2][N + 2];
            check = new boolean[N + 2][N + 2];
            
            for (int i = 0; i <= N + 1; i++) {
                String str="";
                if(i!=0&&i!=N+1) {
                    str=sc.next();
                }
                for (int j = 0; j <= N + 1; j++) {
                    if (i == 0 || i == N + 1 || j == 0 || j == N + 1) {
                        map[i][j] = -1; // 맵 바깥
                    } else {
                        if(str.charAt(j-1)=='.') {
                            map[i][j]=1;
                        }else {
                            map[i][j]=99; // 지뢰
                        }
                    }
                }
            }
           
            for(int i=1;i<=N;i++) {
                for(int j=1;j<=N;j++) {
                    if(map[i][j]==1) {
                        int count=0;
                        for(int k=0;k<8;k++) {
                            if(map[i+dx[k]][j+dy[k]]==99) {
                                count++;
                            }
                        }
                        map[i][j]=count;
                    }
                }
            }
            
            for(int i=1;i<=N;i++) {
                for(int j=1;j<=N;j++) {
                    if(map[i][j]==0&&!check[i][j]) {
                        solution(i,j);
                        num++;
                    }
                }
            }
           
            for(int i=1;i<=N;i++) {
                for(int j=1;j<=N;j++) {
                    if(map[i][j]!=0&&map[i][j]!=-1&&map[i][j]!=99&&!check[i][j]) {
                        num++;
                    }
                }
            }
            System.out.printf("#%d %d\n",test_case,num);
        }
    }
}
