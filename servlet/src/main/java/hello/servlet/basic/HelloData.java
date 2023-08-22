package hello.servlet.basic;

import jakarta.servlet.http.HttpServlet;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloData extends HttpServlet {

    private String username;
    private int age;



}
