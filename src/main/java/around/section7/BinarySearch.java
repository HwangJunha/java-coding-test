package around.section7;
import java.util.*;

public class BinarySearch {

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        Arrays.sort(arr);

        int lt = 0, rt = n -1;
        while(lt <= rt){
            int mid = (lt + rt)/2;
            if(arr[mid] == m){
                answer = mid + 1;
                break;
            }
            if(arr[mid] > m){
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }

        return answer;
    }

    public int mySolution(int size, int target,  int[] arr){
        Arrays.sort(arr);
        int start = 0;
        int end = size - 1;
        while(true){
            int center = start + end;
            if(center % 2 == 0){ //짝수
                int index = center/2;
                int value = arr[index];
                if(target == value){
                    return index + 1;
                }else if(target > value){
                    start = index + 1;
                }else {
                    end = index - 1;
                }
            }else{ //홀수
                int index = center/2 + 1;
                int value = arr[index];
                if(target == value){
                    return index + 1;
                }else if(target > value){
                    start = index + 1;
                }else {
                    end = index - 1;
                }
            }
        }
    }


    public static void main(String[] args){
        BinarySearch T = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];

        for(int i=0; i<a; i++) arr[i] = sc.nextInt();

        System.out.println(T.solution(a, b, arr));
    }
}
