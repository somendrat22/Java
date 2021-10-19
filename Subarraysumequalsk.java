class Subarraysumequalsk {
    public int subarraySum(int[] nums, int k) {
        int [] psum = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(i == 0){
                psum[i] = nums[i];
            }else{
                psum[i] = psum[i-1] + nums[i];
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int ans = 0;
        for(int j = 0; j<nums.length; j++){
            int temp = psum[j] - k;
            if(map.containsKey(temp)){
                ans += map.get(temp);
            }
            map.put(psum[j], map.getOrDefault(psum[j], 0) + 1);
        }
        return ans;
    }
}