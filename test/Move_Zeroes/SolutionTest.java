/**   
* @Title: SolutionTest.java 
* @Package: Move_Zeroes 
* @Description: TODO
* @author yao_wang 
* @date 2015年11月10日 上午9:30:59 
* @version V1.0   
*/
package Move_Zeroes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import TenTo4bit36.solution;

/** 
 * @ClassName: SolutionTest 
 * @Description: TODO
 * @author yao_wang
 * @date 2015年11月10日
 *  
 */
public class SolutionTest {
	
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] a = {0, 1, 0, 3, 12};
		solution.moveZeroes(a);
		Assert.assertArrayEquals(a, new int[]{1,3,12,0,0});
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		int[] a = {0, 1, 0, 3, 12,4534,1,0,0};
		solution.moveZeroes(a);
		Assert.assertArrayEquals(a, new int[]{1,3,12,4534,1,0,0,0,0});
		//fail("Not yet implemented");
	}

}
