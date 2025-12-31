using Microsoft.AspNetCore.Mvc;

namespace _04_DemoConventialRouting.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        // URL: /Home/UserCredentials?unm=Hugh Jackman&pwd=1234
        // We are passing parameters using Query String (?)
        public ActionResult<string> UserCredentials(string unm, string pwd)
        {
            //this will return username and password that we will pass in query string
            return $"UserName: {unm}, Password: {pwd}";
        }
    }
}
