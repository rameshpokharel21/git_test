/*hello how are you?
I am fine. Thank you!
mixing for-each loop and for loop in 2d array
ragged array
*/
public class Hello{
    public static void main(String[] args) {
        
        int[][] twod = {{5, 9, 2}, {7, 1, 3}, {9, 0}};

        int i = 0;

        for(var x : twod){
            i = 0;//reset i here
            while(i < x.length){//x is nested array
                System.out.print(x[i] + "\t");
                ++i;
            }
            System.out.println();//new line after each row

        }//closing for loop
    }
}

