public class LogMessage {
    String machineId = "";
    String description = "";
    public LogMessage(String message)
    {
        String[] array = message.split(":");
        machineId = array[0];
        description = array[1];
    }
    public boolean containsWord(String keyword)
    {
        String[] arr = description.split(" ");
        boolean preceding = false;
        boolean following = false;
        for(String word:arr)
        {
            if(word.startsWith(keyword))
                preceding=true;
            if(word.endsWith(keyword))
                following=true;
        }
        if(description.contains(keyword) && (description.startsWith(keyword) || preceding==true) && (description.endsWith(keyword) || following==true))
            return true;
        else
            return false;
    }
    public String getMachineId()
    {
        return machineId;
    }
    public String getDescription()
    {
        return description;
    }

}
