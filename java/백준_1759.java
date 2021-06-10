import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_1759{
	static int L,C;
	static String[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new String[C];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<C;i++) {
			arr[i] = st.nextToken();
		}
		Arrays.sort(arr);
		solve(0,"");
		System.out.println(sb);
	}
	public static void solve(int index, String str) {
		if(str.length()==L) {
			if(check(str)) {
				sb.append(str).append("\n");
			}return;
		}
		if(index>=C) {
			return;
		}
		solve(index+1, str+arr[index]);
		solve(index+1, str);
	}
	public static boolean check(String str) {
		int mo=0;
		int ja=0;
		char c;
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				mo++;
			}else {
				ja++;
			}
		}
		if(mo>=1 && ja>=2) {
			return true;
		}return false;
	}
}
