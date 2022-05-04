/* Insertion of element at any middle position by diffrent method*/

import java.util.*;



class Linkedlistdemo3{
	Scanner sc = new Scanner(System.in);
      Node head;	
      int count=0;
      Node temp;	 
	  static class Node{
	  int data;
	  Node next;
		Node(int d){
		this.data=d;
		next=null;
		}
	  }
		
	
	    void insert(int new_data){
			Node new_node = new Node(new_data);
			if(head==null){
			 head=new_node;
			 count++;
			  return;
			}
			if(head!=null){
				
		new_node.next= head;
		head = new_node;
		count++;
		}
		}
	
		
		
	    void insertAfter(int new_data1){
		Node new_node = new Node(new_data1);
		  if(head==null){
			 head=new_node;
			 count++;
			  return;
		  }
		  System.out.println("Enter choice");
		   int k = sc.nextInt();
		   temp=head;
		   for(int i=1;i<count;i++){
			   if((k-1)==i){
				  new_node.next= temp.next;
				  temp.next=new_node;
				  count++;
			
				  return;
			   }
			temp=temp.next;
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
		Linkedlistdemo3 l1 = new Linkedlistdemo3();
		//l1.head= new Node(10);
		/*
		Node second = new Node (20);
		Node third = new Node (30);
		Node fourth = new Node (40);
		Node fifth = new Node (50);
		
		l1.head.next=second;
		
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		l1.display();
		*/
		
		l1.insert(70);
		l1.insert(50);
		l1.insert(80);
		l1.insert(90);
		l1.insert(110);
		l1.insert(120);
		l1.display();
		l1.insertAfter(150);
		l1.display();
		
		
		
  } 
}