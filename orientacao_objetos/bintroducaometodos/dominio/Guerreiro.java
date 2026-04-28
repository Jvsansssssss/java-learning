package bintroducaometodos.dominio;

public class Guerreiro {
    private int mana;

    public void setMana(int mana){
        if(mana < 0 || mana > 100){
            System.out.println("Coloque o valor entre 0 a 100.");
            return;
        }else {
            this.mana = mana;
        }
    }
    public int getMana(){
        return this.mana;
    }
    public void ManaStatus(){
        if(mana == 100){
            System.out.println("Você tem " + mana + " de mana");
            System.out.println("Mana total!!!");
        } else if (mana > 50) {
            System.out.println("Você tem " + mana + " de mana");
            System.out.println("Mana Estável.");
        } else if (mana > 0) {
            System.out.println("Você tem " + mana + " de mana");
            System.out.println("Mana baixa... cuidado.");
        } else if (mana == 0){
            System.out.println("Você tem " + mana + " de mana");
            System.out.println("Você não tem mana.");
        }
    }
}
