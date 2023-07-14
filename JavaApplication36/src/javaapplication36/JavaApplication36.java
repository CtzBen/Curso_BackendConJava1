/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.util.Arrays;

/**
 *
 * @author Costanzo
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         int arr[] = {1,2,3,4};
//        
//        int difference = 1;
//        int lS = 0;
//        Arrays.sort(arr);
//        int whereCheck = 0;
//        if (difference >= 0){
//            for (int i = 0; i > arr.length - 2; i++){
//                if ((arr[i+1]-arr[i-whereCheck]) == difference){
//                    System.out.println((arr[i+1]-arr[i-whereCheck]));
//                    lS += 1;
//                }else{
//                    System.out.println((arr[i+1]-arr[i-whereCheck]));
//                    whereCheck += 1;
//                }
//            }
//        }else{
//            for (int i = arr.length - 1; i > 0 + 1; i--){
//                if (arr[i-1] - arr[i+whereCheck] == difference){
//                    lS += 1;
//                }else{
//                    whereCheck += 1;
//                }
//            }
//        }
//        System.out.println(lS);
 int arr[] = {1,5,7,8,5,3,4,2,1};
        int difference = -2;
        int lS = 1;
        Arrays.sort(arr);
        int whereCheck = 0;
        
        if (difference >= 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                if ((arr[i + 1] - arr[i - whereCheck]) == difference) {
                    lS += 1;
                } else {
                    whereCheck += 1;
                }
            }
        } else {
            for (int i = arr.length-1; i > 0; i--) {
                if (arr[i - 1] - arr[i + whereCheck] == difference) {
                    lS += 1;
                } else {
                    whereCheck += 1;
                }
            }
        }
        
        System.out.println(lS);
    
    }
    
}
