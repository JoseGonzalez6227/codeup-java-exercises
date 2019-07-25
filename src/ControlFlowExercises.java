public class ControlFlowExercises {
    public static void main(String[] args) {
//        TODO:Loop Basics
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
//
        int evens = 0;
        do {
            if (evens % 2 == 0) {
                System.out.println(evens);
            }
            evens++;
        }while(evens <= 100);
//
        int j = 100;

        do {
            System.out.println(j);
            j-=5;
        }while(j >= -10);
//
        long start = 2;
        do {
            System.out.println(start);
            start*=start;
        }while(start < 1000000);
//
        for(int x = 100; x >= -10; x -= 5){
            System.out.println(x);
        }

        for(long y = 2; y < 1000000; y*=y){
            System.out.println(y);
        }
    }
}

//        TODO:Fizzbuzz
//        TODO:Display a table of powers.
//        TODO:Convert given number grades into letter grades.