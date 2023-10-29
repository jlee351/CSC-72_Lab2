public class Lab2{

  //main method including code shown in question
  public static void main(String[] args) {
    Integer [] intArray = {1, 2, 3, 4, 5 };
    Double [] doubArray = {1.1, 2.2, 3.3, 4.4};
    Character [] charArray = {'H','E','L', 'L', 'O' };
    String [] strArray = {"onced", "upon", "a", "time" };
    //test getMaxGen()
    System.out.println(getMaxGen(strArray));
  }

  //1. A static printArrayNonGen() method with an array of Objects as parameter
  public static void printArrayNonGen(Object[] a){
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i] + ", ");
    }
  }

  //2. A static printArray() method using method overloading.

  //2a. Method that takes in array of integers
  public static void printArray(Integer[] intArray){
    for(int i = 0; i < intArray.length; i++){
      System.out.print(intArray[i] + " ");
    }
  }

  //2b. Method that takes in array of integers
  public static void printArray(Double[] doubArray){
    for(int i = 0; i < doubArray.length; i++){
      System.out.print(doubArray[i] + " ");
    }
  }

  //2c. Method that takes in array of integers
  public static void printArray(Character[] charArray){
    for(int i = 0; i < charArray.length; i++){
      System.out.print(charArray[i] + " ");
    }
  }

  //2d. Method that takes in array of integers
  public static void printArray(String[] strArray){
    for(int i = 0; i < strArray.length; i++){
      System.out.print(strArray[i] + " ");
    }
  }


  //3. A single static method printArrayGen() that uses the generic programming technique.
  public static <T> void printArrayGen(T[] genArray){
    for(int i = 0; i < genArray.length; i++){
      System.out.print(genArray[i] + " ");
    }
  }

  //4. A static method getMax() that takes an array of type Comparable and returns the maximum element in the array.
  public static Comparable getMax(Comparable[] anArray){
    Comparable temp = anArray[0];
    for(int i = 1; i < anArray.length; i++){
      if(temp.compareTo(anArray[i]) <= 0){
        temp = anArray[i];
      }
    }
    return temp;
  }

  //5. A type safe version of the method in 4 named getMaxGen().
  public static <T extends Comparable<T>> Comparable<T> getMaxGen(T[] genArray){
    Comparable T temp = genArray[0];
    for(int i = 1; i < genArray.length; i++){
      if(temp.compareTo(genArray[i]) <= 0){
        temp = genArray[i];
      }
    }
    return temp;
  }




}
