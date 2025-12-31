using Microsoft.AspNetCore.Http;
using System.Threading.Tasks;

namespace _02_DemoEmptyTemplate
{
    public class Program
    {
        public static async Task Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            var app = builder.Build();


            //app.MapGet("/", () => "Hello World!");



            #region app. MAP. GET , POST, DELETE, 
            //app.MapGet("/", () => "GET: <h1>Hello World!</h1>");
            //app.MapPost("/", () => "Post: Hello World!");
            //app.MapPut("/", () => "Put: Hello World!");
            //app.MapDelete("/", () => "Delete: Hello World!"); 
            #endregion


            #region app.Run() can not pass http context reference to next app.Run() method .
            //app.Run(async (context) =>
            //{
            //    await context.Response.WriteAsync("Hello Salman Bhai!!");
            //    await context.Response.WriteAsync("\nHappy Birthday Salman Bhai!!");
            //});

            //app.Run(async (context) =>
            //{
            //    await context.Response.WriteAsync("Bye Hugh Jackman!!");
            //});
            #endregion

            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("hellooooooooo");
                await context.Response.WriteAsync("\nHii");
                next(context);

            }
            );


            app.Use(async (context, next) =>
        {
                await context.Response.WriteAsync("\nCaptain America");
                next(context);
                await context.Response.WriteAsync("\HEHEHEHE");
        });

            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("\nBye Bye");
            });

            app.Run(); ///
        }
    }
}
