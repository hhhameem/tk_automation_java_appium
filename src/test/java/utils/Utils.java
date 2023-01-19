package utils;

import com.github.javafaker.Faker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Utils {
    public static String randomPhoneNumber() {
        Random rnd = new Random();
        return "019" + (10000000 + rnd.nextInt(90000000));
    }
    public static String randomShopName() {
        Faker faker = new Faker();
        return faker.name().firstName() + " " + faker.company().suffix();
    }
    public static String randomCustomerName() {
        Faker faker = new Faker();
        return faker.name().fullName();
    }
    public static void saveJsonList(String phoneNumber, String shopName) throws IOException, ParseException {
        String fileName="./src/test/resources/Users.json";
        JSONParser parser=new JSONParser();
        Object obj= parser.parse(new FileReader(fileName));
        JSONArray jsonArray= (JSONArray) obj;

        JSONObject userObject=new JSONObject();
        userObject.put("phone",phoneNumber);
        userObject.put("shop",shopName);
        jsonArray.add(userObject);

        FileWriter file=new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
    }

    public static JSONArray readJSONList() throws IOException, ParseException {
        String fileName="./src/test/resources/Users.json";
        JSONParser parser=new JSONParser();
        Object object= parser.parse(new FileReader(fileName));
        return (JSONArray) object;

    }
//    public static String getLastRegisteredUserPhone() throws IOException, ParseException {
//        List usersList = readJSONList();
//        JSONObject userObj= (JSONObject) usersList.get(usersList.size()-1);
//        String phoneNumber = (String) userObj.get("phone");
//        return phoneNumber;
//    }
    public static String getLastRegisteredUserShop() throws IOException, ParseException {
        List usersList = readJSONList();
        JSONObject userObj= (JSONObject) usersList.get(usersList.size()-1);
        return (String) userObj.get("shop");
    }

    public static void main(String[] args) {
//        String myText = "\"Mr. Raymundo Torp\"- কে টালিতে যোগ করা হয়েছে।";
        String name = "KJdhgksdjggv";

        name = "\"" + name + "\"";
        String expected = name.concat("- কে টালিতে যোগ করা হয়েছে।");
        System.out.println("Expected "+expected);
//        System.out.println(myText.contains("টালিতে যোগ করা হয়েছে।"));
    }
}
