public class reverseArray {
    public static void reverseArr(int arr[]){
        int li=0;
        int hi=arr.length-1;

        while(hi>li){
            int temp = arr[li];
            arr[li]=arr[hi];
            arr[hi] = temp;
            li++;
            hi--;
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{10,20,30,40};
        reverseArr(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
