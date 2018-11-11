package main.java.test;

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        for(int i = 0;i < group;i++){
            int len = sc.nextInt();
            int[] array = new int[len];
            int numberOfOne = 0;
            for(int k = 0;k < len;k++){
                array[k] = sc.nextInt();
                if(array[k] == 1) numberOfOne++;
            }
            QKSort(array,0,len-1);
            for(int k = 0;k<len;k++){
                System.out.println(array[k]);
                if(k == len -1){
                    if(numberOfOne == array[k]){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                }
                if(array[k] > 2){
                    numberOfOne -= array[k] - 2;
                }
            }
        }
    }

    public static void QKSort(int[] in,int low,int high){
        int pos;
        if(low<high){
            pos = QKpass(in,low,high);
            QKSort(in,low,pos-1);
            QKSort(in,pos+1,high);
        }
    }
    public static int QKpass(int[] in,int low,int high){
        int temp = in[low];
        while(low<high){
            while(low<high && in[high]>=temp){
                high--;
            }
            in[low] = in[high];
            while(low<high && in[low]<=temp){
                low++;
            }
            in[high] = in[low];
        }

        in[low] = temp;
        return low;
    }
}