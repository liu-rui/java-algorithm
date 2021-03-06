package liurui.v4.searchs;

import liurui.defines.searchs.MoreThanHalf;

/**
 * 查找数组中出现次数超过一半的数
 * 思路:
 * 1. 如果使用排序，由于次数超过一半，中间的数就是结果，但是性能受到
 * 排序的影响，时间复杂度最多也就是O(NlogN)
 * 2. 使用散列表的话，时间复杂度为O(N),但是空间复杂度为O(N)
 * <p>
 * 是有还有更好的方法？
 */
public class MoreThanHalfImpl implements MoreThanHalf {
    /**
     * 查找数组中出现次数超过一半的数
     *
     * @param ary 数组
     * @return 数组中出现次数超过一半的数
     */
    @Override
    public int find(int[] ary) {
        int num = ary[0];
        int count = 0;

        for (int item : ary) {
            if (num == item) {
                count++;
            } else {
                count--;

                if (count == 0) {
                    num = item;
                    count = 1;
                }
            }
        }
        return num;
    }
}
