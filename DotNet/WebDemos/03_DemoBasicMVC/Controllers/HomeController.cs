using Microsoft.AspNetCore.Mvc;

namespace _03_DemoBasicMVC.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
