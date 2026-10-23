class ArryaExample {

    void demoArrays(){
        int [] age = new int [3];
        float [] weight = new float [3];
        String [] names = {"oshi","tanu","ram"};

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
     // ages[0]=34;
        // ages[1]=12;
        // ages[2]=22;

        // weight [0]=33.2f;
        // weight [1]= 23.8f;

        // names[0]="oshi";
        // names[2]= "Radha";
        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);


   // }

//}
public class mai {
    public static void main(String[] args) {
        ArryaExample obj = new ArryaExample();
        obj.demoArrays();
    }

}


