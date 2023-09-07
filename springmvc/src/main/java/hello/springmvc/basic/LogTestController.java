package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dev 단계에서는 보통 debug 까지
 * 운영 서버에서는 info 까지
 */
@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = "+ name);

        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info(" info log={}",name);
        log.warn(" warn log={}",name);
        log.error("error log={}",name);

        return "ok";
    }
}
