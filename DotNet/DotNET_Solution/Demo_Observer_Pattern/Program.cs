namespace Demo_Observer_Pattern
{
    public delegate void NotifyEventHandler(string message);
    internal class Program
    {
        static void Main(string[] args)
        {
            Publisher publisher = new Publisher();
            Subscriber subscriber = new Subscriber();

            publisher.Notify += subscriber.MethodA;
            publisher.Notify += subscriber.MethodB;

            publisher.NotifySubscribers("The Grand Sale is 70% up Grab It As soon possible");

            publisher.Notify -= subscriber.MethodB;

            publisher.NotifySubscribers("FLash Sale Extra 20% on Electronic products");

        }
    }
    public class Subscriber
    {
        public void MethodA(string message) {
            Console.WriteLine($"MethodA received : {message} via SMS");
        }

        public void MethodB(string message) {
            Console.WriteLine($" MethodB received : {message} Via Email");
        }
    }

    public class Publisher
    {
        public event NotifyEventHandler Notify;

        //public void TriggerEvents()
        //{
        //    Notify.Invoke("Event triggered!");
        //}

        //public void TriggerEvent()
        //{

        //}

        public void NotifySubscribers(string message)
        {
            Notify?.Invoke(message);
        }

    }
}
