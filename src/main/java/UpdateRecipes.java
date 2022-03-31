public class UpdateRecipes extends Recipes{


    public void update(String name, String description) {
        for (int i = 0; i < recipes.size(); i++){
            if (recipes.get(i)[0] == name){
                String[] tomb = new String[2];
                tomb[0] = name;
                tomb[1] = description;
                recipes.set(i,tomb);
            }
        }
    }
}
