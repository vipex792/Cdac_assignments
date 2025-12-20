namespace Demo_CMathlib
{
    public class CMath
    {
        public void Add(int x, int y) 
        {
            Console.WriteLine($"Add = {x+y}");
        }

        private void Sub(int x, int y)
        {
            Console.WriteLine($"Add = {x - y}");
        }

        protected void Mult(int x, int y)
        {
            Console.WriteLine($"Add = {x * y}");
        }

        protected internal void Div(int x, int y)
        {
            Console.WriteLine($"Add = {x / y}");
        }

        internal void Square(int x)
        {
            Console.WriteLine($"Add = {x*x}");
        }
    }


    public class AdvMath : CMath
    {
        public void Adv_WrapperMethod()
        {
            base.Div(50,5);
            base.Mult(5,5);
            base.Square(3);

        }
    }
}
