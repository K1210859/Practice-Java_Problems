import java.util.List;

public class StringFormatter {
    public static int totalLetters(List<String> wordList)
    {
        int count=0;
        for(int i=0;i<wordList.size();i++)
        {
            String word = wordList.get(i);
            for(int x=0;x<word.length();x++)
            {
                count++;
            }
        }
        return count;
    }
    public static int basicGapWidth(List<String> wordList, int formattedLen)
    {
        int spacing = formattedLen-totalLetters(wordList);
        int numGaps = wordList.size()-1;
        int basicWidth = spacing/numGaps;
        return basicWidth;
    }
    public static int leftoverSpaces(List<String> wordList, int formattedLen)
    {
        return 0;
    }
    public static String format(List<String> wordList, int formattedLen)
    {
        int letterCount = totalLetters(wordList);
        int basicWid = basicGapWidth(wordList,formattedLen);
        int remainingSpace = leftoverSpaces(wordList,formattedLen);
        String answer = "";
        for(int i=0;i<wordList.size()-1;i++)
        {
            answer+=wordList.get(i);
            for(int x=0;x<basicWid;x++)
            {
                answer+=" ";
            }
            if(remainingSpace>0)
            {
                answer+=" ";
                remainingSpace--;
            }
        }
        answer+=wordList.get(wordList.size()-1);
        return answer;
    }
}
