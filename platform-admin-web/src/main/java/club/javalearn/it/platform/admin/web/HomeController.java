package club.javalearn.it.platform.admin.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 *
 * @author king-pan
 * Date: 2018/8/13
 * Time: 下午5:16
 * Description: No Description
 */
@RestController
public class HomeController {

    @RequestMapping("/el-index")
    public ModelAndView index() {
        return new ModelAndView("element-index");
    }
}
