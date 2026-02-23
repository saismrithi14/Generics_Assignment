public class Box<T>
{
    private T value;

    public  void Set(T val)
    {
        this.value = val;
    }

    public T Get()
    {
        return this.value;
    }

    public String toString()
    {
        return String.valueOf(value);
    }

}