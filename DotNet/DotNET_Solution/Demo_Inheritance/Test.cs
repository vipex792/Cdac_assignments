using System;


namespace Demo_Inheritance
{
    public  class CMath
    {
        public int Add(int x, int y)
        {
            return x + y;
        }

        //method overloading within the same class

        public void Add(int x, int y,int z)
        {
            Console.WriteLine(x+y+z); //return x+y+z;
        }

        public void Sub(int x, int y)
        {
            Console.WriteLine("Sub is {0}",(x-y)); 
        }

        public virtual void Mult(int x, int y)
        {
            Console.WriteLine("Multiplication is {0}", (x*y));
        }
    }



    public class AdvancedMath : CMath
    {

        public override void Mult(int x, int y)
        {
            Console.WriteLine("Adv Math Mult:{0} ", x * y * 100);
        }
        //Shadowing The base class method

        public new void Sub(int x, int y)
        {
            Console.WriteLine("Adv Math Sub: {0}", (x-y)*10);
        }
        public void Add(int x , int y)
        {
            Console.WriteLine("Adv Math Add: {0}", (x+y)*2);
        }

        public int Add(int x, int y, int z, int w)
        {
            return x + y + z + w; 
        }
    }
}
