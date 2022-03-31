import java.util.ArrayList;
import java.util.List;

public class Recipes {


    protected ArrayList<String[]> recipes = new ArrayList<>();

    public void add(String name, String description) {
        String[] tomb = new String[2];
        tomb[0] = name;
        tomb[1] = description;
        recipes.add(tomb);
    }

    public void delete(String name) {
        for (int i = 0;i < recipes.size(); i++){
            if (recipes.get(i)[0] == name){
                recipes.remove(i);
            }
        }
    }

    public List<String[]> getItems() {
        return recipes;
    }
}
