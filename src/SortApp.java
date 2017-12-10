public class SortApp {

    public static void swap(int firstNum, int otherNum, int [] numArr) {
        int temproraryIdx = numArr[firstNum];
        numArr[firstNum] = numArr[otherNum];
        numArr[otherNum] = temproraryIdx;
    }
    public static void sorting(int [] numArr) {
        for(int i = 0; i < numArr.length; i++) {
            for(int x = i; x > 0; x--) {
                if(numArr[x] < numArr[x-1]) {
                    SortApp.swap(x, x-1, numArr);
                }
            }
        }
    }
}
