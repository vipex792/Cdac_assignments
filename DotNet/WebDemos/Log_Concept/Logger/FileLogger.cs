namespace Log_Concept.Logger;

public class FileLogger
{
    private static FileLogger _logger = new FileLogger();
    private FileLogger()
    {

    }
    public static FileLogger CurrentLogger
    {

        get { return _logger; }
    }
    public void Log(string message)
    {
        string path = @"C:\Users\IET\Desktop\Tushar-Tanishqa\DotNet_Data\WebDemos\Log_Concept\Data\log.txt";

        FileStream fs = null;
        if (File.Exists(path))
        {
            fs = new FileStream(path, FileMode.Append, FileAccess.Write);
        }
        else
        {
            fs = new FileStream(path, FileMode.Create, FileAccess.Write);
        }

        StreamWriter writer = new StreamWriter(fs);
        writer.WriteLine($"--Logged At, {DateTime.Now.ToString()} - {message}");

        writer.Close();
        fs.Close();
    }
}
