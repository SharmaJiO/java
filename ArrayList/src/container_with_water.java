import java.util.ArrayList;

public class container_with_water {
    public static  int maxArea(ArrayList<Integer> height) {

        int left = 0;
        int right = height.size()-1;
        int max = 0;

        while(left < right) {

            int width = right - left;
            int h = Math.min(height.get(right),height.get(left) );
            int area = width * h;

            max = Math.max(max, area);

            if(height.get(right) >height.get(left))
                left++;
            else
                right--;
        }

        return max;
    }
    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
       height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxArea(height));  // Output: 49
    }
}
