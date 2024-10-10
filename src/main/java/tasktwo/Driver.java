package tasktwo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Driver {
  public static void main(String[] args) {

    String[] files = {
      "CSC305_Lab_2/input1.json", "CSC305_Lab_2/input2.json", "CSC305_Lab_2/input3.json"
    };

    List<Dignitary> dignitaries = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();

    for (String file : files) {
      try {
        Dignitary dignitary = mapper.readValue(new File(file), Dignitary.class);
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
