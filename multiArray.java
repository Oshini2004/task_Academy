class ArraysExample {
    void demoArrays(){
        int [] age = new int [5];
        float [] weights = new float[3];
        String [] names = {"oshi","tanu","bhanu"};

        age[0]=34;
        age[1]=12;
        age[2]=45;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
    
}
public class main {
    public static void main(String[] args) {
        ArryaExample obj = new ArryaExample();
        obj.demoArrays();
    }

}


