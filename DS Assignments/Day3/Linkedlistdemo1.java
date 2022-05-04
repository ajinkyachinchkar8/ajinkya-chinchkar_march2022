/* Making of simple linkedlist*/

  class Linkedlistdemo1{
      Node head;	  
	  static class Node{
	  int data;
	  Node next;
		Node(int d){
		this.data=d;
		next=null;
		}
	  }
		
		void display(){
		Node n = head;
		while (n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	}
	
  public static void main (String... args){
		Linkedlistdemo1 l1 = new Linkedlistdemo1();
		l1.head= new Node(10);
		Node second = new Node (20);
		Node third = new Node (30);
		Node fourth = new Node (40);
		Node fifth = new Node (50);
		
		l1.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		l1.display();
  } 
}



