/*  The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
    This is useful when exactly one object is needed to coordinate actions across the system.
*/

class Singleton{
    private Singleton(){
    }
    public String str;
    public static Singleton getSingleInstance(){
        return new Singleton();
    } 
}
