class Singlearray
{
	public static void main(String args[])
	{
	
          int x[];
          int i;
          int n =Integer.parseInt(System.console().readLine("element:"));
           x = new int[n];
         for(i = 0;i<n;i++)
         {
            x[i] = Integer.parseInt(System.console().readLine());
          }
 int a = Integer.parseInt(System.console().readLine(" enter element :"));

         for( i = 0;i<n;i++)
         {
            if(a==x[i]){
            System.out.println(" element found"+x[i]);
              break;
          }
           }
if(i==n){

    System.out.println("element is not found ");
}

         

}}