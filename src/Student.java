public class Student {
    private String name;
    private String age;
    private int ID;
    public Student(){} // 创建方法
    public  void setName(String name){
        this.name=name;
    }
    public void setAge(String age){
        this.age=age;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public String getAge(){return  age;}
    public String getName(){
        return  name;
    }
    public int getID(){return  ID;}

}