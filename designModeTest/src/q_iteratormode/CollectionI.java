package q_iteratormode;

public interface CollectionI {
	
	public IteratorI iterator();

	/* 取得集合元素 */
	public Object get(int i);

	/* 取得集合大小 */
	public int size();

}
