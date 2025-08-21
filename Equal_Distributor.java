public class Equal_Distributor {
    public static void main(String[]args){
        int totalpens=14;
        int totalstudents=3;

        int penperstudent=totalpens/totalstudents;
        int remainingpens=totalpens%totalstudents;

        System.out.println("The pen per student is "+penperstudent+" and the remaining pen not distributed is "+remainingpens);

    }
    
}