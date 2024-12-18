import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping
    public ModelAndView getGreeting() {
        ModelAndView mav = new ModelAndView("greeting");
        return mav;
    }
}
