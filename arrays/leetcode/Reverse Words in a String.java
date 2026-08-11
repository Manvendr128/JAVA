class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int n = arr.length;
        int f = 0;
        int l = arr.length-1;
        while(f<l){
            String temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        } 
        s = String.join(" ",arr);
        return s;
    }
}
