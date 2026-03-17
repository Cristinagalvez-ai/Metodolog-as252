package matcomp.e1.ejerciciosclases.cuaderno3;

public class TestPerson {
    public static void main(String[] args) {

        //probar crear un objeto Person y su toString()
        Person p1 = new Person("Cristina","Madrid");
        System.out.println(p1);

        //probar crear un objeto Student y su toString()
        Student student1 = new Student("Águeda","Barcelona","Matemáticas",2,1500);
        System.out.println(student1);

        //probar cambiar la dirección de la superclase Person en la subclase Student
        student1.setAddress("Valencia");

        //probar ahora cambiar la matrícula
        student1.setFee(1800);

        //probar getters de Student
        System.out.println("Programa de student1: " + student1.getProgram());
        System.out.println("Año de student1: " + student1.getYear());
        System.out.println("Matrícula de student1: " + student1.getFee());

        System.out.println("student1 nuevo: " + student1);

        //probar crear un objeto Staff y su toString()
        Staff staff1 = new Staff("Sara","Sevilla","UAH",2500 );
        System.out.println(staff1);

        //probar cambiar el salario de la superclase Person en la subclase Staff
        staff1.setPay(3000);

        //probar getters de Staff
        System.out.println("Colegio de staff1: " + staff1.getSchool());
        System.out.println("Salario de staff1: " + staff1.getPay());

        System.out.println("staff1 nuevo: " + staff1);
    }
}
