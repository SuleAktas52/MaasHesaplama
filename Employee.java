package MaasHesaplayicisi;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

   public double tax(){
        double taxResult=0.0;
        if (this.salary >= 1000){
            taxResult=this.salary*3/100;
        }
        return taxResult;
   }

   public double bonus(){
        double bonusResult=0.0;
        if (this.workHours > 40 ) {
            bonusResult = (this.workHours - 40) * 30;
        }
        return bonusResult;
   }

   public double raiseSalary(){
        int year=2022-this.hireYear;
        double maasArtis=0.0;
        if (year <= 9){
            maasArtis=this.salary*5/100;
        }
        else if (9 < year && year <= 19){
            maasArtis=this.salary*10/100;
        }
        else {
            maasArtis=this.salary*15/100;
        }
        return maasArtis;
   }

   void print(){
       System.out.println("ADI: " + this.name);
       System.out.println("MAASI: " + this.salary);
       System.out.println("CALISMA SAATI: " + this.workHours);
       System.out.println("BASLANGIC YILI: " + this.hireYear);
       System.out.println("VERGI: " + tax());
       System.out.println("BONUS: " + bonus());
       System.out.println("MAAS ARTISI: " + raiseSalary());
       System.out.println("VERGI VE BONUS ILE BIRLIKTE MAAS: " + (this.salary-tax()+bonus()));
       System.out.println("TOPLAM MAAS: " + (this.salary+raiseSalary()-tax()+bonus()));
   }
}
