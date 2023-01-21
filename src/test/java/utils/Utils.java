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
    public static void saveJsonList(String phoneNumber, String name, String fileToSave) throws Exception {
        String fileName="./src/test/resources/"+ fileToSave +".json";
        JSONParser parser=new JSONParser();
        Object obj= parser.parse(new FileReader(fileName));
        JSONArray jsonArray= (JSONArray) obj;

        JSONObject userObject=new JSONObject();
        if (fileToSave == "users") {
            userObject.put("phone",phoneNumber);
            userObject.put("shop",name);
        } else if (fileToSave == "customers") {
            userObject.put("phone",phoneNumber);
            userObject.put("name",name);
        } else {
            throw new Exception("file not found");
        }
        jsonArray.add(userObject);

        FileWriter file=new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
    }

    public static JSONArray readJSONList(String fileToRead) throws IOException, ParseException {
        String fileName="./src/test/resources/"+ fileToRead +".json";
        JSONParser parser=new JSONParser();
        Object object= parser.parse(new FileReader(fileName));
        return (JSONArray) object;

    }
    public static String getLastRegisteredUserPhone(String fileToRead) throws IOException, ParseException {
        List usersList = readJSONList(fileToRead);
        JSONObject userObj= (JSONObject) usersList.get(usersList.size()-1);
        String phoneNumber = (String) userObj.get("phone");
        return phoneNumber;
    }
    public static String getLastRegisteredUserShopName(String fileToRead) throws IOException, ParseException {
        List usersList = readJSONList(fileToRead);
        JSONObject userObj= (JSONObject) usersList.get(usersList.size()-1);
        return (String) userObj.get("shop");
    }
    public static String getLastAddedCustomerName(String fileToRead) throws IOException, ParseException {
        List usersList = readJSONList(fileToRead);
        JSONObject userObj= (JSONObject) usersList.get(usersList.size()-1);
        return (String) userObj.get("name");
    }

    public static void main(String[] args) {
        String myText = "\"Mr. Raymundo Torp\"- কে টালিতে যোগ করা হয়েছে।";
        String name = "Mr. Raymundo Torp";

        name = "\"" + name + "\"";
        String expected = name.concat("- কে টালিতে যোগ করা হয়েছে।");
        System.out.println("Expected "+expected);
        System.out.println("does contain "+ myText.contains("টালিতে যোগ করা হয়েছে।"));

    }
}
