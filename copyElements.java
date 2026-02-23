import java.util.*;
public class copyElements
{
    //Creating a generic method
    public static <T> void copy(List<? extends T> source, List<? super T> destination)
    {
        for(T element: source)
        {
            destination.add(element);
        }
    }
    
}