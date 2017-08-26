package SuperMario;

import java.util.*;

public class TestDataProvider {
    private static final Map<String, String> inputs = new HashMap<>();

    public TestDataProvider() {
        inputs.put("piranha Princess piranha", "WIN");
        inputs.put("1Up koopa goomba piranha Bowser", "WIN");
        inputs.put("Star Mushroom piranha goomba piranha goomba Princess", "WIN");
        inputs.put(" piranha piranha piranha piranha", "GAME OVER");
        inputs.put("piranha piranha Star goomba goomba Princess", "WIN");
        inputs.put("10 40 koopa goomba 20 30 piranha piranha", "GAME OVER");
    }

    public Map<String, String> getInputs() {
        return inputs;
    }

    }