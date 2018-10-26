import java.util.*;
import java.lang.*;
import java.io.*;
class NotEligible extends Exception 
{
    NotEligible() {}
}
class LowMarks extends Exception 
{
    LowMarks() 
    {
        System.out.println("Not Eligible by marks");
    }
}
class LowAttendance extends Exception 
{
    LowAttendance() 
    {
        System.out.println("Not Eligible by attendance");
    }
}
class CE 
{
    void Chain(double attendance, int marks) throws NotEligible 
    {
        if(attendance < 75) 
        {
            NotEligible e = new NotEligible();
            e.initCause(new LowAttendance());
            throw e;
        }
        if(marks < 35) 
        {
            NotEligible e = new NotEligible();
            e.initCause(new LowMarks());
            throw e;
        }
    }
}
class DriverMain5 
{
    public static void main (String[] args) 
    {
        try 
        {
            CE obj = new CE();
            obj.Chain(40,80);
            System.out.println("Eligible");
        }
        catch(NotEligible e) 
        {
            System.out.println("Caught :"+e);
            System.out.println("Original :"+e.getCause());
        }
    }
}