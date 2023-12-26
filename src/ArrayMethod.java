//returning array from method
public class ArrayMethod {
    static int[] get()
    {
        return new int[]{23,12,45,33,67,89,};
    }

    public static void main(String[] args) {
        int []arr=get();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
