package com.company.ArraySorting.SelectionSort;

public class SelectionSort {
    public static void main(String[] args){
        int a[] = {20,26,45,89,97,63,2,0,4,56};
        int c,temp=0;
        for(int i=0;i<a.length;i++){
            c=i;
            for(int j=i+1;j<a.length;j++){
                if(a[c]>a[j]){
                    c=j;
                }
            }
            temp=a[i];
            a[i]=a[c];
            a[c]=temp;

        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
