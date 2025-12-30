using Microsoft.AspNetCore.Mvc;

namespace praxMVC.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
