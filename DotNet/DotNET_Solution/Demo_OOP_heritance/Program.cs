using Demo_OOP_Inheritance.logic;

namespace Demo_OOP_Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {

            #region Demo1
            Person person = new Person();
            person.first_name = "Tanishqa";
            person.last_name = "Sahu";
            Console.WriteLine(person); //gives the full name
            Console.WriteLine("Name : {0} {1}", person.first_name, person.last_name);


            #endregion

            #region Demo2
            Employee emp = new Employee();
            emp.employee_id = 101;
            Console.WriteLine(emp);
            Console.WriteLine("Emp ID : {2} , First name : {0} , Last name : {1} ",person.first_name,person.last_name,emp.employee_id);
            #endregion

            

        }
    }
}
