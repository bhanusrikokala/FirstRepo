 public class MyFirstJavaProgram {

   public  void main(String []args) {
      System.out.println("Hello World");
       System.out.println("Hello Worldxsfsdcgdsf");
      sample s = new sample();
      System.out.println("hello"+s.some());
   }
} 

 class sample{
    public int a;
    public int b;
    public int some()
    {
        a=10;
        b=20;
        return a+b;
    }
    public sample()
    {
        System.out.println("in cons");
    }
    public sample(int x)
    {
        System.out.println(x);
    }
 
   
}

class A 
 { 
   public static void main()
  { 
    System.out.println("hi in Class A"); 
  }   
 } 
class B 
{ 
 public static void main(String args[]) 
 { 
    System.out.println(args[1]);
 }
}