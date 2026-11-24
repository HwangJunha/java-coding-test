package around.section7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point>{
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o){
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }

}

public class CoordinateSorting {
    public int[][] mySolution(int[][] arr){
        int[][] answer = arr.clone();
        Arrays.sort(answer, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Main T = new Main();
//        int n = sc.nextInt();
//        int[][] arr = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            arr[i][0] = sc.nextInt(); // x
//            arr[i][1] = sc.nextInt(); // y
//        }
//        for (int[] p : T.mySolution(arr)) {
//            System.out.println(p[0] + " " + p[1]);
//        }

        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x,y));
        }

        Collections.sort(arr);
        for(Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
