using System.Globalization;

namespace ConsoleApp1
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            
            int n = 4;

            for(int i = 1; i<=n; i++)
            {
                for(int j = 1; j<=n-i; j++)
                {
                    Console.Write(" ");
                }
                Console.Write("*");

                if (i > 1)
                {
                    for(int k = 1; k<=2*i-3; k++)
                    {
                        Console.Write(" ");
                    }
                    Console.Write("*");

                }
                Console.WriteLine();
            }



            for (int i = n - 1; i >= 1; i--);
            {
                for (int j = 1; j <= n - i; j++)
                {
                    Console.Write(" ");

                }
                Console.Write("*");

                if (i > 1)
                {
                    for(int k = 1; k <= 2 * i - 3;k++)
                    {
                        Console.Write(" ");
                    }
                    Console.Write("*");
                }

                Console.WriteLine();
            }

            Console.WriteLine("\n Press any Key Exist");

        }
        
    }
}    



//using System;

//public class Program
//{
//    public static void Main(string[] args)
//    {
//        // Define the number of rows for the top half (determines the size)
//        int n = 4; // This value controls the size of the diamond

//        // --- PART 1: TOP HALF (including the middle row) ---
//        for (int i = 1; i <= n; i++)
//        {
//            // Print leading spaces
//            for (int j = 1; j <= n - i; j++)
//            {
//                Console.Write(" ");
//            }

//            // Print the first star
//            Console.Write("*");

//            // Print inner spaces (Hollow part)
//            if (i > 1)
//            {
//                // Number of inner spaces is 2*i - 3
//                for (int k = 1; k <= 2 * i - 3; k++)
//                {
//                    Console.Write(" ");
//                }
//                // Print the second star (only if not the top single star)
//                Console.Write("*");
//            }

//            // Move to the next line for the next row
//            Console.WriteLine();
//        }

//        // --- PART 2: BOTTOM HALF (excluding the middle row) ---
//        for (int i = n - 1; i >= 1; i--)
//        {
//            // Print leading spaces
//            for (int j = 1; j <= n - i; j++)
//            {
//                Console.Write(" ");
//            }

//            // Print the first star
//            Console.Write("*");

//            // Print inner spaces (Hollow part)
//            if (i > 1)
//            {
//                // Number of inner spaces is 2*i - 3
//                for (int k = 1; k <= 2 * i - 3; k++)
//                {
//                    Console.Write(" ");
//                }
//                // Print the second star (only if not the bottom single star)
//                Console.Write("*");
//            }

//            // Move to the next line for the next row
//            Console.WriteLine();
//        }

//        Console.WriteLine("\nPress any key to exit...");
//        Console.ReadKey();
//    }
//}



