/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
   if(head == null){
       head = new Node();  // new node if thereis nothing
       head.data = data;
   }else{
       Node node = head;
       while (node.next != null){ // traverse till last node
            node = node.next;
       }
       node.next = new Node(); // tail node
       node.next.data = data; // tail data
   }
    return head;
}
