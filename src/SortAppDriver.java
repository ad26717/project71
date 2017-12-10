import javax.swing.*;

public class SortAppDriver {
        public static void main(String [] args) {
            int numArr[] = new int[10];
            int numCount = 1;
            for(int i = 0; i < 10; i++) {
                numArr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number " + numCount + ":"));
                numCount++;
            }
            SortApp.sorting(numArr);
            System.out.print("Array after it was adjusted: ");

            for(int x = 0; x < numArr.length; x++) {
                System.out.print(numArr[x] + ", ");
            }
        }
}

