package Path_Sum_II;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Path_Sum_II.Solution;
import Util.*;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test() {

	}

	@Test
	public void test1() {
		TreeNode root = TreeNodeUtil.GetTree(new int[] { 5, 4, 8, 11, -1, 13,
				4, 7, 2, -1, -1, -1, -1, 5, 1 });
		solution.pathSum(root, 22);
	}

}
