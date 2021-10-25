//Justin Butler 10/25/2021
class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        HashSet<List<Integer>> tuple = new HashSet<>(); // holds all tuples in ascending order.
        HashMap<Integer, Integer> hm = new HashMap<>(); //stores all nums
        for(int i = 0; i < nums.length; i++)
        {
            hm.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(i != j)
                {
                    int sum = nums[i]+nums[j];
                    if(hm.containsKey(-sum))
                    {
                        int value = hm.get(-sum);
                        if(i!=value && j!=value)
                        {
                            if(nums[value] >= nums[i]&& nums[i] >= nums[j]) 
                            {
                                List<Integer> curr = new ArrayList<>();
                                curr.add(nums[value]);
                                curr.add(nums[j]);
                                curr.add(nums[i]);
                                tuple.add(curr);
                            }

                        }
                    }
                }
            }
        }
        List<List<Integer>> output = new ArrayList(tuple);
        return output;
    }
        
        
    }
