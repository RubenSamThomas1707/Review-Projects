/*
Name: Ruben Sam Thomas
Net ID: rst180005
 */

import java.lang.*;

public class BinaryFormatException extends Exception
{
    String errorMessage = "";

    public BinaryFormatException(String errMessage)
    {
        this.errorMessage = errMessage;
    }

    public String toString()
    {
        return (this.errorMessage);
    }

}
