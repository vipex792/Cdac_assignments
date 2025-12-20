using System;


namespace Demo_Inheritance
{
    internal class BaseClass
    {
        private int _baseNumber;
        // parameterless constructor
        public BaseClass()
        {

        }
        public BaseClass(int num)
        {
            _baseNumber = num;
            Console.WriteLine("You Passed num = {0}", _baseNumber);
        }
        public void Method1()
        {
            Console.WriteLine("Method1 from base class");
        } 
    }
    internal class DerivedClass : BaseClass
    {
        public DerivedClass(int no) : base(no) { 
        
        
        }
        public void Method2() {
            Console.WriteLine("Method 2 from Derived Class ");
        }                                                                   
        }
}
