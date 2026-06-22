class Solution {
    public int[] twoSum(int[] nums, int target) { 
	
      Map<Integer , Integer > myMap = new HashMap<>() ; 
      for(int i = 0 ; i<nums.length ; i++ ) { 
        int count = target - nums[i]; 
         if(myMap.containsKey(count )) { 
             return new int[]{myMap.get(count),i}  ; 
         } else { 
            myMap.put(nums[i], i) ; } 
      }   
      throw new IllegalArgumentException("no match found") ; 
    }
//  Map<Integer , Integer> myMap = new HashMap<>() ; 
// 	 for(int i = 0  ; i < nums.length ; i++ ){  
// 	    int count = target - nums[i] ; 
// 		if (  myMap.containsKey(count) ) { 
// return new int[]{myMap.get(count) , i } ;
// 		} else { 
// 		myMap.put(nums[i] , i) ; 
// 		}
// 	    }  
// 	 throw new IllegalArgumentException("no match found")  ; 
	//  }  
	 } 
    