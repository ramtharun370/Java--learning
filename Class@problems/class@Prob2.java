class Student
{
 private int id;
 private String name;
 private Double fee;

public void read()
{
   id=Integer.parseInt(System.console().readLine(" enter ID :"));
   name=System.console().readLine(" enter name :");
   fee=Double.parseDouble(System.console().readLine(" enter fee :"));
}

public void print()
{
   System.out.printf("%d %s %f\n", id, name, fee);
}

}

class program
{

public static void main(String args[])
{
   Student  s[];
   s = new Student[4];
   int i;
   
   for(i = 0;i<s.length;i++)
      {
        s[i] = new Student();
         s[i].read();
       }
      int x = Integer.parseInt(System.console().readLine(" enter the value :"));
   for(i = 0;i<s.length;i++)
      {
             s[i].print();
       }
         
         }

         }