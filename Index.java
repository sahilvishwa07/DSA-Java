// import java.util.Scanner;

// import java.util.HashMap;
// import java.util.Map;

// import java.util.HashMap;

// import java.util.Arrays;

public class Index {

    // 1 D Array
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4,5,7,8,9, 5};
    //     int max=arr[0];
    //     for(int i = 0; i < arr.length; i++) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }
    //     System.out.println(max);
    // }
    // public static void main(String[] args) {
    //     Scanner in=new Scanner(System.in);
    //     System.out.println("Enter the size of the array:");
    //     int n = in.nextInt();
    //     int[] arr = new int[n];
    //     for (int i=0; i<n; i++){
    //         arr[i] = in.nextInt();   
    //     }
    //     for(int k=0; k<n; k++){
    //         System.out.println(arr [k] + " " + "element");
    //     }
    // }
    // public void Max(){
    //     System.out.println("hello ");
    // }
    // public static void main(String[] args) {
    //     index myobj = new index();
    //     myobj.Max();
    // }
    // public static void main(String[] args) {
    //     int[] arr1 = {1, 2, 3, 4};
    //     int[] arr2 = {3, 4, 5, 6};
    //     System.out.print("Common elements: ");
    //     for (int i = 0; i < arr1.length; i++) {
    //         for (int j = 0; j < arr2.length; j++) {
    //             if (arr1[i] == arr2[j]) {
    //                 System.out.print(arr1[i] + " ");
    //                 break;
    //             }
    //         }
    //     }
    
    // }
    // 2 D Array
    // public static void main(String[] args) {
    //     int[][] arr = {
    //         {1, 2, 3},{4, 5, 6},{7, 8, 9}
    //     };

    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[i].length; j++) {
    //             System.out.print(arr[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // TreeSet<Integer> set = new TreeSet<>();

    // public static void main(String[] args) {
    //     Index index = new Index();
    //     index.set.add(1);
    //     index.set.add(2);
    //     index.set.add(3);
    //     index.set.add(4);
    //     index.set.add(5);
    //     index.set.add(5);
    //     System.out.println("Set: " + index.set);
    // }
    // public static void main(String[] args) {
    //     String input = "hello";
    //     Map<Character, Integer> map = new HashMap<>();

    //     for (char ch : input.toCharArray()) {
    //         if (ch != ' ') {
    //             map.put(ch, map.getOrDefault(ch, 0) + 1);
    //         }
    //     }

    //     System.out.println(map);
    // }

   
    // public int[] twoSum(int[] nums, int target) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         int complement = target - nums[i];
    //         if (map.containsKey(complement)) {
    //             return new int[] { map.get(complement), i };
    //         }
    //         map.put(nums[i], i);
    //     }
    //     return new int[0];
    // }

    // public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int[] arr1 = {1, 2, 3, 4};
    //     int[] arr2 = {3, 4, 5, 6};
    //     System.out.print("Merged Array: ");
    //     int[] merged = new int[arr1.length + arr2.length];
    //     for (int i = 0; i < arr1.length; i++) {
    //         merged[i] = arr1[i];
    //     }
    //     for (int i = 0; i < arr2.length; i++) {
    //         merged[arr1.length + i] = arr2[i];
    //     }
    //     for (int num : merged) {
    //         System.out.print(num + " ");
    //     }
    //     Arrays.sort(merged);
    //     System.out.println();
    //     int n = merged.length;
    //     if (n % 2 == 0) {
    //         return (merged[(n - 1) / 2] + merged[n / 2]) / 2.0;
            
    //     } else {
    //         return merged[n / 2];
    //     }
    // }

    // public static void main(String[] args) {
    //     double median = findMedianSortedArrays(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 6});
    //     System.out.println("Median: " + median);
    // }
    
}



