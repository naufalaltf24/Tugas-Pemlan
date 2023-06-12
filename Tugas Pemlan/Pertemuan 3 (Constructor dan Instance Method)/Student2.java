public class Student2 {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int jumlah = 0;

    public Student2() {
        name = "Dodo";
        address = "Bogor";
        age = 0;
        jumlah++;
    }

    public Student2(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
    }

    public Student2(double math, double english, double science) {
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    public void setAverage(double avg) {
        average = avg;
    }

    public double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    public boolean statusAkhir() {
        if (average >= 61) {
            return true;
        } else {
            return false;
        }
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("memiliki nilai rata-rata " + getAverage());

        if (statusAkhir()) {
            System.out.println("Lulus");
        } else {
            System.out.println("Remidi");
        }
    }

    public static void jumlahObjek() {
        System.out.println("Jumlah objek yang telah dibuat: " + jumlah);
    }
}
