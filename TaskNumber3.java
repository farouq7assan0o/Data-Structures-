public class MinPriorityQueue {
	  
	  // Node class to represent each element in the priority queue
		private class Node {
			int priority;
			String data;
			Node next;

	    
	    Node(int priority, String data) {
	    	this.priority = priority;
	    	this.data = data;
	    }
	  }

		private Node head; // Head of the linked list representing the priority queue

	  // Insert an element with a given priority into the priority queue
	  			public void insert(int priority, String data) {
	  				Node newNode = new Node(priority, data);

	    // If the priority queue is empty or the new node has the highest priority,
	    // make it the new head of the list
	  		if (head == null || priority < head.priority) {
	  			newNode.next = head;
	  			head = newNode;
	  }	    else {
		  		Node current = head;

	      // Traverse the list to find the correct position to insert the new node
		  	while (current.next != null && priority >= current.next.priority) {
		  		current = current.next;
	      }

	      // Insert the new node between the current node and the next node
		  		newNode.next = current.next;
		  		current.next = newNode;
	    }
	  }

	  // Get the element with the minimum priority from the priority queue
	  			public String getMin() {
	  		if (head == null) {
	  			return null; // Return null if the priority queue is empty
	    }

	  			return head.data; // Return the data of the head node
	  }

	  // Remove the element with the minimum priority from the priority queue
	  			public void removeMin() {
	  		if (head == null) {
	  			return; // Do nothing if the priority queue is empty
	   }

	  			head = head.next; // Move the head to the next node
	  }
	}