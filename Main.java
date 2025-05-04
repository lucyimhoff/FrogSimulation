public class Main{
    public static void main(String[] args){
        FrogSimulation test1 = new FrogSimulation(24, 5);
        System.out.println(test1.simulate());
        System.out.println(test1.runSimulations(4));
    }
}