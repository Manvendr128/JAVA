//class Solution {
//    public void mergeSort(int arr[], int l, int r) {
//        mergesorting(arr);
//    }
//    public void mergesorting(int arr[]){
//        int n = arr.length;
//        if(n==1) return;
//        int[] a = new int[n/2];
//        int[] b = new int[n-(n/2)];
//        int k = 0;
//        for(int i = 0;i<a.length;i++){
//            a[i] = arr[k++];
//        }
//        for(int i = 0;i<b.length;i++){
//            b[i] = arr[k++];
//        }
//        mergesorting(a);
//        mergesorting(b);
//        merge(a,b,arr);
//    }
//    public void merge(int[] a,int[] b,int[] arr){
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while(i<a.length && j<b.length){
//            if(a[i]<=b[j]){
//                arr[k++] = a[i++];
//            }
//            else{
//                arr[k++] = b[j++];
//            }
//        }
//        while(i<a.length){
//            arr[k++] = a[i++];
//        }
//        while(j<b.length){
//            arr[k++] = b[j++];
//        }
//    }
//}
