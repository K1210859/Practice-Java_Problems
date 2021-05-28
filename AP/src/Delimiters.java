import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> array = new ArrayList<String>();
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals(openDel) || tokens[i].equals(closeDel))
                array.add(tokens[i]);
        }
        return array;
    }
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int openCount = 0;
        int closeCount = 0;
        for(int i=0;i<delimiters.size();i++)
        {
            if(delimiters.get(i).equals(openDel))
                openCount++;
            else if(delimiters.get(i).equals(closeDel))
                closeCount++;
            if(closeCount>openCount)
                return false;
        }
        if(closeCount==openCount)
            return true;
        else
            return false;
    }
}
