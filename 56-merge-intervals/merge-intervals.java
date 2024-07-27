class Solution {
    public int[][] merge(int[][] in) {
       // ArrayList<int[][]>arr=new ArrayList<>();
        Arrays.sort(in,(a,b)-> Integer.compare(a[0],b[0]));
        int x=0;
        int pre[][]=new int[in.length][2];
        //arr.add(pre[0])
        pre[x][0]=in[x][0];
        pre[x][1] = in[0][1];
        for(int i=1;i<in.length;i++){

            if(in[i][0]<=pre[x][1]){
                //int min=Math.min(pre[0][0],in[i][0]);
                int max=Math.max(pre[x][1],in[i][1]);
               // pre[0][0]=min;
                pre[x][1]=max;
            }else{
                x++;
                pre[x][0]=in[i][0];
                pre[x][1]=in[i][1];
            }
        }
        
        return Arrays.copyOf(pre,x+1);
       }
    
}
