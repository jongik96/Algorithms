public class CrazyBot{
    boolean[][] grid = new boolean[100][100];
    int vx[] = {1, -1, 0, 0};
    int vy[] = {0, 0, 1, -1};
    double[] prob = new double[4];
    
    public double getProbability(int n, int left, int right, int down, int up){
        prob[0] = left/100.0;
        prob[1] = right/100.0;
        prob[2] = down/100.0;
        prob[3] = up/100.0;
        
        return dfs(50, 50, n);
    }
    
    double dfs(int x, int y, int n){
        if(grid[x][y]) return 0;
        //System.out.println("n = "+n);
        if(n==0) return 1;
        grid[x][y] = true;
        double ret = 0;
        for(int i=0; i<4; i++){
            // System.out.println(" | i = "+i+" : "+ret);
            ret += dfs(x+vx[i], y+vy[i], n-1) * prob[i];
        }
        
        grid[x][y] = false;
        return ret;
    }
}
