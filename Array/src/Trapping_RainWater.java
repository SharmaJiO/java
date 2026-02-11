import java.util.*;
public class Trapping_RainWater {

    public static int trappedRainwater(int height[]){
        //Calculate left max boundary
        int leftMax[] = new int [height.length];
        leftMax[0]=height[0];
        for(int i = 1; i<height.length ;i++ ){
            leftMax[i]=Math.max(height[i] , leftMax[i-1]);
        }

        //calculate right max boundary
        int RightMax[]=new int [height.length];
        RightMax[height.length-1]=height[height.length-1];
        for(int j = height.length-2 ; j>= 0 ; j--){
            RightMax[j]=Math.max(height[j],RightMax[j+1]);
        }

        int T_w = 0 ;
        for(int i = 0 ; i<height.length ; i++){
            int water_level = Math.min(leftMax[i] , RightMax[i]);
            T_w += water_level - height[i];
        }
        return T_w ;
    }
    public static void main(String [] args){
        int height[] = {4 , 2 , 0 , 6 , 3 , 2 , 5};
        System.out.println("The trapped water is "+trappedRainwater(height));
    }
}
