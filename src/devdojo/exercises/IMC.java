package devdojo.exercises;

public enum IMC {
    Abaixo_do_peso(null),
    Peso_ideal("parabéns"),
    Levemente_acima_do_peso(null),
    Obesidade_grau_I(null),
    Obesidade_grau_II("severa"),
    Obesidade_grau_III ("mórbida");

    private String description;

    IMC(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
