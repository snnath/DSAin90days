class LL{
	Node head;
	private int size;
	
	LL(){
		this.size=0;
	}
	
	class Node{
			String data;
			Node next;
			
			Node(String data){
				this.data = data;
				this.next = null;
				size++;
				
			}
	}
	
	//add-first, last.
	public void addFirst(String data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(String data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			return;
		}	
		
		Node currNode=head;
		while(currNode.next!=null){
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	
	
	//print
	public void printList(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		Node currNode=head;
		while(currNode.next!=null){
			System.out.print(currNode.data+ " ");
			currNode=currNode.next;
		}
		System.out.println("NULL");
	}
	
	//delete first-last
	
	public void deleteFirst(){
		if(head==null){
			system.out.println("The list is empty");
			return;
		}
		size--;
		head=head.next; 
	}
	
	public void deleteLast(){
		if(head==null){
			system.out.println("The list is empty");
			return;
		}
		
		size--;
		if(head.next==null){
			head=null;
			return;			//the linked list contains only one node
		}
		
		Node secondLast = head;
		Node lasrNode=head.next;
		while(lastNode.next!=null){
			lastNode=lasrNode.next;
			secondLast=secondLast.next;
		}
		
		secondLast.next==null;
			
	}
	
	public int getSize(){
			return size;
	}
	
	public static void main(Sting args[]){
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		list.addLast("list");
		list.printList();
		
		list.addFirst("this");
		list.printList();
		
		list.deleteFirst():
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		system.out.println(list.getSize());
		list.addFirst("this");
		system.out.println(list.getSize());
		
	}
}