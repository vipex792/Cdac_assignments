namespace Demo_EventAndDelegate
{

    //make delegate at namespace level
    public delegate void MyHandler(int mrk);
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your marks");

            Student student = new Student();


            student._Pass += new MyHandler(student.student_Pass);
            student._Fail += new MyHandler(student.student_Fail);

            student.Marks=Convert.ToInt32(Console.ReadLine());
            student.TriggeredEvents(student.Marks);



        }
    }


    public class Student
    { 
        public event MyHandler _Pass;
        public event MyHandler _Fail;

        private int _Marks;

        public int Marks
        {
            
            set 
            { 
                _Marks = value;
                if (_Marks>40)
                {
                    _Pass(_Marks);
                }

                else
                {
                    _Fail.Invoke(_Marks);
                }
            }

            get 
            { 
                return _Marks;
            }

        }

        public void TriggeredEvents(int mrk)
        {
            if (mrk > 40)
            {
                _Pass(_Marks);
            }

            else {
                _Fail.Invoke(mrk);
            }
        }

        public void student_Pass(int marks)
        {
            Console.WriteLine($"Passed with {marks}");
        }

        public void student_Fail(int marks)
        {
            Console.WriteLine($"Failed with {marks} ");
        }




    }
}
