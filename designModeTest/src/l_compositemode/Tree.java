package l_compositemode;

public class Tree {
	
	private String name = "";
	private TreeNode root = null;
	public Tree(String name){
		this.name = name;
		root = new TreeNode(name);  
	}
	
	public static void main(String[] args) {
		 Tree tree = new Tree("tree"); 
		 TreeNode b = new TreeNode("b");
		 TreeNode c = new TreeNode("c");
		 b.addChildren(c);
		 tree.root.addChildren(b);
		 System.out.println("build the tree "+ 
		 tree.name +" finished!");  
	}

}
