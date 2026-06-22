class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         
         // create a map to get frequency 
          // then a priority queue implementation 
          //to  prioritize the highest frequency
          // then filter the top k frequencies 

          Map<Integer, Integer > hashmp = new HashMap<>() ; 

          for(int i : nums ) { 
            hashmp.put( i , hashmp.getOrDefault(i,0) + 1  ) ; 
          }

          PriorityQueue<Map.Entry<Integer , Integer >> pq = 
          new PriorityQueue<>((a, b) -> b.getValue() - a.getValue() )  ;  
          
          for(Map.Entry<Integer , Integer> entry : hashmp.entrySet() ) {  
             pq.add(entry)  ; 
          }
          int[] res = new int[k] ;
          for(int i = 0 ; i< k ; i++ ) { 
            res[i] = pq.poll().getKey() ; 
          }
          return res ; 
    }
}
