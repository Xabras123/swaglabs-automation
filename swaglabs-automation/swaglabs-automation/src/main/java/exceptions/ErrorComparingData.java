package exceptions;

public class ErrorComparingData extends RuntimeException{
    public static final String INCORRECT_DATA_COMPARING ="THE DATA COMPARED ISN'T THE SAME ";

    public ErrorComparingData(String message){
        super(message);
    }
}

