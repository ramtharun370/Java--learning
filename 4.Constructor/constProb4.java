// searching id from product class

class Product
{
   private int id;
   private String name;
   private double price;

	public void read()
	{
		id = Integer.parseInt(System.console().readLine("enter the id : "));
	        name = System.console().readLine(" enter the name :");
	        price = Double.parseDouble(System.console().readLine(" enter the price :"));

	}

	public void print()
	{

		System.out.println(id+name+price);

	}

	public int getid()
	{
		return id;
	}
}


class List
{

	private Product x[];
	int i;

	public List()
	{
		x = new Product[5];
		i =0;
	}

	public void add(Product p)
	{
		x[i] = p;
		i++;
	}
	public void print()
	{
		for(int j =0;j<i;j++)
		{
			x[j].print();
		}
	}
	
 
       public Product find(int m)
	{
 		for(int j = 0;j<i;j++)
		{
			if(x[j].getid()==m)
			{
				return x[j];
			}
		}
			return null;
	}
}


class constProb4
{
	public static void main(String []args)
	{
		Product  p1,p2,p3;

		p1 = new Product();
		p2 = new Product();
		p3 = new Product();
		
		p1.read();
		p2.read();
		p3.read();

		List  l = new List();
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		
		
		int k = Integer.parseInt(System.console().readLine("enter the id : "));

		Product  found = l.find(k);
		if(found!=null)
		{
			found.print();
		}

		else
		{

			System.out.println(" not found");
		}



	}
}
			