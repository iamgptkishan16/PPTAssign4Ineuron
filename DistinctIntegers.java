//[2]---Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*
//
//answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
//answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.
//
//**Note** that the integers in the lists may be returned in **any** order.
//
//**Example 1:**
//
//**Input:** nums1 = [1,2,3], nums2 = [2,4,6]
//
//Output: [[1,3],[4,6]]



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctIntegers {
    public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Add elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Add elements from nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }
        
        List<Integer> distinctNums1 = new ArrayList<>();
        List<Integer> distinctNums2 = new ArrayList<>();
        
        // Check for distinct integers in nums1
        for (int num : nums1) {
            if (!set2.contains(num)) {
                distinctNums1.add(num);
            }
        }
        
        // Check for distinct integers in nums2
        for (int num : nums2) {
            if (!set1.contains(num)) {
                distinctNums2.add(num);
            }
        }
        
        result.add(distinctNums1);
        result.add(distinctNums2);
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result = findDistinctIntegers(nums1, nums2);
        System.out.println("Distinct Integers: " + result);
    }
}
