package modul12;

import java.util.ArrayList;

public class LineSummation {
    private ArrayList<Integer> operands;
    private int result;

    public LineSummation(){
        operands = new ArrayList<>();
        result = 0;

    }

    public ArrayList<Integer> getOperands() {
        return operands;
    }

    public void setOperands(ArrayList<Integer> operands) {
        this.operands = operands;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
