using Microsoft.AspNetCore.Mvc;

namespace _04_DemoConventialRouting.Controllers
{
    public class DemoController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        //public int Index(int id)
        //{
        //    return id;
        //}
    }
}
