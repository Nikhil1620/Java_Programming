import java.util.*;

class program808
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of cities : ");
        int N = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid Input.");
            return;
        }

        int Arr[][] = new int[N][7];
        int i = 0, j = 0, no = 0;

        System.out.println("Enter electricity consumption of each city : ");

        for(i = 0; i < N; i++)
        {
            System.out.println("Enter consumptio of city : "+(i+1));

            for(j = 0; j < 7; j++)
            {
                no = sobj.nextInt();
                if(no < 0)
                {
                    System.out.println("Invalid input.");
                    return;
                }
                Arr[i][j] = no;
            }
        }

        int Weekly[] = new int[7];
        int Highest_City = 0;
        int Max_Weekly = 0;

        int Peak_Day = 0;
        int Max_Day_Total = 0;

        int Sum = 0;

        //Weekly Total + highest cunsumption

        for(i = 0;i < N; i++)
        {
            Sum = 0;

            for(j = 0; j < 7; j++)
            {
                Sum = Sum + Arr[i][j];
            }
            Weekly[i] = Sum;

            if(Sum > Max_Weekly)
            {
                Max_Weekly = Sum;
                Highest_City = i;
            }
        }        
        System.out.println("Highest Cunsumption : City"+Highest_City);
        System.out.println("Highest consumption : "+Max_Weekly);

        int Day_Sum = 0;
        int Day = 0;

        //Day with maximum consumption
        
        for(Day = 0; Day < 7; Day++)
        {
            Day_Sum = 0;
            for(i = 0; i < N; i++)
            {
                Day_Sum = Day_Sum + Arr[i][Day];
            }

            if(Day_Sum > Max_Day_Total)
            {
                Max_Day_Total = Day_Sum;
                Peak_Day = Day;
            }
        }
        System.out.println("Peak consumption day : "+Peak_Day);

        System.out.println("Weekly consumption : ");

        for(i = 0; i < N; i++)
        {
            System.out.println("City : "+(i+1)+" : "+Weekly[i]);
        }


        //Cities more then 500 consumption
        System.out.println("Cities more than 500 cosumption : ");

        for(i = 0; i < N; i++)
        {
            if(Weekly[i] > 500)
            {
                System.out.println("City : "+(i+1));
            }
        }
    }
}