package cotest;

import java.util.Scanner;

public class tt3 {
  static int [][] arr;
  static int [][] dp;
  static int []dx= {-1,1,0,0};
  static int [] dy= {0,0,-1,1};
  static int cnt=0;
  static int m,n;
  public static void main(String[] args) {
    Scanner key=new Scanner(System.in);

    m=key.nextInt();
    n=key.nextInt();

    arr=new int[m][n];
    dp=new int[m][n];
    for(int i=0;i<m;i++) {
      for(int j=0;j<n;j++) {
        arr[i][j]=key.nextInt();
      
      }
    }
/*
 7 7
 0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0

 */
    
    System.out.println(BFS(0,0));
    
    for(int i=0;i<m;i++) {
      for(int j=0;j<n;j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }

  }
  private static int BFS(int x, int y) {
	  arr[x][y]=1;
	  dp[x][y]=1;
    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];

      if ((0 <= nx && nx < m) && (0 <= ny && ny < n)) {

        if(arr[nx][ny]==0 && dp[nx][ny]==0) {
          if(nx==m-1 && ny==n-1) {
            arr[x][y]+=1;
          }
          if(arr[nx][ny]>0) {
            arr[x][y]+=arr[nx][ny];
          }
          else {
        	dp[nx][ny]=1;
            arr[x][y]+=BFS(nx,ny);
            dp[nx][ny]=0;
          }
        }
      }
    }

    return arr[x][y];
  }  }
