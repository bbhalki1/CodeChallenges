/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node n = new Node();
    n.data = data;
    n.next = null;
    Node nodeTemp = head;
    if(position == 0){
        n.next = head;
        head = n;
    }else{
        for(int i=1;i<position;i++)
            nodeTemp = nodeTemp.next;
        n.next = nodeTemp.next;
        nodeTemp.next = n;
    }
    return head;
}
