/**   
* @Title: NumArrayTest.java 
* @Package: Range_Sum_Query_Immutable 
* @Description: TODO
* @author yao_wang 
* @date 2015年11月10日 下午4:53:28 
* @version V1.0   
*/
package Range_Sum_Query_Immutable;


import org.junit.Assert;
import org.junit.Test;

/** 
 * @ClassName: NumArrayTest 
 * @Description: TODO
 * @author yao_wang
 * @date 2015年11月10日
 *  
 */
public class NumArrayTest {

	@Test
	public void test1() {
		
		NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
		Assert.assertEquals(1, numArray.sumRange(0, 2));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		
		NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
		Assert.assertEquals(-1, numArray.sumRange(2, 5));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		
		NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
		Assert.assertEquals(-3, numArray.sumRange(0, 5));
		//fail("Not yet implemented");
	}

}
