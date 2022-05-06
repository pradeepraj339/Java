import java.util.*;
// Creating Employee Class 
class Employee{
    private int empno;
    private String name;
    private int salary;
    
    Employee(int empno, String name, int salary){
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }
    public int getEmno(){
        return empno;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public String getEname(){
        return name;
    }
    
    public String toString(){
        return empno+" "+name+" "+salary;
    }
}


//Creating Main method Class
public class CRUDCollection {
    public static void main(String args[]) {
        //Creating collection 
        List<Employee> c = new ArrayList<Employee>();
        
      Scanner s = new Scanner(System.in); // for int
      Scanner s1 = new Scanner(System.in); // for Strinmg
      int ch;
      do{
          System.out.println("1.INSERT");
          System.out.println("2.DISPLAY");
          System.out.println("3.SEARCH");
          System.out.println("4.DELETE");
          System.out.println("5.UPDATE");
          System.out.println("Enter your Choice : ");
          ch = s.nextInt();
          
        switch(ch){
            case 1:
                System.out.println("Enter Empno");
                int eno = s.nextInt();
                
                System.out.println("Enter EmpName");
                String ename = s1.nextLine();
                
                System.out.println("Enter Salary");
                int salary = s.nextInt();
                c.add(new Employee(eno, ename, salary));
                break;
                
            case 2:
                System.out.println("----------------------------");
                //Creating Iterator to Traverse Collection
                Iterator<Employee> i = c.iterator();
                while(i.hasNext()){
                    Employee e = i.next();
                    System.out.println(e);
                }
                System.out.println("------------------------------");
                break;

            case 3:
                boolean found =false;
                System.out.println("Enter Empno to Search : ");
                int empno = s.nextInt();
                System.out.println("------------------------------");
                i = c.iterator();
                while(i.hasNext()){
                    Employee e = i.next();
                    if(e.getEmno() == empno){
                        System.out.println(e);
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Record Not Found");
                }
                System.out.println("------------------------------");
                break;

            case 4:
                found =false;
                System.out.println("Enter Empno to Delete : ");
                empno = s.nextInt();
                System.out.println("------------------------------");
                i = c.iterator();
                while(i.hasNext()){
                    Employee e = i.next();
                    if(e.getEmno() == empno){
                        i.remove();
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Record Not Found");
                }else{
                    System.out.println("Record is Deleted Successfully");
                }
                System.out.println("------------------------------");
                break;

            case 5:
                found =false;
                System.out.println("Enter Empno to Update : ");
                empno = s.nextInt();
                System.out.println("------------------------------");
                ListIterator<Employee> li = c.listIterator();
                while(li.hasNext()){
                    Employee e = li.next();
                    if(e.getEmno() == empno){
                        System.out.println("Enter new Name : ");
                        ename = s1.nextLine();

                        System.out.println("Enter new Salary : ");
                        salary = s.nextInt();
                        li.set(new Employee(empno, ename, salary))
;                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Record Not Found");
                }else{
                    System.out.println("Record is Updated Successfully");
                }
                System.out.println("------------------------------");
                break;    
        }
      }while(ch!=0);
    }
}
