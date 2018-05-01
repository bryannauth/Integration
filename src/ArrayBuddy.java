
//Bryan Nauth
//Array for PSI 2

class ArrayBuddy {

  public ArrayBuddy(int[] array1) {
    myArray = array1;
  }

  public static int getTotalSum() {
    int i = 0;
    int length = myArray.length;
    int totalSum = 0;
    while (i < length) {
      totalSum += myArray[i];
      i++;
    }
    return totalSum;
  }

  private static int[] myArray;

  public int smallestValue() {
    int smallestValue = myArray[0];
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] < smallestValue) {
        smallestValue = myArray[i];
      }
    }
    return smallestValue;
  }

  public int find(int value) {
    for (int i = 0; i < myArray.length; i++) {
      if (value == myArray[i]) {
        return i;
      }
    }
    return -1;
  }

}