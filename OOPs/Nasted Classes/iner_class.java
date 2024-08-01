class CPU {
    double price;

    class Processor {
        double core;
        String manufacturer;

        double getCache() {
            return 4.5;
        }
    }

    protected class RAM {
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 3.3;
        }
    }
}

public class iner_class {
    public static void main(String[] args) {
        CPU myCpu = new CPU();
        CPU.Processor processor = myCpu.new Processor();
        CPU.RAM ram = myCpu.new RAM();
        System.out.println("This processor cache is : " + processor.getCache());
        System.out.println("This ram clock speed is : " + ram.getClockSpeed());
    }
}
