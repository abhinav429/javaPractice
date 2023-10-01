class Student{
        private int age;
        private String name;
        public void show(){
            System.out.println(age+" "+name);
        }
        Student(String name,int age){
            this.name=name;
            this.age=age;

        }
        Student(int age){
            this("navi",38);
            this.age=age;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name; 
        }
    }
public class Encaps {
    public static void main(String args[]){
        Student obj=new Student("Abhi",19);

        Student obj1=new Student(23);

        // obj.setAge(19);
        // obj1.setAge(25);
        // obj.setName("abhi");
        // obj1.setName("navin");
        obj.show();
        obj1.show();
        // System.out.println(obj.getAge());
        // System.out.println(obj1.getAge());
        // System.out.println(obj.getName());
        // System.out.println(obj1.getName());

    }
}

