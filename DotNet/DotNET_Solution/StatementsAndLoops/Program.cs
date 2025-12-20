namespace StatementsAndLoops
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region ForLoop

            //int x = 0;
            //for (int i = 0; i < 5; i++)
            //{
            //    x++;
            //    Console.Write(x);

            //}

            #endregion

            #region While
            //int i = 0;
            //while (i < 6)
            //{

            //    Console.WriteLine(i);
            //    i++;
            //}
            #endregion

            #region Do While
            //int i = 5;
            //do
            //{
            //    Console.WriteLine(i);
            //    i++;
            //}

            //while (i < 10);
            //{
            //    Console.WriteLine(i);

            //}
            #endregion

            #region If-Else
            //bool a = true;
            //if (a)
            //{
            //    Console.WriteLine("It is true");
            //}

            //else
            //{
            //    Console.WriteLine("It is false");

            //}

            #endregion

            #region switch-case

            //int choice = 2;
            //switch (choice)
            //{
            //    case 1:
            //        Console.WriteLine("this is case 1");
            //        break;

            //    case 2:
            //        Console.WriteLine("this is case 2");
            //        break;

            //    case 3:
            //        Console.WriteLine("this is case 3");
            //        break;

            //    default:
            //        Console.WriteLine("this is default");
            //        break;

            //}

            #endregion

            #region Switch userdefined

            //Console.WriteLine("Enter the case input");
            //string input = Console.ReadLine();
            ////Whatever the user types(e.g., "1", "2", "hello", "999") is returned as a string(text).
            //int choice = Convert.ToInt32(input);//Even if type 2 it is taken as "2",so this is needed to convert

            //switch (choice)
            //{
            //    case 1:
            //        Console.WriteLine("case 1");
            //        break;

            //    case 2:
            //        Console.WriteLine("case 2");
            //        break;

            //    case 3:
            //        Console.WriteLine("case 3");
            //        break;

            //    default:
            //        Console.WriteLine("case def");
            //        break;

            //}


            #endregion


            #region Unboxing boxing typecasting
            #region Boxing
            //int x = 100;
            //string str = "Hello world";
            //Object obj = new Object();
            //obj = x;
            //Console.WriteLine(obj);
            //str=Convert.ToString(x);
            //string str2 = x.ToString();

            #endregion


            #region Unboxing
            //int y = Convert.ToInt32(obj);
            //int p = Convert.ToInt32(str2);
            //Console.WriteLine("y = {0}, p = {1}", y,p);

            #endregion


            #region Typecasting

            //double d   = 9.89;
            //int num1 = Convert.ToInt32(d);
            //double d2 = num1;
            //Console.WriteLine("d = {0}, num1 = {1}, d2 = {2}", d,num1,d2);

            //object obj2 = new object();
            //string str4 = "something";
            //obj2 = str4;
            //string str5 = obj2.ToString();
            //Console.WriteLine(str5);


            #endregion
            #endregion

            #region Basics of datatypes
            int x = 42;
            System.Int32 y = 100;
            double d = 3.2664736;
            Console.WriteLine("X={0}, Y={1}, D={2} ", x,y,d);
            string str1 = "Hello Hugh Jackman";
            string str2 = "Hello Peter Parker";
            string str3 = new string("abc");
            char ch = 'A';
            char[] chArr = new char[2];
            chArr[0] = 'H';
            chArr[1] = 'i';
            String str4 = new string (chArr);


            #endregion

        }
    }
}
