namespace Demo_Delegates
{

    public delegate void MyDelegate();
    public delegate void MyDelegate2(string str);

    public delegate int MyAddDelegate(int p, int q);
    public delegate int MySquareDelegate(int x);



    internal class Program
    {
        static void Main(string[] args)
        {
            #region Delegate and Old Syntax for Method Calls

            CMath cMath = new CMath();
            MyAddDelegate addDel = new MyAddDelegate(cMath.Add);

            Console.WriteLine("Enter A First Number");
            int num1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter A Second Number");
            int num2 = Convert.ToInt32(Console.ReadLine());

            int addResult = addDel(num1, num2);

            MySquareDelegate squareDel = new MySquareDelegate(cMath.Square);

            int squareResult = squareDel.Invoke(num1);
            Console.WriteLine($"Add = {addResult}, Square = {squareResult}");


            #endregion


        }
        public class CMath
        {
            public int Add(int x, int y)
            {

                return x + y;

            }

            public int Square(int x)
            {
                return x * x;
            }
        }
        

        public class MyClass
        {
            public void SayHi()
            {
                Console.WriteLine("Say Hi");
            }

            public void Greet(string name)
            {
                Console.WriteLine($"Hello {name}!!");
            }
        }
    }
}
