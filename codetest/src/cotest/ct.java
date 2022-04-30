package cotest;

import java.util.Scanner;

public class ct {
static int cnt=0;
static int target=3;

static int [] num= {1,1,1,1,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		//int target=key.nextInt();
		System.out.println(solution(num,target));
		//System.out.println(num.length);
		//System.out.println(cnt);
	}
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        answer=sol(numbers,target,0,0);
        return answer;
    }

    public static int sol(int [] num,int target,int dep,int result) {
	       if (dep == num.length){
	            if (target == result){
	                cnt++;
	            }
	        }
	       else {
	        sol(num, target,dep+1, result + num[dep]);
	        sol( num, target,dep+1,  result - num[dep]);
	       }
		return cnt;
	}

}
