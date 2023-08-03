package Pizzaria;
public class Pizzaria {
    
    public static void main(String[] args) {
        
        ExercicioPizzaCalabresa pizzaCalabresa = new ExercicioPizzaCalabresa();

        ExercicioForno forno = new ExercicioForno();
        forno.forno(pizzaCalabresa);

        ExercicioPizzaPortuguesa pizzaPortuguesa = new ExercicioPizzaPortuguesa();

        forno.forno(pizzaPortuguesa);

        ExercicioPizzaQuatroQueijos pizzaQuatroQueijos = new ExercicioPizzaQuatroQueijos();

        forno.forno(pizzaQuatroQueijos);

    }

}
