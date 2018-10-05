package week3;

public class Week3 {

    public static int max(int m, int n) {
        if(m<n) return n;
        else return m;
     
       
    }

    public static int minOfArray(int[] array) {
       
        array  = new int[100];
            int i;
        int min = array[0];
        for(i=0;i<100;i++){
            if(array[i]< min){
                min = array[i];
            }
            
        
    }
        return min;
    }

    public static String calculateBMI(double weight, double height) {
        double BMI = (weight)/(height*height);
        if(BMI<18.5) return "Thiếu cân ";
        else if(18.5<=BMI && BMI<=23) return "Bình thường";
        else if(23<=BMI&& BMI<=24.99) return "Thừa cân";
        else return "Béo phì";
        
            
       
        
    }
}
