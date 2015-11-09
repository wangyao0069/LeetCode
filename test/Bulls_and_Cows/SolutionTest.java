/**   
* @Title: SolutionTest.java 
* @Package: Bulls_and_Cows 
* @Description: TODO
* @author yao_wang 
* @date 2015-11-9 11:30:17 
* @version V1.0   
*/
package Bulls_and_Cows;

import static org.junit.Assert.*;

import org.junit.Test;

import TenTo4bit36.solution;

/** 
 * @ClassName: SolutionTest 
 * @Description: TODO
 * @author yao_wang
 * @date 2015-11-9
 *  
 */
public class SolutionTest {

	Solution solution = new Solution();
	/**
	 * Test method for {@link Bulls_and_Cows.Solution#getHint(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetHint1() {
		String ret = solution.getHint("1807", "7801");
		System.out.println(ret);
	}
	
	@Test
	public void testGetHint2() {
		String ret = solution.getHint("1123", "0111");
		System.out.println(ret);
	}

}
