package around.section7;

import java.util.Arrays;
import java.util.Scanner;

public class ChooseStall {

    public int count(int[] arr, int dist){
        int cnt = 1;
        int ep = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] - ep >= dist){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        //정렬
        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[arr.length-1];

        while(lt <= rt){
            //이 거리에서 몇 마리의 말이 나올 수 있는지
            int dist = (lt+rt)/2;
            //거리를 줄여도 된다.
                if( m <= count(arr, dist)){
                    answer = dist;
                    lt = dist + 1;
                }else{
                    rt = dist - 1;
                }

            }
        return answer;
    }

    public static void main(String[] args){
        ChooseStall T = new ChooseStall();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.println(T.solution(n, m, arr));
    }
}
