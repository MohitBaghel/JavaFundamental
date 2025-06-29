public class jun28 {
    
    public static void main(String[] args) {
        Students s1 = new Students(); // new object
        System.out.println("************");
        s1.admission(1,"usha");
        s1.setmarks(93);
        s1.setGrade();
        s1.markSheet();


        Students s2 = new Students();
        System.out.println("************");
        s2.admission(2,"dudekula");
        s2.setmarks(83);
        s2.setGrade();
        s2.markSheet();


        Students s3 = new Students();
        System.out.println("************");
        s3.admission(3,"mohit");
        s3.setmarks(23);
        s3.setGrade();
        s3.markSheet();


        Students s4 = new Students();
        System.out.println("************");
        s4.admission(4,"xyz");
        s4.setmarks(53);
        s4.setGrade();
        s4.markSheet();
        

    
    }
}



class Students{
    int rollNo;
    String name ;
    int marks;
    char grade;



    void admission(int rn , String nm){

        rollNo = rn;
        name = nm;

    }

    void setmarks(int mrk){
       marks = mrk; 
       

    }


    void setGrade(){
        if(marks > 90){
            grade = 'A';
        } else if(marks > 80){
            grade = 'B';
        }else if(marks > 70){
            grade = 'c';
        }else if(marks > 60){
            grade = 'D';
        }else if(marks > 50){
            grade = 'E';
        } else {
            grade = 'F';
        }
    }


    void markSheet(){
        System.out.println("Roll no: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("Grade:  "+grade);

    }
}


// this: 

// Banking system : 
// library system

// method area: used to call static variable
// stack
// heap 
// pc register
// native area: 

