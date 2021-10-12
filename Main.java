class Main {
  public static void main(String[] args) {
    //This is how you declare and print strings// 
    String name = "Juan";
    System.out.println ("Hello" + " " + name); 
    int bigNum = 100; 
    bigNum = 10; // bigNum is now 10//
    System.out.println(bigNum);

    //final int bigNum = 7;
    //bigNum = 20; 
// Here we put variables into a variables 
    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + " " + lastName; 
    System.out.println(fullName);

    // How let's  make calculations 
    int x = 5, y = 6, z = 50; 
    System.out.println (x + y + z); 
    System.out.println (x * y * z);

    // Java identifiers 

    int mintuesPerHour = 60; // This is good

    int m = 60; // This is bad

    //Java  Data Type
    int myNum = 5; // Integer (whole number)
    float myFloatNum = 5.99f; // Floating point numbers
    char myLetter = 'M'; // Character
    String myText = "Hello"; // String 
    boolean myBool = true; // booLean  
  }
}