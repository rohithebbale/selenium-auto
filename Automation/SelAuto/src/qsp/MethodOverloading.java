package qsp;

class R1
{
	public void add()
	{
		System.out.println("hello");
	}
	public void add(int i)
	{
		System.out.println(i);
	}
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		R1 r = new R1();
		r.add(10);
		r.add();
		r.add(10, 20);

	}
	}