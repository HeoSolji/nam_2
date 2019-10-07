import java.util.Scanner;
import java.util.LinkedList;
class testLinkedList {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<String> myLinked = new LinkedList<String>();
		for(int i=0;i<n;i++){
			String a=sc.nextLine();
			myLinked.addLast(a);
		}
		for(String ob:myLinked){
			System.out.print(ob + " ");
		}
	}
}