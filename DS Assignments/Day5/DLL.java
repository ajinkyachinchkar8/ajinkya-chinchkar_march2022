class DLLDemo {
	Node head;
	 class Node {
		 int data;
		 Node next;
		 Node prev;
		 
		   Node(int d){
			   data=d;
			   next=null;
			   prev=null;
		   }
	
     void insert(int new_data){
          Node new_node = new Node(new_data)
              new_node=head;
              new_node.prev=null;
                 if(head!=null){
                     head.prev=new_node;
	                 head=new_node;	
	 }			
}	 

    public static void main(String args[]){
		DLL d1 = new DLL(




