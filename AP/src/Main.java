import java.util.ArrayList;

public class Main extends LogMessage{
    private static LogMessage fr = new LogMessage("Webserver:disk offline");
    private static String[] array = {"cat", "dog", "hello"};
    private static boolean[] conditions = new boolean[3];
    public Main(String message) {
        super(message);
    }

    public static void main(String[] args) {
        //System.out.println(fr.getMachineId());
        //System.out.println(fr.getDescription());
        /*int num = 289;
        ArrayList<Integer> digitList;
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
        System.out.println(digitList);
        boolean condition=true;
        for(int i=0;i<digitList.size()-1;i++)
        {
            if(digitList.get(i)>=digitList.get(i+1))
            {
                System.out.println(false);
                condition=false;
            }
        }
        if(condition)
            System.out.println(true);
        String currentPhrase = "A cat ate late.";
        int nIndex=3;
        String repl = "rane";
        currentPhrase = currentPhrase.substring(0,nIndex) + repl + currentPhrase.substring(nIndex+2);
        System.out.println(currentPhrase);
        int num = (int) (Math.random() * 3+1);
        System.out.println(num);/*

         */
        System.out.println(yay());
        System.out.println(yay());
        System.out.println(yay());
        System.out.println(yay());
        System.out.println(yay());

    }

    public static String yay() {
        /*int count = 0;
        String ans = "";
        for (int i = 0; i < conditions.length; i++) {
            if (conditions[i] == true)
                count++;
        }
        if (count == conditions.length)
            ans = "NONE";
        else {
            int num = (int) (Math.random() * array.length);
            if (conditions[num] == false) {
                conditions[num] = true;
                ans = array[num];
            }
        }
        return ans;*/
        if(0<0.2)
            System.out.print(true);
        return "Hello";
    }

}
