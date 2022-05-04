/* Insertion of element at end position or to append*/

class Linkedlistdemo5{
	
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
			System.out.print(" "+n.data);
			n=n.next;
		}
	}
	
	    void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next= head;
		head = new_node;
		}
		
		
		void insertAfter(Node prev, int new_data){
			if(prev==null){
				 System.out.println("Insertion not possible");
			return;
			}
		 Node new_node = new Node (new_data);
		 new_node.next = prev.next;
		 prev.next=new_node;
		}
		
		
		void append(int new_data){
			Node new_node = new Node(new_data);
			if(head==null){
				 head=new_node;
				 return;
			}
			new_node.next=null;
			Node n = head;
			while(n.next!=null){
				n=n.next;
			}
			n.next=new_node;
			return;
		}
		
	
	    
  public static void main (String... args){
		Linkedlistdemo5 l1 = new Linkedlistdemo5();
		
		l1.head= new Node(10);
		Node second = new Node (20);
		Node third = new Node (30);
		Node fourth = new Node (40);
		Node fifth = new Node (50);
		
		l1.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
	
		l1.insert(70);
		l1.insert(80);
		l1.insert(90);
		l1.insert(100);
		l1.append(199);
		
		l1.insertAfter(l1.head,67);
		l1.insertAfter(l1.head.next,106);
		l1.insert(99);
		l1.insertAfter(l1.head.next.next,87);
	    l1.append(107);
		l1.display(); // 99 100 67 87 106 90 80 70 10 20 30 40 50 199 107
  }
}
		
	
		