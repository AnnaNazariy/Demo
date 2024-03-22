import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @GetMapping("/")
    public String home(Model model) {
        String message = "Це демонстрація Spring Boot і Thymeleaf";
        List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        model.addAttribute("message", message);
        model.addAttribute("items", items);
        return "index";
    }
}
