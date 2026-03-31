import java.util.*;

class program813
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows in theatre : ");
        int R = sobj.nextInt();

        System.out.println("Enter numner of coloumns in theatre : ");
        int C = sobj.nextInt();

        if(R <= 0 | C <= 0)
        {
            System.out.println("invalid input.");
            return;
        }

        int Seats[][] = new int[R][C];

        System.out.println("Enter booking details (0/1): ");

        int i = 0;
        int j = 0;

        for(i = 0; i < R; i++)
        {
            System.out.println("Enter details of row "+(i+1));

            for(j = 0; j < C; j++)
            {
                Seats[i][j] = sobj.nextInt();

                if(Seats[i][j] != 0 && Seats[i][j] != 1)
                {
                    System.out.println("Invalid input.");
                    return;
                }
            }
        }

        int Total_Booked = 0;
        int Max_Booked_inRow = 0;
        int Row_With_Max = 0;
        boolean FullRowExist = false;
        int Row_Booked = 0;

        for(i = 0; i < R; i++)
        {
            Row_Booked = 0;

            for(j = 0; j < C; j++)
            {
                if(Seats[i][j] == 1)
                {
                    Total_Booked++;
                }

                Row_Booked = Row_Booked + Seats[i][j];
            }

            if(Row_Booked > Max_Booked_inRow)
            {
                Max_Booked_inRow = Row_Booked;
                Row_With_Max = i;
            }

            if(Row_Booked == C)
            {
                FullRowExist = true;
            }
        }

        System.out.println("Total Booked Seats : "+Total_Booked);

        System.out.println("Row with maximum bookings : "+(Row_With_Max+1));

        System.out.println("Full row exists : "+(FullRowExist ? "Yes" : "No"));
        
        System.out.println("Seat Layout of theatre : ");

        for(i = 1; i < R; i++)
        {
            for(j = 0; j < C; j++)
            {
                System.out.print(((Seats[i][j] == 1) ? "Book" : "Free"));
            }

            System.out.println();
        }
    }
}