package q_iteratormode;

public class MyCollection implements CollectionI {
	public String[] string = {"A","B","C","D","E"};  
	@Override
	public IteratorI iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return string[i]; 
	}

	@Override
	public int size() {
		return string.length;
	}

}
