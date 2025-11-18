class InkjetPrinter extends Printer{

    public InkjetPrinter (String model,int availableCount){
        super(model,0,availableCount);
    }

    public boolean print(){
        if(availableCount>0){
            printedCount++;
            availableCount--;
            return true;
        }else{
            int i = printedCount+1;
            System.out.println(model+":"+i+"매째 인쇄 실패 - 잉크 부족.");
            return false;
        }

    }

}