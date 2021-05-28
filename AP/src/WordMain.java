public class WordMain extends WordPairList {
    private static WordPairList fr = new WordPairList(new String[]{"one", "two", "three"});

    public WordMain(String[] message) {
        super(message);
    }

    public static void main(String[] args)
    {
        System.out.println(fr.getPair());
        //System.out.println(fr.getDescription());
    }
}
