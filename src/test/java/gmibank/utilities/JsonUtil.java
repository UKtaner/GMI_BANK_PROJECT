package gmibank.utilities;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private static ObjectMapper mapper;
    static{
        mapper = new ObjectMapper();// will be created together with class.
    }

    //1.Method: It is used to convert Json Data to Java Object. De-Serialization Method
    public static <T>T  convertJsonToJava(String json, Class<T> cls){


        T javaResult = null;// initialized by null
        //for local variable which is located in method, it needs to be initialized, but for initial/class variable does not need.
        try {
            javaResult = mapper.readValue(json, cls);// using mapper to access methods in ObjectMapper
        } catch (IOException e) {
            System.out.println("Json could not be converted to Java Object " + e.getMessage());
        }

        return javaResult;
    }

    //2.Method: It is used to convert Java Object to Json Data. Serialization Method
    public static String convertJavaToJson(Object obj){

        String jsonResult = null;

        try {
            jsonResult = mapper.writeValueAsString(obj);
        } catch (IOException e) {
            System.out.println("Java Object could not be converted to Json " + e.getMessage());
        }

        return jsonResult;
    }

}
