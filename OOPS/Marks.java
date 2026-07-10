package OOPS;

public class Marks {
    public static class data{
        String name;
        int rno;
        int[] marks;

        data(int[] s){
            marks = s;
            System.out.println(marks[0]);
            for(int i = 0;i<s.length;i++){
                System.out.print(marks[i] + " ");

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,6};
        data s1 = new data(arr);
        s1.marks[0] = 25;
        System.out.println(arr[0]);


    }
}
