/* RecursionDemo.java
   Accompanying the tutorial @
   https://youtu.be/lofN6g9j_W4
   by Konrad Wiley
*/
public class RecursionDemo{

    // driver method
    public static void main(String[] args){
        // run self-initialized recursive method
        System.out.println(addToTen());
        // run recursive method, starting at -20
        System.out.println(addToTen(-20));
    }

    // initialization method
    private static int addToTen(){
        int sum = 0;
        // call recursive method
        sum = addToTen(sum);
        // return only happens once exit condition
        // of recursive method is achieved
        return sum;
    }

    // recursive addToTen
    private static int addToTen(int sum){
        // check exit condition
        if(sum < 10){
            ++sum;
            // waits for return of recursive method call
            sum = addToTen(sum);
        }
        // we will only get here once <sum> is >= 10
        return sum;
    }
}
