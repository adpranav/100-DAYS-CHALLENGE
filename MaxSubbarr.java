public class MaxSubbarr {
    public static int MaxSubbArray(int arr[]){
        int InterArr=0;
        int LargeArr=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                InterArr = 0;
                for(int k=i;k<=j;k++){
                    InterArr=InterArr+arr[k];
                }
                if(InterArr>LargeArr){
                    LargeArr = InterArr;
                }
            }
        }
        return LargeArr; 
    }   

    public static void main(String[] args) {
        int [] arr = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};

        int a = MaxSubbArray(arr);
        System.out.println(a);
    }
}



