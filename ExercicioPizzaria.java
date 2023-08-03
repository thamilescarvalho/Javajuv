public class ExercicioPizzaria {
    
    public static void main(String[] args) {
        
        ExercicioPizzaCalabresa pizzaCalabresa = new ExercicioPizzaCalabresa();

        ExercicioForno forno = new ExercicioForno();
        forno.forno(pizzaCalabresa);

        ExercicioPizzaPortuguesa pizzaPortuguesa = new ExercicioPizzaPortuguesa();

        forno.forno(pizzaPortuguesa);

    }

}
