public class d2array {
    public static void main(String a[]){
        int nums[][]=new int[3][4];
         int nums1[][]=new int[3][];
          nums1[0]=new int[4];
          nums1[1]=new int[5];
          nums1[2]=new int[6];
        // for (int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         nums[i][j]=(int)(Math.random()*100);

        //     } 
           
        //     }
        //      for(int i=0;i<3;i++){
        //         for(int j=0;j<4;j++){
        //             System.out.print(nums[i][j]+" ");
        //         }
        //         System.out.println();
        // } 
    
     for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums1[i].length;j++){
                nums1[i][j]=(int)(Math.random()*100);
            } 
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<nums1[i].length;j++){
                System.out.print(nums1[i][j]+" ");
            }
            System.out.println();
        }
    
    
    
    }
}
