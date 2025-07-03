
// import java.util.Scanner;
public class Index {

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
public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {3, 4, 5, 6};
    System.out.print("Common elements: ");
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                break;
            }
        }
    }
    // here is the main method that finds common elements in two arrays
}
}