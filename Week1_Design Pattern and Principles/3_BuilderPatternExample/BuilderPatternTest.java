public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer comp1 = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        Computer comp2 = new Computer.Builder("AMD Ryzen 5", "8GB")
                .setStorage("512GB SSD")
                .setGraphicsCardEnabled(false)
                .setBluetoothEnabled(false)
                .build();

        System.out.println(comp1);
        System.out.println(comp2);
    }
}

