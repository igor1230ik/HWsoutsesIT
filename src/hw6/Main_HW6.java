package hw6;

public class Main_HW6 {

    public static void main(String[] args) {

// Сборка подарка повесу
        Present present = new Present();

        System.out.println("Вес шоколадных конфет: " + present.wChok);
        System.out.println("Вес леденцов: " + present.wLol);
        System.out.println("Вес вафель: " + present.wWaf);
        System.out.println("Необходимый вес подарка: " + present.weightPresents);
        System.out.println("Суммарный вес конфет: " + (present.wChok + present.wLol + present.wWaf));
        System.out.println("Количество конфет в подарке: " + present.total());

// Вывод конфет по содержанию сахара
        present.makePresent();
        double quantitySugar=0.01;
        for(Candie candie:present.getPresent()){
            if (candie.sugare()<=quantitySugar){
                System.out.println(candie.name());
            }
        }




    }
}
