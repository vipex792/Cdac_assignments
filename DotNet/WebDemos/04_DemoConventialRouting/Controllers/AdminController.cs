using Microsoft.AspNetCore.Mvc;

namespace _04_DemoConventialRouting.Controllers
{
    public class AdminController : Controller
    {
        // URL: /Admin/Index?nm=Hugh Jackman


        //as here string is passed as nm so we need to pass data through string query parameters for to display in screen
        //public string Index(string nm, string u)
        //{
        //    //return nm;
        //    return $"UserName: {nm}, Password: {u}";
        //}


        public string Index(string nm)
        {
            return nm;
        }


        //mine method Trying to see if Admin/Index happens or not
        //public IActionResult Index()
        //{
        //    return View();
        //}
    }
}
