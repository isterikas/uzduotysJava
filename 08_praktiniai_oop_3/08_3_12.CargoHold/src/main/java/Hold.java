import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
    }
    private int weightOfAll(){
        int weightOfAll = 0;
        for (Suitcase suitcase:suitcases){
            weightOfAll+= suitcase.totalWeight();
        }
        return weightOfAll;
    }
    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight()+weightOfAll()<=maximumWeight){
            suitcases.add(suitcase);
        }
    }
    public String toString(){
        String number = " suitcase (";
        if (suitcases.size()>1) number = " suitcases (";
        return suitcases.size() +number+weightOfAll()+" kg)";
    }

    public void printItems(){
        for (Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }

}
