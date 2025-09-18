/* here main class already given we have to find out the sub class */

class List
{
    private int x[];
    private int i;
	
	public void create()
        {
		x = new int[10];
		i =0;
	}
	
	public void add( int val)
	{
		x[i] = val;
		i++;
	}

	public void print()
	{
		for(int j =0;j<i;j++)
		{
			System.out.println(x[j]);
		}
	}
}

class  FunctionProb1

{
	public static void main(String []args)
	{
		List l;
		l =new List();
		
		l.create();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);

		l.print();
	}
}