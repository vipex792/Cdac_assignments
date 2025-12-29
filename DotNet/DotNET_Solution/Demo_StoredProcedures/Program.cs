using Microsoft.Data.SqlClient;

namespace Demo_StoredProcedures
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string _conStr = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=Dac97;Integrated Security=True";

            //InsertDepartment(_conStr, "Marketing");
            //InsertDepartment(_conStr, "Technical");
            InsertDepartment(_conStr, "HR");

            //InsertEmployee(_conStr, "Ramesh", 1);
            //InsertEmployee(_conStr, "Vinod", 2);
            //InsertEmployee(_conStr, "Rob", 5);
            InsertEmployee(_conStr, "AA", 8);

            //GetEmployeeById(_conStr, 2);
            //GetEmployeeById(_conStr, 1);
            GetEmployeeById(_conStr, 4);

            Console.WriteLine("Done");
        }
        public static void InsertDepartment(string constr, string deptName)
        {
            using (SqlConnection con = new SqlConnection(constr))
            {
                con.Open();
                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandType = System.Data.CommandType.StoredProcedure;
                    cmd.CommandText = "InsertDepartment";
                    cmd.Connection = con;
                    cmd.Parameters.AddWithValue("@DepartmentName", deptName);

                    cmd.ExecuteNonQuery();
                }
            }
        }

        public static void InsertEmployee(string conStr, string empName, int deptId)
        {
            using (SqlConnection con = new SqlConnection(conStr))
            {
                con.Open();
                using (var command = new SqlCommand("InsertEmployee", con))
                {
                    command.CommandType = System.Data.CommandType.StoredProcedure;
                    command.Parameters.AddWithValue("@EmployeeName", empName);
                    command.Parameters.AddWithValue("@DepartmentId", deptId);
                    command.ExecuteNonQuery();
                }
            }
        }

        public static void GetEmployeeById(string conStr, int id)
        {
            // Example of retrieving an employee by ID using a stored procedure
            using (var connection = new SqlConnection(conStr))
            {
                connection.Open();
                using (var command = new SqlCommand("GetEmployeeByDepartment", connection))
                {
                    command.CommandType = System.Data.CommandType.StoredProcedure;
                    command.Parameters.AddWithValue("@DepartmentId", id);
                    using (var reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            Console.WriteLine($"Id: {reader["EmployeeId"]}, Name: {reader["EmployeeName"]}");
                        }
                    }
                }
            }
        }
    }
}
