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
	
	
	public void reverseRecursive(Node head){
		
		if(head == null || head.next == null){
			return head;
		}
		reverseRecursive(head.next) = reverseRecursive(head.next);
		head.next.next=head;
		head.next=null;
		
		return newHead;
		
	}
	
	public static void main(String args[]){
		reverse list=new reverse();
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.printList();

		list.head = list.reverseRecursive(list.head);
		list.printList();
	}
}