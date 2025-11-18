abstract class Printer{
    public String model;
    public int printedCount;
    public int availableCount;

    public Printer(String model, int printedCount, int availableCount){
        this.model = model;
        this.printedCount = printedCount;
        this.availableCount = availableCount;
    }

    public abstract boolean print();

}