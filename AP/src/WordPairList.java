import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<WordPair>();
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                WordPair wordsss = new WordPair(words[i],words[j]);
                allPairs.add(wordsss);
            }
        }
    }
    public ArrayList<WordPair> getPair()
    {
        return allPairs;
    }
    public int numMatches()
    {
        int count = 0;
        for(int i=0;i<allPairs.size();i++)
        {
            WordPair yay = allPairs.get(i);
            if(yay.getFirst().equals(yay.getSecond()))
            {
                count++;
            }
        }
        return count;
    }
}
