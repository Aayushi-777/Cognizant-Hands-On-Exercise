public class Computer{
    private String cpu;
    private int ram;
    private int storage;
    private boolean graphicCard;
    private boolean bluetooth;
    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.storage=builder.storage;
        this.graphicCard=builder.graphicCard;
        this.bluetooth=builder.bluetooth;
    }
    public void display(){
        System.out.println("CPU : "+cpu);
        System.out.println("RAM : "+ram);
        System.out.println("Storage : "+storage);
        System.out.println("Graphics Card : "+graphicCard);
        System.out.println("Bluetooth : "+bluetooth);
        System.out.println();
    }
    public static class Builder{
        private String cpu;
        private int ram;
        private int storage;
        private boolean graphicCard;
        private boolean bluetooth;
        public Builder setCPU(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder setRAM(int ram){
            this.ram=ram;
            return this;
        }
        public Builder setStorage(int storage){
            this.storage=storage;
            return this;
        }
        public Builder setGraphicCard(boolean graphicCard){
            this.graphicCard=graphicCard;
            return this;
        }
        public Builder setBluetooth(boolean bluetooth){
            this.bluetooth=bluetooth;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}