

class StringThree{
  public static void main(String[] args) {

// String literals pool 
    
    String stra = "atlas aws amazon";
    String [] arr = stra.split(" ");
    System.out.println("arr[1] = " + arr[1]);
    System.out.println("arr length = " + arr.length);
    for (int i=0; i<arr.length; i++){
      System.out.println("arr[i] = " + arr[i]);
    }
    
    System.out.println();
  }
}