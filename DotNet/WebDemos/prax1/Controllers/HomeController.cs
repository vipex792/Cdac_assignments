using Microsoft.AspNetCore.Mvc;

namespace prax1.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();

        }
    }
}
