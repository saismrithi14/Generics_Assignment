public class compare
{
    public static <T extends Comparable<T>>T compare_objects(T a, T b, T c)
    {
        T max = a;
        if(max.compareTo(b) < 0)
        {
            max = b;
        }


        if(max.compareTo(c) < 0)
        {
            max = c;
        }

        return max;
    }
}