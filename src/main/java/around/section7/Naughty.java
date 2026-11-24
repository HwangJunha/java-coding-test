package around.section7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Naughty {

    public int[] mySolution(int size, int[] arr){
        int[] answer = new int[2];
        int [] tmp = arr.clone(); //기존 올바른 순서
        Arrays.sort(arr);

        for(int i=0; i<size; i++){
            if(arr[i] != tmp[i]){
                if(answer[0] == 0){
                    answer[0] = i + 1;
                }else{
                    answer[1] = i + 1;
                }
            }
        }

        return answer;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i = 0; i<n; i++){
            if(arr[i] != tmp[i]) answer.add(i + 1);
        }
        return answer;
    }

    public static void main(String[] args){
        Naughty T = new Naughty();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = in.nextInt();
        for(int x : T.mySolution(n, arr)) System.out.print(x+ " ");
    }
}
