package AutomaticGroceryListForMyGF;

public class ShoppingList {
    
    private List<String> groceries;

    public void add() {}

    public void remove(int i) {}

    public cleanToString() {
        Strign str = "";
        for (int i = 0; i < groceries.length; i++) {
            str = str + groceries[i] + "\n";
        }
        return str;
    }

    @Override
    public String toString() {
        Strign str = "ShoppingList:\n";
        for (int i = 0; i < groceries.length; i++) {
            str = str + i + ": " + groceries.get(i) + "\n";
        }
        return str;
    }

}
