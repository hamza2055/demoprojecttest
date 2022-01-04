public class Student {
        private static int id =  10;
     private String name;
     private  String SSN;
     private  String email;
     private  String userId;
    private  String phone;
    private  String city;
    private  String state;




    public  Student(String  name, String SSN){
        this.name = name;
        this.SSN = SSN;
        id++;
        GenerateEmail();
        GenerateUserId();


    }


    public  void GenerateEmail(){
        email =  this.name + "@Student.com";
    }


    public  void GenerateUserId(){
        int randomNum = (int) Math.random() * 10000;
        userId = id + "" + randomNum + SSN.substring(4);
    }


    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return  this.phone;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return  this.city;
    }

    public void setstate(String state){
        this.state = state;
    }

    public String getState(){
        return  this.state;
    }





    public  void enroll(){
        System.out.println("Enroll is called");

    }

    public  void pay(){
        System.out.println("Pay is called");

    }

    public  void checkBalance(){
        System.out.println("checkbalance is called");
    }


    public  void showCourses(){
        System.out.println("showCourses is called");

    }

    @Override
    public  String toString(){
        return "Student name is " + name  + "Student sity  is " + city  + "Student id is " + userId + "Student email is " + email   ;
    }
}
