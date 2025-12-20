namespace Demo_MultiCast_Delegate
{
    public delegate void MyEventHandler(); 
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Is Guest Arrived !");
            string isGuestArrived = Console.ReadLine();

            CollegeAnnualEvent obj = new CollegeAnnualEvent();
            MyEventHandler handler = obj.Welcome;
            handler += obj.WelSpeech;
            if (isGuestArrived == "y")
            {
                handler += obj.GuestSpeech;
            }
            else { 
            handler -= obj.GuestSpeech;        
                }
            handler += obj.Dance;
            handler += obj.Dinner;
            handler += obj.GoodBye;
            handler += obj.EndEvent;

            handler();
        }
    }

    public class CollegeAnnualEvent
    {
        public void Welcome()
        {
            Console.WriteLine("Wel-Come Everyone");
        }

        public void WelSpeech()
        {
            Console.WriteLine("Host :Blah Blah why are you come here ");

        }

        public void GuestSpeech()
        {
            Console.WriteLine("Guest: blah blah I am here to waste my time between bullshits people!");
        }

        public void Dance()
        {
            Console.WriteLine("Oh God: abb Ghodod ki race mein gadhe bhi daudenge");
        }

        public void Dinner()
        {
            Console.WriteLine("We Insist at least Please eat something");

        }
        public void GoodBye()
        {
            Console.WriteLine("Dont Come Next Time");
        }

        public void EndEvent()
        {
            Console.WriteLine("Pack Up...!");
        }



    }
}
