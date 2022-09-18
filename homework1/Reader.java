package homework1;

public class Reader{
	
String name;
int age;
char gender = ' ';


public void read(Book book){
    System.out.println("Current page: " + book.currentPage);
    System.out.println("5 pages reader.");
    book.currentPage = book.currentPage + 50;
    System.out.println("New pages: " + book.currentPage);
}
public  String getInfo (){
  String info = ("Reader name:" +name+" Reader age:"+age +" Reader gender:" +gender);
  return info;
}

public char getGender(){
    return gender;
}

public void setGender(char newGender){
    if(newGender == 'F'|| newGender == 'M'){
        gender = newGender;
    }else {
        System.out.println("F or M");
    }

}
}
