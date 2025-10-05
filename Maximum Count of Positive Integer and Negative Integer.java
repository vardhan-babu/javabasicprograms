class Solution {
    public int maximumCount(int[] nums) {
        int num = 0;
        int nume = 0;
        for(int i :nums){
            if(i!=0&&i>0 ){
                num++;
            }else if(i<0){
                nume++;
            }
        }
        return Math.max(num,nume);
        
    }
}
