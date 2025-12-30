using _03_DemoBasicMVC;
using Microsoft.AspNetCore.Mvc.ViewEngines;

namespace _03_DemoBasicMVC

{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            builder.Services.AddControllersWithViews();
            var app = builder.Build();

            //app.MapGet("/", () => "Hello World!");
            app.MapDefaultControllerRoute();
            app.Run();
        }
    }
}
