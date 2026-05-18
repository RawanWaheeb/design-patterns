package creational.Builder;

public class ComputerDirector {

    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }


}
