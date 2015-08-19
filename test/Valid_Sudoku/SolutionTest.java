package Valid_Sudoku;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Valid_Sudoku.Solution;

public class SolutionTest {

	private Solution solution;

	@Before
	public void before() {
		solution = new Solution();
	}

	@Test
	public void test() {
		boolean ret = solution.isValidSudoku(new char[][] {
				".87654321".toCharArray(), "2........".toCharArray(),
				"3........".toCharArray(), "4........".toCharArray(),
				"5........".toCharArray(), "6........".toCharArray(),
				"7........".toCharArray(), "8........".toCharArray(),
				"9........".toCharArray() });
	}

}
