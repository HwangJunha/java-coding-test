package around.section7;
import java.util.*;

public class DuplicateCheck {
    public String mySolution(int size, int[] arr){
        Set<Integer> arrSet = new HashSet<>();
        String solution = "U";
        for(int x: arr){
            if(arrSet.contains(x)){
                solution = "D";
                break;
            }
            arrSet.add(x);
        }

        return solution;
    }

    public String solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args){
        DuplicateCheck T = new DuplicateCheck();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = in.nextInt();
        System.out.println(T.mySolution(n, arr));
    }
}
