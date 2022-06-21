import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    public String getString(){
        return "My Name Is Sujan";
    }
}
