/*public class CodeWordChecker implements StringChecker{
    int minLimit;
    int maxLimit;
    String cannotContainString;
    public CodeWordChecker(int min, int max, String str)
    {
        minLimit = min;
        maxLimit = max;
        cannotContainString = str;
    }

    public CodeWordChecker(String str)
    {
        minLimit = 6;
        maxLimit = 20;
        cannotContainString = str;
    }

    public boolean isValid(String str)
    {
        if(str.length()>=minLimit && str.length()<=maxLimit && !str.contains(cannotContainString))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}*/
