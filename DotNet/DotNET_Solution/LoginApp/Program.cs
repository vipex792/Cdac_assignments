using Microsoft.Data.SqlClient;
using System;

namespace LoginApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("******LOGIN SYSTEM****** ");

            Console.Write("Enter Username For Login: ");
            string username = Console.ReadLine();

            Console.Write("Enter Valid Password : ");
            string password = Console.ReadLine();

            //Connection String = This String use to Connect The Database 
            string connectionString = @"Data Source=(LocalDB)\MSSQLLocalDB;Initial Catalog=Dac97;Integrated Security=True";

            //Represents Connection To the Database
            using (SqlConnection conn = new SqlConnection(connectionString))
            {
                conn.Open();
                // Check The Valid Username and password from database that use enters
                string query = "SELECT Username FROM Users WHERE Username=@user AND Password=@pass";
            //SqlCommand Send SQL Query to the database (Stored Procedure)  
                SqlCommand cmd = new SqlCommand(query, conn);
                cmd.Parameters.AddWithValue("@user", username);
                cmd.Parameters.AddWithValue("@pass", password);

                SqlDataReader reader = cmd.ExecuteReader();
                // SQLDataReader = Sends the query to the database
                if (reader.HasRows) // Atleast one login user found =login succefull
                {
                    reader.Read();
                    string name = reader.GetString(0);
                    Console.WriteLine("\nWelcome " + name + "!");
                }
                else
                {
                    Console.WriteLine("\nINVALID LOGIN"); // No Match Login failed 
                }
            }

            Console.WriteLine("\nPress any Key To exit the page ");
            Console.ReadKey();
        }
    }
}
