class Solution {
    public int[] arrayRankTransform(int[] arr) {
   
        int arcopy[]=Arrays.copyOf(arr,arr.length);
             Arrays.sort(arcopy);
        Map<Integer,Integer>rank=new HashMap<>();
        int k=1;
        for(int i=0;i<arcopy.length;i++)
        {
           if(!rank.containsKey(arcopy[i]))
           {
            rank.put(arcopy[i],k);
            k++;
           }
        }
        int array[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            array[i]=rank.get(arr[i]);
        }
        return array;
         
        
    }
}