package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i =1; i<=10; i++){

            int a = i*numberTableToPrint;
            String str1 = Integer.toString(i);
            String str2 =Integer.toString(numberTableToPrint);
            System.out.println(str1 +" x "+str2+" = "+a);
        }
    }
}
