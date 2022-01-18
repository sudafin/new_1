
import java.util.ArrayList;
import java.util.Scanner;


public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> string=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        Student sb=new Student();
      while(true)
      {
          System.out.println("--------------");
          System.out.println("1、添加学生");
          System.out.println("2、删除学生");
          System.out.println("3、修改学生");
          System.out.println("4、查看全部学生");
          System.out.println("5、退出");
          System.out.println("请输入你的选择");
          System.out.println("--------------");
          int x=sc.nextInt();
          switch(x)
          {
              case 1:
                  sb=new Student();
                  addStudentInformation(sb,string);
                  break;
              case 2:System.out.println("请输入要删除删除学生的序号");
                  int st=sc.nextInt();
                  removeStudentInformation(st,string);
                  System.out.println("删除成功");
                  break;
              case 3:System.out.println("请输入要修改学生的序号");
                  sb=new Student();
                  int sk=sc.nextInt();
                  modifyStudentInformation(sk,sb,string);
                  System.out.println("修改成功");
                  break;
              case 4:
                  viewStudentInformation(string);
                  break;
              case 5:
                  break;
              default:System.out.println("输入序号有误，请重新输入");
                  break;
          }
          if(x==5)
          {
              break;
          }
      }
    }

    public static void addStudentInformation(Student sb, ArrayList<Student> string) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名");
        String name=sc.nextLine();
        System.out.println("请输入年龄");
        String age=sc.nextLine();
        sb.setName(name);
        sb.setAge(age);
        string.add(sb);
        for(int i=0;i< string.size();i++)
        {
            if(string.size()!=1)
            {
                if(string.get(string.size()-1)==string.get(i))
                {
                    removeStudentInformation(string.size()-1,string);
                    System.out.println("有重复信息添加失败，请重新添加");
                    break;
                }
                else System.out.println("添加成功");
            }
            if(string.size()==1)
            {
                System.out.println("添加成功");
            }
        }
    }
    public static void removeStudentInformation(int st,ArrayList<Student> string){
        string.remove(st-1);
    }
    public static void modifyStudentInformation(int sk,Student sb,ArrayList<Student> string){
        Scanner sc=new Scanner(System.in);
        System.out.println("请再一次输入姓名");
        String name=sc.nextLine();
        System.out.println("请再一次输入年龄");
        String age=sc.nextLine();
        sb.setName(name);
        sb.setAge(age);
        string.set(sk-1,sb);
    }
    public static void viewStudentInformation(ArrayList<Student> string){
        System.out.println("……………………………………………………………………");
        for(int i=0;i<string.size();i++)
        {
            Student s=string.get(i);
            s.setID(i+1);
            System.out.println(s.getID()+"  "+s.getName()+"   "+s.getAge());
        }
        System.out.println("……………………………………………………………………");
    }
}