package Main;

public class ClothingItem {
    public String type;

    public static void main(String[] args) {
        ClothingItem item = new ClothingItem();
        item.type = "Hat";
        item.displayITem();
    }

    private void displayITem(){
        System.out.println("This is a " + this.type);
    }
}
