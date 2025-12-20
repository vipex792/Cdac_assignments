namespace Demo2_OOP_interface
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region
            //InsertInMySqlServer();
            //UpdateInMySqlServer();
            //DeleteInMySqlServer();
            MySqlServer mysql = new MySqlServer();
            mysql.Insert();
            mysql.Update();
            mysql.Delete();

            #endregion


            Console.WriteLine("Enter your Db choice. 1. SqlServer , 2. MySql Server , 3. Oracle ");
            int dbChoice = Convert.ToInt32(Console.ReadLine());

            DataBaseFactory factory = new  DataBaseFactory();
            IDatabase someDatabaseObject = factory.GetSomeDatabase(dbChoice);



            Console.WriteLine("Enter your Db choice. 1. Insert , 2. Update , 3. Delete ");
            int opChoice = Convert.ToInt32(Console.ReadLine());

            switch (opChoice) {
                case 1:
                    someDatabaseObject.Insert();
                    break;

                case 2:
                    someDatabaseObject.Update();
                    break;

                case 3:
                    someDatabaseObject.Delete();
                    break;

                default:
                    Console.WriteLine("Invalid Db operation choice");
                    break;

            }



        }
    }


    public interface IDatabase
    {
        void Insert();
        void Update();
        
        void Delete();
    }

    public class DataBaseFactory
    {
        public IDatabase GetSomeDatabase(int dbChoice)
        {
            IDatabase db = null;
            switch (dbChoice)
            {
                case 1:
                    db = new SqlServer();
                    break;

                case 2:
                    db = new MySqlServer();
                    break;

                case 3:
                    db = new OracleServer();
                    break;

                default :
                    db = null;
                    break;
            }

            return db;
        } 
    }

    public  class MySqlServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record inserted in MySql successfully");
        }

        public void Update()
        {
            Console.WriteLine("Record updated in MySql successfully");
        }

        public void Delete()
        {
            Console.WriteLine("Record deleted in MySql successfully");
        }
    }

    public class OracleServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record inserted in Oracle successfully");
        }

        public void Update()
        {
            Console.WriteLine("Record updated in Oracle successfully");
        }

        public void Delete()
        {
            Console.WriteLine("Record deleted in Oracle successfully");
        }
    }


    public class SqlServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record inserted in SqlServer successfully");
        }

        public void Update()
        {
            Console.WriteLine("Record updated in SqlServer successfully");
        }

        public void Delete()
        {
            Console.WriteLine("Record deleted in SqlServer successfully");
        }
    }





}
