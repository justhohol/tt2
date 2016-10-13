package q_iteratormode;

public class IteratorTest {
	
	public static void main(String[] args) {
		CollectionI collection = new MyCollection();
		IteratorI it = collection.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
