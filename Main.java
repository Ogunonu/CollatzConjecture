/*  Collatz Conjecture: For all positive integers
    prove that any odd number n * 3 + 1 and any even number n / 2
    repeated will result in the loop 4 - 2 - 1.
    Code by: Osman Gunonu */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 1;
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(4);
        Collatz coll = new Collatz(n, array);
        for(int i = n+1; i <= 100000; i++){
            coll.multdiv(i);
        }
        System.exit(0);
    }

    public static class Collatz{
        int n;
        ArrayList arr;

        Collatz(int n, ArrayList array){
            this.n = n;
            this.arr = array;
        }

        public void multdiv(int i){
            n = i;
            boolean bit = false;
            System.out.print("Starting num: " + n + " = ");
            while(n != 1) {
                /*
                for(int x = 0; x < arr.size(); x++){
                    if(arr.get(x) != Integer.valueOf(n)){
                        if(x == arr.size()-1){
                            arr.add(n);
                            break;
                        }
                    }
                    else{
                        System.out.println(" Found pattern.");
                        bit = true;
                        break;
                    }
                }
                if(bit){
                    break;
                }
                 */
                if (n % 2 == 0) { //even
                    n = n / 2;
                    System.out.print(n + " ");
                } else { //odd
                    n = (3 * n) + 1;
                    System.out.print(n + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
