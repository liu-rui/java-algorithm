package liurui.templates.structures.array;

import liurui.defines.structures.array.DutchFlag;

/**
 * 荷兰国旗问题：
 * 现有红、白、蓝三个不同颜色的小球，乱序
 * 排列在一起，请重新排列这些小球，使得红
 * 白蓝三色的同颜色的球在一起。
 * <p>
 * 问题转换为：给定数组A[0…N-1]，元素只能取0、
 * 1、2三个值，设计算法，使得数组排列成
 * “00…0011…1122…22”的形式。
 * <p>
 * 说白了就是将有0,1,2三个数组成的数组按照升序排列
 * 如果使用快速排序可以达到O(nlogn),还有更好的算法吗?
 */
public class DutchFlagImpl implements DutchFlag {

    /**
     * 荷兰国旗问题
     *
     * @param ary 原数组
     * @return 排序后的数组
     */
    @Override
    public int[] sort(int[] ary) {
        return new int[0];
    }
}
