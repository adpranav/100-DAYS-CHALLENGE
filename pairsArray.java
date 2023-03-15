public class pairsArray {
    public static void pairsArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }

    // public static void printAllPair(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr.length;j++){
    //             System.out.println(arr[i]+" "+arr[j]);
    //         }
    //     }
    // }

    public static void main(String[] args) {
        int[]array = new int[]{10,20,30,40,60,70};
        pairsArr(array);
    }
}
