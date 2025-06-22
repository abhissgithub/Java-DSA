package SORTING;

public class MERGESORT {
    static void print1darray(int [] arr){
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
    static void Mergesort(int [] arr,int l,int r){
        if (l>=r) return;
        int n=arr.length;
        int mid=(l+r)/2;
        Mergesort(arr,l,mid);
        Mergesort(arr,mid+1, r);
        Merge(arr,l,mid,r);


    }
    static void Merge(int [] arr,int l,int mid,int r) {          // 1 2 3 4 5 6
                                                                //  0 1 2|3 4 5
                                                               //   l    mid  r
        int n1=mid-l+1;
        int n2=r-mid;
        int [] left = new int[n1];
        int [] right = new int[n2];
        int i,j,k;
        for (i=0;i<n1;i++) {  //for left array
            left[i] = arr[l + i];
        }
        for ( j=0;j<n2;j++) {
            right[j] = arr[mid + 1 + j];
        }
        i=0;
        j=0;
        k=l;
        while (i<n1 && j<n2){
            if (left[i]<right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }
            else arr[k++]=right[j++];  // its just like arr[k]=arr[j]; k++; j++;
        }
        // if any left/right array is finished then there is no comparison, so we add remaining array in original array4
        while (i<n1){
            arr[k++]=left[i++];

        }
        while (j<n2){
            arr[k++]=right[j++];
        }


    }

    public static void main(String[] args) {
        int [] arr={5,7,6,9,4,5};
        int n=arr.length;
        System.out.println("Array before sorting");
        print1darray(arr);
        System.out.println();
        System.out.println("Array after sorting");
        Mergesort(arr,0,n-1);
        print1darray(arr);

    }

}
