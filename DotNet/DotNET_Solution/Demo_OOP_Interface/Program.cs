namespace Demo_OOP_interface
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Implicit implementation of interface IDrink
            //Drink drink = new Drink();
            //drink.GetDrink();

            #endregion

            #region Implicit implementation
            Console.WriteLine("Enter Your Choice");
            int ch = Convert.ToInt32(Console.ReadLine());
            switch (ch)
            {
                case 1:
                    IDrink coldDrink = new ColdDrink();
                    coldDrink.GetDrink();
                    break;

                case 2:
                    IDrink hotDrink = new HotDrink();
                    hotDrink.GetDrink();
                    break;

                default:
                    Console.WriteLine("Invalid choice");
                    break;
            }
        }




        #endregion

        #region Implicit Implementation

        public interface IDrink
        {
            void GetDrink();
        }

        public class ColdDrink : IDrink {
            public void GetDrink()
            {
                Console.WriteLine("Enjoy Your  ColdDrink");
            }
        }

        public class HotDrink : IDrink {

            public void GetDrink() {
                Console.WriteLine("Enjoy your hotDrink");
            }
        }


        #endregion

        #region Implicit implementation of interace IDrink

        //public interface IDrink
        //{
        //    void GetDrink();
        //}

        //public class Drink : IDrink
        //{
        //    public void GetDrink()
        //    {
        //        Console.WriteLine("Enjoy Your Drink!!");
        //    }
        //}
        #endregion

    
    }
}

