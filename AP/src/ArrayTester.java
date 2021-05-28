public class ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c)
    {
        int[] answer = new int[arr2D[0].length];
        for(int i=0;i<arr2D[0].length;i++)
        {
            answer[i] = arr2D[i][c];
        }
        return answer;
    }
    public static boolean hasAllValues(int[] arr1, int[] arr2)
    {
        return true;
    }
    public static boolean containsDuplicates (int[] arr)
    {
        return true;
    }
    public static boolean isLatin(int[][] square)
    {

        if(containsDuplicates(square[0]))
        {
            return false;
        }
        for(int i=1;i<square.length;i++)
        {
            if(!hasAllValues(square[0],square[i]))
                return false;
        }
        for(int i=0;i<square[0].length;i++)
        {
            int[] col = getColumn(square,i);
            if(!hasAllValues(square[0],col))
                return false;
        }
        return true;
    }
}
