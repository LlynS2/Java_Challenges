package Llyn.TargetSistemas.Challenges;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MonthlyPayment {

    private double sp     = 67.83643;
    private double rj     = 36.67866;
    private double mg     = 29.22988;
    private double es     = 27.16548;
    private double others = 19.84953;

    private double total     = getSp() + getRj() + getMg() + getEs() + getOthers();
    private double perSP     = ((getSp()/getTotal())*100);
    private double perRJ     = ((getRj()/getTotal())*100);
    private double perMG     = ((getMg()/getTotal())*100);
    private double perES     = ((getEs()/getTotal())*100);
    private double perOthers = ((getOthers()/getTotal())*100);

    public void showResultCalculation() {

        System.out.println("Answer  \uD83E\uDDD0 : " );
        System.out.println("Distributor's monthly total " + this.getTotal());
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("➲ Percentage of the São Paulo : " + this.getPerSP());
        System.out.println("➲ Percentage of the Rio de Janeiro : " + this.getPerRJ());
        System.out.println("➲ Percentage of the Minas Gerais : " + this.getPerMG());
        System.out.println("➲ Percentage of the Espirito Santo : " + this.getPerES());
        System.out.println("➲ Percentage of the Other : " + this.getOthers());
    }
}