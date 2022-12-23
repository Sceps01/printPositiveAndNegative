import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String[][] board = new String[3][2];
        printwoArray(board);
        int[] array = {9,10,-18,20,-27,30,-36,40,45,50};
        int[] positivearray = new int[array.length];
        int[] negativeArray = new int[array.length];
        int postiveNumberCount = 0;
        int negativeNumbercount = 0;

        for( int i = 0; i < array.length; i++){
            if(array[i] < 0){
                negativeArray[negativeNumbercount] = array[i];
                negativeNumbercount++;
            } else{
                positivearray[postiveNumberCount] = array[i];
                postiveNumberCount++;
            }
        }
        System.out.println("total postive number: " + postiveNumberCount);
        System.out.println("total negative number: " + negativeNumbercount);
        System.out.print("postive array element: " );
        printArrayelement(positivearray, postiveNumberCount);
        System.out.println();
        System.out.print("postive array element " );
        printArrayelement(negativeArray, negativeNumbercount);
    }

    public static void printArrayelement(int[] array, int num){
        for( int i = 0; i < num; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void printwoArray(String[][] num){
        num[0][0] = "South carolina";
        num[0][1] = "Columbia";
        num[1][0] = "North Carolina";
        num[1][1] = "Raleign";
        num[2][0] = "Gorgia";
        num[2][1] = "Atlanta";

        for( int i = 0; i < num.length; i++){
            StringBuilder temp = new StringBuilder();
            temp.append("the capital of ").append(num[i][0]).append(" is ").append(num[i][1]).append(". ");
            System.out.println(temp);
        }
        System.out.println();
    }
}