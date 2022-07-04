import java.util.*
class reverse{
	
	public void addLast(String data) {
       Node newNode = new Node(data);
 
       if(head == null) {
           head = newNode;
           return;
       }
	}

	 
	public void printList() {
		Node currNode = head;
 
		while(currNode != null) {
           System.out.print(currNode.data+" -> ");
           currNode = currNode.next;
		}
 
       System.out.println("null");
	}
   
   
	public void reverseIterate(){
		if(head == null || head.next == null){
			return;
		}
		Node prevNode=head;
		Node currNode=head.next;
		while(currNode!=null){
			Node nextNode=currNode.next;
			currNode.next=prevNode;
		
		//update
			prevNode=currNode;
			currNode=nextNode;
			
		}
		head,next=null;
		head=prevNode;
	}
	public static void main(String args[]){
		reverse list=new reverse();
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.printList();

		list.reverseIterate();
		list.printList();
	}
}