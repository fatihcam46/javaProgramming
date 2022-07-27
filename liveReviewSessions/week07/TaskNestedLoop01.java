package week07;

public class TaskNestedLoop01 {
    public static void main(String[] args) {
         /*
    rowCount:5   column:dikey  row:yatay
    columnCount:5
    1                               : rowCount-1
    2 "diffrence 4" 6                         : rowCount-1, rowCount-2
    3 "diffrence 4" 7 "3" 10                  : rowCount-1, rowCount-2, rowCount-3
    4 "diffrence 4" 8 "3" 11 "2" 13
    5 "diffrence 4" 9 "3" 12 "2" 14 "1" 15
    What is repeating?
    How is it repeating?
    Algorithm:
    Nested Loop
    Outer loop should handle rows
    inner loop should handle columns
  */
            int rowCount = 8;
            for(int row=1; row<=rowCount;row++){  //outer loop
                int value = row;  // value variable holds printing value
                for(int column = 1; column<=row ; column++){
                    System.out.print(value+" ");
                    value += rowCount - column;
                }
                System.out.println();
            }
    }
}
