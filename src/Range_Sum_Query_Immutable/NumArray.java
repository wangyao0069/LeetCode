/**   
* @Title: NumArray.java 
* @Package: Range_Sum_Query_Immutable 
* @Description: TODO
* @author yao_wang 
* @date 2015年11月10日 下午4:53:05 
* @version V1.0   
*/
package Range_Sum_Query_Immutable;

/** 
 * @ClassName: NumArray 
 * @Description: TODO
 * @author yao_wang
 * @date 2015年11月10日
 *  
 */
public class NumArray {
    
    private int[] nums = null;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int index = i; index<=j; index++) {
            sum += nums[index];
        }
        
        return sum;
    }
}
