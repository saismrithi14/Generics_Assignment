import java.util.*;
public class stack<T>
{
    private int top;
    private ArrayList<T> arr;

    public stack()
    {
        this.top = -1;
        this.arr = new ArrayList<T>();
    }

    public void push(T x)
    {
        top ++;
        arr.add(top, x);
    }

    public T pop()
    {
        T value;
        if(top != -1)
        {
            value = arr.remove(top);
            top --;
        }

        else {
            value = null;
        }

        return value;
    }

    public T peek()
    {
        T value = arr.get(top);
        return value;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

}