/*public class Position {
    public Position(int r, int c)
    {

    }
    public static Position findPosition(int num, int[][] intArr)
    {
        for(int i=0;i<intArr.length;i++)
        {
            for(int j=0;j<intArr[0].length;j++)
            {
                if(intArr[i][j]==num)
                    return new Position(i,j);
            }
        }
        return null;
    }
    public static Position[][] getSuccessorArray(int[][] intArr)
    {
        Position[][] arr = new Position[intArr.length][intArr[0].length];
        for(int i=0;i<intArr.length;i++)
        {
            for(int j=0;j<intArr[0].length;j++)
            {
                int val = intArr[i][j;
                if(findPosition(val+1, intArr)==null)
                    arr[i][j]=null;
                else
                {
                    Position p = findPosition(val+1, intArr);
                    arr[i][j] = p;
                }
            }
        }
        return arr;
    }
}
*/