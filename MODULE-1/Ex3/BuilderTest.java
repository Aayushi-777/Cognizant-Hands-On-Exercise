public class BuilderTest {
    public static void main(String args[]){
        Computer gamingPC=new Computer.Builder()
                .setCPU("Intell i9")
                .setRAM(32)
                .setStorage(1000)
                .setGraphicCard(true)
                .setBluetooth(true)
                .build();
        Computer officePC=new Computer.Builder()
                .setCPU("Intell i5")
                .setRAM(16)
                .setStorage(512)
                .setGraphicCard(false)
                .setBluetooth(true)
                .build();
        System.out.println("Gaming PC");
        gamingPC.display();
        System.out.println("Office PC");
        officePC.display();
    }
}
