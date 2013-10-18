package treeSorting;

import org.bigmikef.treeSorting.MikeSolution;
import org.bigmikef.treeSorting.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class BreadthFirstSearchTest {

	private TreeNode root;
	
	@Before
	public void setup() {
		TreeNode treeS = new TreeNode("s", null, null);
        TreeNode treeR = new TreeNode("r", null, null);
        TreeNode treeQ = new TreeNode("q", null, null);
        TreeNode treeP = new TreeNode("p", null, null);
        TreeNode treeO = new TreeNode("o", null, null);
        TreeNode treeN = new TreeNode("n", treeR, treeS);
        TreeNode treeM = new TreeNode("m", null, null);
        TreeNode treeL = new TreeNode("l", null, null);
        TreeNode treeK = new TreeNode("k", null, null);
        TreeNode treeJ = new TreeNode("j", null, null);
        TreeNode treeI = new TreeNode("i", treeP, treeQ);
        TreeNode treeH = new TreeNode("h", null, null);
        TreeNode treeG = new TreeNode("g", treeN, treeO);
        TreeNode treeF = new TreeNode("f", treeL, treeM);
        TreeNode treeE = new TreeNode("e", treeJ, treeK);
        TreeNode treeD = new TreeNode("d", treeH, treeI);
        TreeNode treeC = new TreeNode("c", treeF, treeG);
        TreeNode treeB = new TreeNode("b", treeD, treeE);
        root = new TreeNode("a", treeB, treeC);
	}
	
	@Test
	public void testMike() {
		MikeSolution.breadthFirstSearch(root);
	}
}
