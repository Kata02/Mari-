package SuperMario;

import java.util.HashMap;
import java.util.Map;

public class TestGamePlay {
    public static void main(String[] args) {
        TestDataProvider testDataProvider = new TestDataProvider();
        Map<String, String> inputs = testDataProvider.getInputs();

        for (Map.Entry<String, String> entry : inputs.entrySet()) {
            System.out.println("input gameplay: " + entry.getKey());
            System.out.println("Expected outcome: " + entry.getValue() + " \n");

            // TODO: put gameplay logic here
        }
    }
}
