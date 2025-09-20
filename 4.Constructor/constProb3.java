// product and main class is given write the list class

class Product
{
    private int id;
    private String name;
    private double price;

	public void read()
	{

	  id = Integer.parseInt(System.console().readLine("enter the id : "));
	  name = System.console().readLine(" enter the name :");
	  price = Double.parseDouble(System.console().readLine());
	}

	public void print()
	{
		System.out.println(id+name+price);
	}

}

class List 
{
   private Product x[];
   int i;
	
	public List()
	{

		x = new Product[5];
		i = 0;
	}
	
	public void add(Product p)
	{
		x[i] = p;
		i++;
	}
	
	public void print()
	{
		for(int j = 0;j<i;j++)
		{

			x[j].print();
		}
	}
	
}

class constProb3
{
	public static void main(String args[])
	{
		Product  p1,p2,p3;

		p1 = new Product();
		p2 = new Product();
		p3 = new Product();
		
		p1.read();
		p2.read();
		p3.read();
		
		List l = new List();
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		
		l.print();

	}
}


		


	


