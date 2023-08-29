import java.util.Scanner;
public class dsaArray {
    public static void main(String[] args) {
        // // 5)Rotate elements of matrix by 90 deg clockwise
        //     // Transpose elements then swap right and left columns then display
        // int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // // Transposing elements-Remember to put i=j and the patten formed is like a triangular matrix...
        // // j is not 0 because the swapping is done multiple times in the future
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr[i].length;j++){
        //        int flag1=arr[i][j];
        //         arr[i][j]=arr[j][i];
        //         arr[j][i]=flag1;
        //     }
        // }
        // // Swapping left and right columns
        // for(int i=0;i<arr.length;i++){
        //     int li=0;
        //     int ri=arr.length-1;
        //     while(li<ri){
        //        int flag2=arr[i][li];
        //        arr[i][li]=arr[i][ri];
        //        arr[i][ri]=flag2;
        //        li++;
        //        ri--;
        //     }
        // }
        // // Displaying elements
        // for(int i[]:arr){
        //     for(int j:i){
        //         System.out.println(j);
        //     }
        // }

        // 4)Finding Duplicate Element in an array-Using 2 for loops for checking one element and its next elements
        // int arr[]={1,2,3,4,4,5};
        // int n=arr.length;
        // int flag=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             flag=1;
        //             System.out.println(arr[i]);
        //         }
        //     }
        // }
        // if(flag==0){
        //     System.out.println("No Duplicate");
        // }
        

        // 3)Finding missing number in array-Using sum of first n natural numbers and deviation from actual sum
        // int arr[]={1,2,4,5,6};
        // int n=arr.length+1;
        // int expectedSum=n*(n+1)/2;
        // int sum=0;
        // for(int i:arr){
        //     sum+=i;
        // }
        // int diff=expectedSum-sum;
        // System.out.println(diff);


        // 2)Reversing an Array-Using middle term and swapping
        // char alp[]={'a','b','c','d','e'};
        // for(int i=0;i<alp.length/2;i++){
        //     char temp=alp[i];
        //     alp[i]=alp[alp.length-1-i];
        //     alp[alp.length-1-i]=temp;
        // }
        // for(char ch:alp){
        //     System.out.println(ch);
        // }

        // 1)Palindrome Problem in array-Using middle term and checking left and right values
        // int arr[]={1,2,2,1};
        // int flag=0;
        // for(int i=0;i<arr.length/2;i++){
        //     if(arr[i]!=arr[arr.length-1-i]){
        //         flag=1;
        //         System.out.println("Not a Palindrome");
        //         break;
        //     }
        // }
        // if(flag==0){
        //     System.out.println("A palindrome");
        // }
        }
}

