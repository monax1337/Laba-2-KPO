

public class main {
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", 2.99, 100);
        Flower daisy = new Flower("Daisy", 1.99, 70);
        Flower tulip = new Flower("Tulip", 0.99, 40);

        

        Flower[] flowers = {tulip, tulip, tulip, daisy};
        Bouquet bouquet = new Bouquet(flowers);

        FlowerShop shop = new FlowerShop();
        shop.addBouquet(bouquet);
        shop.addBouquet(bouquet);
        System.out.println("Цена = "+bouquet.getPrice());

        System.out.println("Вес = "+bouquet.getWeight());
    }
}
