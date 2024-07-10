class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList <String> li=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                li.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                li.add("Fizz");
            }
            else if(i%5==0)
            {
                li.add("Buzz");
            }
            else
            {
                String k=Integer.toString(i);
                li.add(k);
            }
        }
        return li;
    }
}