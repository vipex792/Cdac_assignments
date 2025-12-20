using One;
using System;
namespace Demo_OOP_Basic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region  FullyQualifiedName
            //System.Int32 x = 100;
            //System.Int32 y = 200;

            //Int32 x = 100;
            //Int32 y = 200;

            int x = 100;
            int y = 200;

            //One.MyClass obj = new One.MyClass();
            MyClass obj = new MyClass();
            obj.GetMessage();
            #endregion
        }
    }
}
