import java.math.BigDecimal;

public class Task4tax {

    public static void main(String[] args) {

        double netPriceMuratuly = 9.99;
        double vatRateMuratuly = 0.23;
        double grossPriceMuratuly = netPriceMuratuly * (1 + vatRateMuratuly);
        System.out.println("Gross price using double: " + grossPriceMuratuly);
        double totalGrossMuratuly = grossPriceMuratuly * 10000;
        System.out.println("Total gross price for 10000 items using double " + totalGrossMuratuly);
        double totalNetFromGrossMuratuly = totalGrossMuratuly / (1 + vatRateMuratuly);
        System.out.println("Net value calculated back using double: " + totalNetFromGrossMuratuly);


        BigDecimal netPriceBD = new BigDecimal("9.99");
        BigDecimal vatRateBD = new BigDecimal("0.23");
        BigDecimal grossPriceBD = netPriceBD.multiply(BigDecimal.ONE.add(vatRateBD));
        System.out.println("Gross price using BigDecimal: " + grossPriceBD);
        BigDecimal totalGrossBD = grossPriceBD.multiply(new BigDecimal("10000"));
        System.out.println("Total gross price for 10000 items using BigDecimal " + totalGrossBD);
        BigDecimal totalNetBD = totalGrossBD.divide(BigDecimal.ONE.add(vatRateBD));
        System.out.println("Net value calcuated back using BigDecimal: " + totalNetBD);
        System.out.println(" BigDecimal provides more precise financial calculations than doule.");
    }
}
