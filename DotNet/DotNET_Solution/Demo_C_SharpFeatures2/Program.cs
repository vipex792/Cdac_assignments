using System.Collections;

namespace Demo_C_SharpFeatures2
{
    public delegate bool MyDelegate(int num);

    internal class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Enter a Number");
            //int no = Convert.ToInt32(Console.ReadLine());

            #region Normal Function Call for Check Method
            //var result = Check(no);
            //if (result)
            //{
            //    Console.WriteLine($"No: {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No: {no} is NOT greater than 10");
            //}
            #endregion



            #region Check Method call With MyDelegate 

            //MyDelegate del = new MyDelegate(Check);
            //var result = del(no);
            //if (result)
            //{
            //    Console.WriteLine($"No: {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No: {no} is NOT greater than 10");
            //} 
            #endregion

            #region Anonyous method with MyDelegate and delegate keyword:
            //MyDelegate del = new MyDelegate(delegate (int num)
            //{
            //    return num > 10;
            //});

            //MyDelegate del = delegate (int num) {

            //    return num > 10;
            //};


            //var result = del(no);
            //if (result)
            //    if (del(no))
            //    {
            //        Console.WriteLine($"No: {no} is Greater than 10 ");
            //    }
            //    else
            //    {
            //        Console.WriteLine($"No: {no} is NOT Greater than 10");
            //    }


            #endregion


            #region Lambda Expression
            //MyDelegate del = (int num) =>
            //{
            //    return num > 10;
            //};

            //MyDelegate del = num => num > 10;

            //if (del(no))
            //{
            //    Console.WriteLine($"No : {no} is greater than 10"); ;
            //}

            //else
            //{
            //    Console.WriteLine($"No : {no} is not greater than 10");
            //}

            #endregion


            #region Preedicate <T> in built delegate
            //Predicate<int> del = num => num > 10;

            //if (del(no))
            //{
            //    Console.WriteLine($"No : {no} is greater than 10"); ;
            //}

            //else
            //{
            //    Console.WriteLine($"No : {no} is not greater than 10");
            //}

            #endregion

            #region  In-built Sum Extension Method and normal MySum Method
            //int[] arr = new int[] {1 ,5 ,3, 2};
            //var result = arr.Sum();
            //Console.WriteLine($"Sum is : {result}");

            //var result1 = MySum(arr);
            //Console.WriteLine($"Sum1 is : {result1}");


            //string[] names = new string[] { "A", "B", "C", "D" };
            //var result2 = MySum(names);
            //Console.WriteLine($"Sum2 is : {result2}");


            //var result3 = arr.Sum();
            //Console.WriteLine($"Sum3 is : {result3}");

            #endregion


            #region Regular valid email id checking code : 

            Console.WriteLine("Enter your email ID:");
            string? email = Console.ReadLine();
            if (email != null)
            {
                if (MyClass.CheckForValidEmailID(email))
                {
                    Console.WriteLine("This email ID is Valid");
                }

                else
                {
                    Console.WriteLine("Invalid Email id");
                }

            }

            #endregion

            #region Extension Method : Demo 1
            //Console.WriteLine("Enter Your Email ID");

            //string? email = Console.ReadLine();
            //if (email != null)
            //{
            //    if (email.CheckForValidEmailID())
            //        Console.WriteLine("Vaild Email ID");
            //    else
            //        Console.WriteLine("Invalid Email ID");
            //}
            #endregion

            #region Extension Method : Demo 2
            int[] numbers = { 101, 102, 103, 104, 105 };
            string[] days = { "Mon", "Tue", "Wed", "Sun" };

            List<int> output1 = numbers.ConvertToList(1111);
            foreach (var item in output1)
            {
                Console.WriteLine($"{item}");
            }

            List<string> output2 = days.ConvertToList(4789);
            foreach (var item in output2)
            {
                Console.WriteLine($"{item}");
            }
            #endregion


            #region CustomCollection Demo2
            MyCustomCollection customCollectionObject = new MyCustomCollection();
            customCollectionObject.AddElement(10);
            customCollectionObject.AddElement(20);
            customCollectionObject.AddElement(30);

            var result = customCollectionObject.GetElemets;
            for (int i = 0; i < result.Count; i++)
            {
                Console.WriteLine(result[i]);
            }
            foreach (var item in result)
            {
                Console.WriteLine(item);
            }

            foreach (var item in customCollectionObject)
            {
                Console.WriteLine($"--{item}");
            }

            MyCollection collection = new MyCollection();
            foreach (string day in collection)
            {
                Console.WriteLine(day);
            }
            #endregion
        }




        public static bool Check(int num) {
            return num > 10;
        }

        public static T MySum<T>(IEnumerable<T> arr)
        {
            dynamic sum = 0;
            foreach(var ele in  arr)
            {
                sum += ele;
            }
            return sum;
        }
    }

    public static class MyClass
    {
        public static bool CheckForValidEmailID(this string email)
        {
            return email.Contains("@b.com");
        }

        public static List<T> ConvertToList<T>(this IEnumerable<T> source, int nonsenseParameter)
        {
            List<T> list = new List<T>();
            foreach (var item in source)
            {
                list.Add(item);
            }
            Console.WriteLine($"Nonsense Parameter value = {nonsenseParameter}");
            return list;
        }
    }

    public class MyCustomCollection : IEnumerable
    {
        private ArrayList arr = new ArrayList();
        public ArrayList GetElemets
        {
            //set
            //{
            //    arr.Add(value);
            //}
            get
            {
                return arr;
            }


        }
        public void AddElement(int element)
        {
            arr.Add(element);
        }


        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < arr.Count; i++)
            {
                yield return arr[i];
            }
        }

    }
    public class MyCollection : IEnumerable
    {
        private string[] days = new string[] { "Monday", "Tuesday", "Friday", "Sunday" };

        public IEnumerator GetEnumerator()
        {
            for(int i = 0; i< days.Length; i++)
            {
                string day = days[i];
                yield return day;
            }
        }

    }

    

}
