package Algorithm;

import java.util.Arrays;
//
public class Test1 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7,9};
        int[] nums2 = {2,4,6,8,10};
        merge1(nums1, nums1.length,nums2, nums2.length);
    }
    //直接合并
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        //将nums2里面的值都放置在nums1中然后再进行排序
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        Arrays.toString(nums1);
    }
}
