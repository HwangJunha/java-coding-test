package around.section7;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {

    public int count(int time, int[] arr){
        int cnt = 1;
        int sum = arr[0];
        for(int i=1; i<arr.length; i++){
            if(sum + arr[i] > time){
                sum = arr[i];
                cnt++;
            }else{
                sum += arr[i];
            }
        }
        return cnt;
    }

    public int solution(int size, int targetCount, int[] arr){
        int answer = 0;
        // 가장 큰 값
        int lt = Arrays.stream(arr).max().getAsInt();
        // 모두 합친값
        int rt = Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid = (lt + rt)/2;
            if(targetCount >= count(mid, arr)){
                answer = mid;
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }
        return answer;
    }


    public static void main(String[] args){
        MusicVideo T = new MusicVideo();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.println(T.solution(n, m, arr));
    }
}
