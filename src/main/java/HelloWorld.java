import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) throws JsonProcessingException {
        get("/hello", (req, res) -> "Hello Iso");

        ObjectMapper mapper=new ObjectMapper();
        ResponseObject var=new ResponseObject("Ok","Im alive","0.0.1");
        get("/status", (req, res) -> mapper.writeValueAsString(var));

    }

}