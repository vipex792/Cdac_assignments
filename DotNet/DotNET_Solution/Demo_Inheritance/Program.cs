namespace Demo_Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Demo 00

            BaseClass baseObj = new BaseClass();
            baseObj.Method1();
            DerivedClass derivedObj = new DerivedClass(1);
            derivedObj.Method2();
            derivedObj.Method1();
            BaseClass obj = new DerivedClass(1);

            #endregion

            #region method overloading
            //AdvancedMath advMath = new AdvancedMath();
            //Console.WriteLine(advMath.Add(1,2,3,4));
            //advMath.Sub(10,5);

            #endregion

            #region Override, new, virtual
            AdvancedMath advMath= new AdvancedMath();
            advMath.Sub(10,5);
            advMath.Add(15, 5);
            advMath.Mult(16, 5);

            #endregion
        }
    }
}
