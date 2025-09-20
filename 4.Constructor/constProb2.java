// write the block diagram for this program

class math
{
   int data;
	
	public math(int val)
	{
	   data = val;
	}
	
	public math sum(math m)
	{
	
		math t;
     		t = new math(m.data+data);
		return t;

	}

	public void print()
	{
		System.out.println(data);
	}

	}


class constProb2
{

	public static void main(String [] args)
	{

		math   m1,m2,m3;

 		m1 = new math(100);
		m2 = new math(200);
		m3 = m1.sum(m2);

		m3.print();

	}
}