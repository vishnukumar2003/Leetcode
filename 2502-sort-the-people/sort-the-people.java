class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int[] copyArray = Arrays.copyOf(heights, heights.length);
        int[] arr1=new int[heights.length];
        String[] str=new String[heights.length];
        int index=0;
        int strindex=0;
        Arrays.sort(heights);
        for(int i=heights.length-1;i>=0;i--){
            arr1[index++]=heights[i];
        }
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights.length;j++){
                if(arr1[i]==copyArray[j]){
                    str[strindex++]=names[j];
                    break;
                }
            }
        }
        return str;
        
    }
}