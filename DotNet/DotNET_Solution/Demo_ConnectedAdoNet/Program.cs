using Microsoft.Data.SqlClient;
using System;

namespace Demo_ConnectedAdoNet
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=Dac098;Integrated Security=True;";

            #region SELECT QUERY 
            //SqlConnection con = new SqlConnection(connectionString);

            //string selectQuery = "SELECT * FROM Product";

            //SqlCommand cmd = new SqlCommand();
            //cmd.CommandType = System.Data.CommandType.Text;
            //cmd.CommandText = selectQuery;
            //cmd.Connection = con;

            //con.Open();

            //SqlDataReader reader = cmd.ExecuteReader();
            //while (reader.Read())
            //{
            //    int id = Convert.ToInt32(reader["ProductId"]);
            //    string? nm = reader["ProductName"].ToString();
            //    int price = Convert.ToInt32( reader["ProductPrice"]);
            //    Console.WriteLine($"Id:{id}, Name: {nm}, Price: {price}");
            //}

            //con.Close();
            #endregion

            #region INSERT QUERY
            SqlConnection con = new SqlConnection(connectionString);
            Console.WriteLine("Enter ProductId:");
            int id = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter ProductName ");
            string name = Console.ReadLine();
            Console.WriteLine("Enter ProductPrice:");

            int price = Convert.ToInt32(Console.ReadLine());

            string insertQuery = $"INSERT INTO Product(ProductId,ProductName,ProductPrice) VALUES('{id}','{name}', '{price}')";

            SqlCommand cmd = new SqlCommand(insertQuery, con);
            //cmd.CommandType = System.Data.CommandType.Text;
            //cmd.CommandText = insertQuery;
            //cmd.Connection = con;

            con.Open();

            int noOfRowsAffected = cmd.ExecuteNonQuery();
            if (noOfRowsAffected > 0)
            {
                Console.WriteLine("Record inserted successfully!!");
            }
            else
            {
                Console.WriteLine("Error");
            }

            con.Close();
            #endregion

            #region UPDATE QUERY
            //SqlConnection con = new SqlConnection(connectionString);

            //Console.WriteLine("Enter Id for Product to be updated");
            //int id = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Name to be updated:");
            //string nm = Console.ReadLine();
            //Console.WriteLine("Enter ProductName to be updated");
            //string add = Console.ReadLine();

            //string updateQuery = $"UPDATE Product SET ProductName='{nm}', ADDRESS='{add}' WHERE ID = {id}";

            //SqlCommand cmd = new SqlCommand(updateQuery, con);

            //con.Open();

            //int noOfRowsAffected = cmd.ExecuteNonQuery();
            //if (noOfRowsAffected > 0)
            //{
            //    Console.WriteLine("Record updated successfully!!");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}

            //con.Close(); 
            #endregion

            #region DELETE QUERY
            //SqlConnection con = new SqlConnection(connectionString);

            //Console.WriteLine("Enter Id for Emp to be deleted");
            //int id = Convert.ToInt32(Console.ReadLine());

            //string deleteQuery = $"DELETE FROM Emp WHERE ID={id}";

            //SqlCommand cmd = new SqlCommand(deleteQuery, con);

            //con.Open();

            //int noOfRowsAffected = cmd.ExecuteNonQuery();
            //if (noOfRowsAffected > 0)
            //{
            //    Console.WriteLine("Record deleted successfully!!");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}

            //con.Close(); 
            #endregion
        }
    }
}
