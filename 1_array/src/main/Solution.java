package main;

class Solution {
    // 704 二分查找
    public static int search(int[] nums, int target) {
        // 如果目标不在nums区域内，返回-1
        if(target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    // 27 移除元素
    public static int removeElement(int[] nums, int val) {
        // 暴力解法：两层for循环，一个for循环遍历数组元素 ，第二个for循环更新数组
//        int numsLength = nums.length;
//        for(int i = 0; i < numsLength; i++) {
//            if(nums[i] == val) {
//                for(int j = i + 1; j < numsLength; j++) {
//                    nums[j - 1] = nums[j];
//                }
//                i = i - 1;
//                numsLength = numsLength - 1;
//            }
//        }
//        return numsLength;

        /* 快慢指针法：慢指针相当于新的数组下标，当一个与val不一样的数字出现，加一
         * 快指针为旧的数组下标，每次判断使用
         */
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if(nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    // 977 有序数组的平方
    public static int[] sortedSquares(int[] nums) {
        //笨蛋暴力法，先平方，然后对平方后的数组用冒泡排序
//        int size = nums.length;
//        for(int i = 0; i < size; i++) {
//            nums[i] *= nums[i];
//        }
//        for(int i = 0; i < size; i++) {
//            for(int j = 0; j < size - i - 1; j++) {
//                if(nums[j] > nums[j + 1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }
//        return nums;

        //双指针法
        int i = 0;
        int j = nums.length - 1;
        int[] newNums = new int[nums.length];//新的数组
        int pos = nums.length - 1;
        while (i <= j) {
            if(Math.abs(nums[i]) > Math.abs(nums[j])) {
                newNums[pos] = nums[i] * nums[i];
                pos--;
                i++;
            } else {
                newNums[pos] = nums[j] * nums[j];
                pos--;
                j--;
            }
        }
        return newNums;
    }
}