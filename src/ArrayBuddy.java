class ArrayBuddy {
  private static int watch = 999;

  public static int getWatch() {
    return watch;
  }

  public static void setWatch(int watch) {
    ArrayBuddy.watch = watch;
  }

 

  public static int getTotalSum() {
    int i = 0;
    int length = array.length;
    int totalSum = 0;
    while (i < length) {
      totalSum += array[i];
      i++;
    }
    return totalSum;
  }

  private static int indexVal = 999;

  public static int getIndexVal() {
    return indexVal;
  }

  public static void setIndexVal(int indexVal) {
    ArrayBuddy.indexVal = indexVal;
  }

  private static int[] array;

  public ArrayBuddy(int[] Array) {
    array = Array;
  }

  public int smallestValue() {
    for (int i = 0; i < array.length; i++) {
      if (array[i] < watch) {
        watch = array[i];
      }
    }
    return getWatch();
  }
  public int indexOf(int value) {
    for (int index : array) {
      if (value == array[index]) {
        indexVal = array[index];
      }
    }
    return ArrayBuddy.indexVal;
  }

}