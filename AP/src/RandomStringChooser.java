public class RandomStringChooser {
    private String[] array;
    private boolean[] conditions;
    public RandomStringChooser(String[] wordArray)
    {
        conditions = new boolean[array.length];
        array = wordArray;
    }
    public String getNext()
    {
        int count = 0;
        String ans = "";
        for(int i=0;i<conditions.length;i++)
        {
            if(conditions[i]==true)
                count++;
        }
        if(count==conditions.length)
            ans = "NONE";
        else {
            int num = (int) (Math.random() * array.length);
            if(conditions[num]==false) {
                conditions[num] = true;
                ans = array[num];
            }
        }
        return ans;
    }

   /* public RandomLetterChooser(String str)
    {
        super(getSingleLetters(str));
    }*/
}
