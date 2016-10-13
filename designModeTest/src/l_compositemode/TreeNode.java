package l_compositemode;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();

	public TreeNode(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setChildren(Vector<TreeNode> children) {
		this.children = children;
	}

	/** 增加孩子节点 */
	public boolean addChildren(TreeNode NODE) {
		return children.add(NODE);
	}

	/** 删除孩子节点 */
	public boolean removeChildren(TreeNode NODE) {
		return children.remove(NODE);
	}

	/** 取得孩子节点 */
	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}

}
