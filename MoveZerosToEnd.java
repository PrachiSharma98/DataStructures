public class Array1 {
    public static void main(String[] args) {
        int a[] = {1, 0, 0, 4};
        array(a);
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]);
       }
    }
    public static int[] array(int[] a) {

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j++] = a[i];
            }
        }
        while (j < a.length) {
            a[j++] = 0;
        }

return a;
    }


}
Time-o(n)
Space-o(1)
