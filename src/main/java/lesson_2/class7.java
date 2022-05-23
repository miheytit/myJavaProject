package lesson_2;

public class class7{
        public static void main(String[] args) {
            massiv();
        }
        public static void massiv(){
            int[] arr = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
            for(int i = 0; i< arr.length; i++)
                if(arr[i]<6){
                    arr[i]*=2;
                }
        }
}
