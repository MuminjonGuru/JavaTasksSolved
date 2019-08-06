class Main {
  public static void main(String[] args) {

    boolean t = true;

    first : {
      second : {
        third : {
          System.out.println("Before the break.");
          if (t) break second;  // break out of second block
          System.out.println("This won't execute");
        }
        System.out.println("This won't execute too");
      }
      System.out.println("This is after second block.");
    } 

  }
}

/*
  output:

  Before the break. 
  This is after second block.


  Civilized form of goto :)
*/
