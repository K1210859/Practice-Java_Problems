public class GradeAnalysis {
    public static double getGrade()
    {
        /* implementation not shown*/
    }
    public static double gradeSimulation()
    {
        double answer = 0;
        int totalGrades = 0;
        int above90 = 0;
        boolean trueCondition=false;
        while(!trueCondition)
        {
            double grade = getGrade();
            if(grade==-1.0)
                trueCondition = true;
            else
            {
                totalGrades++;
                if(grade>=90.0)
                    above90++;
            }
        }
        answer = (double) (above90/totalGrades);
        return answer;
    }

    // you must create an instance variable that keeps track of the maximumGrade that is allowed - can be called double maxGrade
    // in the getGrade() method, before returning the grade,  check if the grade that you are going to return is more that the maxGrade
    // if it is more than the maxGrade, then do not return that number and return the next/ another number(this could be done by just calling the method getGrade() once again on this line so that it returns another number)
    // if it is not more than the maxGrade, then you can just return that number in the method
}
