public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int rp = height.length-1;
        int lp = 0;

        while(lp < rp){
            int level = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int currWater = level * width;
            maxWater = Math.max(maxWater, currWater);

            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String args[]){
        int arr[] = {2,3,4,5,18,17,6};
        System.out.println(maxArea(arr));
    }
}
