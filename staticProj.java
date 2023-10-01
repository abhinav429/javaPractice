import java.util.Scanner;
class Farmer{
        int pa;
        float td;
        static float ri;
        float si;
        static{
            ri=4.5f;
        }
        void input(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Principal Amount: ");
            pa=sc.nextInt();
            System.out.println("Time required: ");
            td=sc.nextFloat();
            sc.close();
        }
        void compute(){
            si=(pa*ri*td)/100f;
        }
        void disp(){
            System.out.println(si+" is the simple interest");
        }

    }
    
public class staticProj {
    public static void main(String args[]){
        Farmer f1=new Farmer();
        Farmer f2=new Farmer();
        f1.input();
        f1.compute();
        f1.disp();
        f2.input();
        f2.compute();
        f2.disp();



    }
}
