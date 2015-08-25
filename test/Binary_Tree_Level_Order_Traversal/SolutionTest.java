package Binary_Tree_Level_Order_Traversal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Binary_Tree_Level_Order_Traversal.Solution;
import Util.*;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test() {
		TreeNode headNode = TreeNodeUtil.GetTree(new int[]{3,9,20,-1,-1,15,7});
		solution.levelOrder(headNode);
	}

}
