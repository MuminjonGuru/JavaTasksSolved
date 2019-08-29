class Add {
    public void add(int... intArgs) {
        int sum = 0;
        String separator = "";
        for(int i : intArgs) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";
        }
        System.out.println("=" + sum);
    }
}

/*
  I have implemented this class to solve one of the Java programming problems.
  
  When there are numbers like these:
  
  Input:
    1
    2
    3
    4
    5
    6
  
  Output should be:
    1+2=3
    1+2+3=6
    1+2+3+4+5=15
    1+2+3+4+5+6=21
    
    
  You can use this snippet.   
  
*/
