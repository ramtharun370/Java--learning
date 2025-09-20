//using constructor write list class again

class List
{ 
  private int x[];
   int i,j;


	public List()
	{
	  x = new int[5];
          i =0;
	}
	
	public void read(int val)
	{
		x[i] = val;
          	i++;
	}
       
	public void print()
	{
	
		for(j =0;j<i;j++)
		{
			System.out.println(x[j]);
		}
	}
	}


class constProb1
{
	public static void main(String args[])
	{
		List  l;
    		l = new List();
		l.read(100);
		l.read(200);
		l.read(300);
		l.read(400);

		l.print();

	}
}