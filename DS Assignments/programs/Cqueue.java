class Cqueue
{
	int n=8;
	int CQ[]=new int[n];
	int Rear;
	int Front;
	Cqueue()
	{
		Front=-1;
		Rear=-1;
	}
	
	boolean isFull()
	{
		if(Front==0&&Rear==n-1)
		{
			return true;
		}
		return false;
	}
	boolean isEmpty()
	{
		if(Front==-1&&Rear==-1)
		{
			return true;
		}
		if(Front>Rear)
		{
			return true;
		}
		return false;
	}
	void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
			
		}
		else if(Front==-1&&Rear==-1)
		{
			Front=(Front+1)%n;
			Rear=(Rear+1)%n;
			CQ[Rear]=x;
			System.out.println(CQ[Rear]+" element is enqueued");
		}
		else
		{
		Rear=(Rear+1)%n;
		CQ[Rear]=x;
		System.out.println(CQ[Rear]+" element is enqueued");
		}
	}
	int dequeue()
	{
		int element;
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		if(Front==Rear)
		{
			Front=-1;
			Rear=-1;
		}
		element=CQ[Front];
		Front=(Front+1)%n;
		System.out.println(element+" is dequeued");
		return element;
	}
	
	void display()
	{
		if(Rear>=Front)
		{
		for(int i=Front;i<=Rear;i++)
		{
			
			System.out.print(CQ[i]+" ");
			
		}
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(CQ[i]+" ");
			}
			
		}
	}
	public static void main(String args[])
	{
     Cqueue c1=new Cqueue();
     c1.enqueue(10);
     c1.enqueue(20);
	 c1.enqueue(30);
	 c1.enqueue(40);
	 c1.enqueue(50);
	 c1.enqueue(60);
	 c1.enqueue(70);
	 c1.enqueue(80);
	 c1.enqueue(90);
     c1.display();
	 System.out.println();
	 c1.dequeue();
	 c1.display();
	 System.out.println();
	 c1.enqueue(100);
	 c1.display();
	}
	
}
	 