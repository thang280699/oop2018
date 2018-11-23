
package week11;


public class Task1 {
    public static <T extends Comparable> void sx(T[] a){
        T x;
        int n= a.length;
        for (int i = 0;i<n-1;i++) {
            for(int y=0;y<n - i -1;y++){
                if(a[y].compareTo(a[y+1])>0){
                    x = a[y];
                    a[y] = a[y+1];
                    a[y+1] = x;
                    
                }
            
            }
        }
        for(int y=0;y<n;y++){
            
            System.out.println(a[y]+" ");
        }
    }

    public static void main(String[] args) {
   Byte[] a = { 5,6,7,8};
   Task1 t = new Task1();
   t.sx(a);
   
           
    }
    
}
