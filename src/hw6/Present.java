package hw6;

import java.util.ArrayList;

public class Present {
    ArrayList<Candie> present = new ArrayList<Candie>(); //Сам подарок


    Chocolate chocolate = new Chocolate();
    Lollilop lollilop = new Lollilop();
    Waffles waffles = new Waffles();

    double weightPresents = 1.1;

    double persentChocolate = 0.4;
    double persentLollolop = 0.4;
    double persentWaffles = 0.2;


    // Формирование конфет в подарке по весу
    int qChok = sumCandies(chocolate, persentChocolate);
    int qLol = sumCandies(lollilop, persentLollolop);
    int qWaf = sumCandies(waffles, persentWaffles);

    // Вес конфет в подарке
    double wChok = qChok * chocolate.weight();
    double wLol = qLol * lollilop.weight();
    double wWaf = qWaf * waffles.weight();

    // Формирование подарка по весу
// Количество конфет
    int sumCandies(Candie candie, double percent) {

        return (int) (Math.floor(((weightPresents * percent) / candie.weight())));
    }

    int total() {
        return (qChok + qWaf + qLol);
    }

    public void makePresent() {
        // в циклах реализовать добавление в коллекцию (аррейЛист) всех типов конфект (#ноывыйобъект)
        for (int i = 0; i < qChok; i++) {
            present.add(new Chocolate());
        }
        for (int i = 0; i < qLol; i++) {
            present.add(new Lollilop());
        }
        for (int i = 0; i < qWaf; i++) {
            present.add(new Waffles());
        }
    }
    public ArrayList<Candie> getPresent(){
        return present;
    }
}
