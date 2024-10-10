package taskone;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Driver {

  public static void main(String[] args) {
    String[] files = {
      "CSC305_Lab_2/input1.json", "CSC305_Lab_2/input2.json", "CSC305_Lab_2/input3.json"
    };
    List<Dignitary> dignitaries = new ArrayList<>();

    for (String file : files) {
      try {
        FileReader reader = new FileReader(file);
        JSONTokener tokener = new JSONTokener(reader);
        JSONObject jsonObject = new JSONObject(tokener);

        String name = jsonObject.getString("name");

        List<Award> awards = new ArrayList<>();
        JSONArray awardsArray = jsonObject.getJSONArray("awards");

        for (int i = 0; i < awardsArray.length(); i++) {
          JSONObject award = awardsArray.getJSONObject(i);
          String awardName = award.getString("name");
          int awardYear = award.getInt("year");
          awards.add(new Award(awardName, awardYear));
        }

        List<String> knownFor = new ArrayList<>();
        JSONArray knownForArray = jsonObject.getJSONArray("knownFor");
        for (int i = 0; i < knownForArray.length(); i++) {
          knownFor.add(knownForArray.getString(i));
        }

        Dignitary dignitary = new Dignitary(name, awards, knownFor);
        dignitaries.add(dignitary);

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    for (Dignitary dignitary : dignitaries) {
      System.out.println(dignitary);
    }
  }
}
