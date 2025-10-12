
class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside main function");

        String name = Thread.currentThread().getName();

        System.out.println("Name of the current thread is : "+name);
    }
}