import java.util.*;
class Car {
    int speed;
    public Car(int speed)
    {
        this.speed = speed;
    }
}


public class generics_assignment
{
    public static void main(String[] args)
    {
        //Task1: Creating a generic class named Box which accepts a data type\
        System.out.println("========================Question1============================\n");
        Box<String> box1 = new Box<>();
        box1.Set("Hello");

        Box<Integer> box2 = new Box<>();
        box2.Set(19);

        Box<Double> box3 = new Box<>();
        box3.Set(10.9);

        System.out.println("Box1's value is: " + box1);
        System.out.println("Box2's value is: " + box2);
        System.out.println("Box3's value is: " + box3);
        System.out.println();

        System.out.println("========================Question2============================\n");
        System.out.println("Implementing a generic static class that compares objects\n");
        System.out.println("Max amomg three strings is: " + compare.compare_objects("Apple", "Banana", "Mango"));
        System.out.println("Maximum among the numbers is: " + compare.compare_objects(10,900,300));
        System.out.println("Maximum among the three double values is: " + compare.compare_objects(3.45,3.54,3.001));
        System.out.println("Maximum among Strings are: " + compare.compare_objects("banana", "apple", "banana"));


        System.out.println();
        Car c1 = new Car(34);
        Car c2 = new Car(45);
        Car c3 = new Car(56);
        System.out.println();
       // System.out.println("Max out of the three cars are: " + compare.compare_objects(c1,c2,c3));
        // The above line throws a compilation error because the car class doesn't extend the comparable class by default

        System.out.println("========================Question3============================\n");
        System.out.println("Implementing a generic stack\n");
        stack<Integer> s1 = new stack<>();
        s1.push(10);
        s1.push(45);
        s1.push(56);
        System.out.println("Element at the top is: " + s1.peek());
        s1.pop();
        System.out.println("Is the stack empty?: " + s1.isEmpty());
        System.out.println("Element at the top is: " + s1.peek());
        s1.pop();
        s1.pop();
        System.out.println("Is the stack empty?: " + s1.isEmpty());
        s1.push(80);
        System.out.println("Element at the top is: " + s1.peek());

        stack<String> s2 = new stack<>();
        s2.push("A");
        s2.push("N");
        System.out.println("Element popped from the array is: " + s2.pop());
        System.out.println("Element at the top is: " + s2.peek());
        System.out.println("Is the stack empty? " + s2.isEmpty());
        s2.pop();
        System.out.println("Is the stack empty? " + s2.isEmpty());
        System.out.println();

        System.out.println("========================Question4============================\n");
        System.out.println("Copying elements from source to destination");

        List<Integer> ints = List.of(1, 2, 3);
        List<Number> nums = new ArrayList<>();

        copyElements.copy(ints, nums);

        System.out.println(nums);

        List<String> strs = List.of("Alice", "Bob", "Charlie");
        List<Object> objs = new ArrayList<>();
        copyElements.copy(strs,objs);
        System.out.println(objs);

    }

}