package thirtyDaysOfCode;

import java.util.Hashtable;
import java.util.Scanner;

public class MoreReviewOnLinkedLists {

	/**
	 * 
	 * @param root
	 * @return
	 */
	public static LinkedListNode removeDuplicates(LinkedListNode root) {

		LinkedListNode temp = root;
		
		Hashtable<Integer,Boolean> table = new Hashtable<Integer,Boolean>();
		LinkedListNode previous = null;
		
		while (root != null) {
			if (table.containsKey(root.data)) {
				previous.next = root.next;
			} else {
				table.put(root.data, true);
				previous = root;
			}
			root = root.next;
		}

		return temp;
	}

	public static LinkedListNode insert(LinkedListNode head, int data) {
		LinkedListNode p = new LinkedListNode(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			LinkedListNode start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;
		}
		return head;
	}

	public static void display(LinkedListNode head) {
		LinkedListNode start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		System.out.println("h");

		Scanner scan = new Scanner(System.in);
		LinkedListNode head = null;
		int T = scan.nextInt();

		while (T-- > 0) {
			int ele = scan.nextInt();
			head = insert(head, ele);
		}

		head = removeDuplicates(head);
		display(head);

		scan.close();
	}
}