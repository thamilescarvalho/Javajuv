package Aluguel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluguel {
    
    private Imovel imovel;

    private LocalDate dtAluguel;

    private LocalDate dtValidadeAluguel;

    public LocalDate getDtAluguel() {
        return dtAluguel;
    }

    public LocalDate getDtValidadeAluguel() {
        return dtValidadeAluguel;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setDtAluguel(LocalDate dtAluguel) {
        this.dtAluguel = dtAluguel;
    }

    public void setDtValidadeAluguel(LocalDate dtValidadeAluguel) {
        this.dtValidadeAluguel = dtValidadeAluguel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public String toString(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Aluguel: " + getImovel().getEndereco() + " - " + getDtAluguel().format(dtf) + " - " + getDtValidadeAluguel().format(dtf);
    }

}
