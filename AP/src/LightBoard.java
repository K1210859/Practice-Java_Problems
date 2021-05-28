public class LightBoard {
    private boolean lights[][];
    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<numCols;j++)
            {
                int num = (int) (Math.random()*10+1);
                if(num>=1 && num<=4)
                    lights[i][j]=true;
                else
                    lights[i][j]=false;
            }
        }
    }
    public boolean evaluateLight(int row, int col)
    {
        int numColLights = 0;
        for(int i=0;i<lights.length;i++)
        {
            if(lights[i][col]==true)
                numColLights++;
        }
        if(lights[row][col]==true && numColLights%2==0)
            return false;
        else if(lights[row][col]==false && numColLights%3==0)
            return true;
        else
            return lights[row][col];
    }
}
