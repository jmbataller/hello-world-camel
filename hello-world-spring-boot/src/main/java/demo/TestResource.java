package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jmbataller on 22/01/15.
 */
@Controller
@RequestMapping("/demo")
public class TestResource {

    @RequestMapping(method= RequestMethod.GET, value = "/{id}")
    public @ResponseBody String getCustomer(@PathVariable(value="id") String id) {
        return id;
    }
}
