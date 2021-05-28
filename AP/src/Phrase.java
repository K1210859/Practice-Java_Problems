public class Phrase {
    private String currentPhrase;
    public Phrase(String p)
    {
        currentPhrase = p;
    }
    public int findNthOccurence(String str, int n)
    {
        return 0;
    }
    public void replaceNthOccurence(String str, int n, String repl)
    {
        int nIndex = findNthOccurence(str,n);
        if(nIndex!=-1)
            currentPhrase = currentPhrase.substring(0,nIndex) + repl + currentPhrase.substring(nIndex+str.length());
    }
    public int findLastOccurence(String str)
    {
        int counter=0;
        for(int i=0;i<currentPhrase.length();i++)
        {
            String s = currentPhrase.substring(i,i+str.length());
            if(s.equals(str))
                counter++;
        }
        if(counter==0)
            return -1;
        else
        {
            return findNthOccurence(str,counter);
        }
    }
    public String toString()
    {
        return currentPhrase;
    }
}
