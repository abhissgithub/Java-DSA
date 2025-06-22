package SORTING;

public class MERGESORTINGG {
    static void print1d(int [] arr){
        for (int value:arr){
            System.out.print(value +" ");
        }
    }
    static void mergosort(int [] arr, int l, int r){
        if (l>=r) return;
        int n=arr.length;
        int mid=(l+r)/2;
        mergosort(arr,l,mid);
        mergosort(arr,mid+1,r);
        merge(arr,l, mid, r);
    }
    static void merge(int [] arr,int l, int mid, int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int [] left=new int[n1];
        int [] right=new int[n2];
        int i,j,k;
        for ( i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for (j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2){
            if (left[i]<right[j])
                arr[k++]=left[i++];
            else arr[k++]=right[j++];
        }
        while (i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }

    }

    public static void main(String[] args) {
        int [] arr={5,3,7,1,2,8};
        int n=arr.length;
        System.out.println("Array before");
        print1d(arr);
        System.out.println();
        mergosort(arr,0,n-1);
        System.out.println("array after sorting");
        print1d(arr);


    }
}
