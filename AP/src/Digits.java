import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        String number = ""+num;
        for(int i=0;i<number.length()-1;i++)
        {
            String s = number.substring(i,i+1);
            int numDigit = Integer.parseInt(s);
            digitList.add(numDigit);
        }
        String last = number.substring(number.length()-1);
        int lastDigit = Integer.parseInt(last);
        digitList.add(lastDigit);
    }
    public boolean isStrictlyIncreasing()
    {
        for(int i=0;i<digitList.size()-1;i++)
        {
            if(digitList.get(i)>=digitList.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}
