import java.util.ArrayList;
import java.util.List;

public class SystemLog extends LogMessage{
    private List<LogMessage> messageList;

    public SystemLog(String message) {
        super(message);
    }

    public List<LogMessage> removeMessages(String keyword)
    {
        List<LogMessage> removedList = new ArrayList<LogMessage>();
        for(int i=0;i<messageList.size();i++)
        {
            LogMessage message = messageList.get(i);
            if(message.containsWord(keyword))
            {
                removedList.add(message);
                messageList.remove(i);
                i--;
            }
        }
        return removedList;
    }
}
