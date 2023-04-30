# 1. Two Sum
Given an array of integers ```nums``` and an integer ```target```, return *indices of the two numbers* such that they add up to ```target```.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

## Hash Map
```java
public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int sub = target - nums[i];
            if(map.containsKey(sub)){
                return new int[]{i,map.get(sub)};
            }
            map.put(nums[i], i); // key is the number, value is the index
        }
        throw new IllegalArgumentException("No two sum solution");
    }
```

```elixir
defmodule Solution do
  @spec two_sum(nums :: [integer], target :: integer) :: [integer]
  def two_sum(nums, target) do
    List.foldl(nums |> Enum.with_index(), {%{}, []}, fn {num, i}, {mp, ans} ->
      if mp[target - num] == nil,
        do: {mp |> Map.put(num, i), ans},
        else: {mp, [mp[target - num], i]}
    end)
    |> elem(1)
  end
end
```

TC is O(N). 空间换时间, compare to brute force solution, SC is O(N).

In brute foce solution, you write two for loops to check if the sum equals to the target, which increases TC. However, SC in this solution is O(1).