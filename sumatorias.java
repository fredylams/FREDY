import javax.swing.JOptionPane;
public class NewClass {
    public static void main(String[] args) {
        int o, y = 0;
        for (o = 0; y != 1; o++) {
            y = JOptionPane.showConfirmDialog(null, " INICIAR SUMATORIAS ");
            if (y == 0) {
                int i = 0;
                String[] sumatorias = {"3n^2+5n+7", "i^2+3", "2n^3-0.66n+7"};
                String numero1 = JOptionPane.showInputDialog("valor inicial");
                String limite = JOptionPane.showInputDialog("valor final");
                int lim = Integer.parseInt(limite);
                int num1 = Integer.parseInt(numero1);
                double total = 0;
                double ecuacion = 0;
                String opc = (String) JOptionPane.showInputDialog(null, "SELECCIONE LA OPCION SUMARIA A RESOLVER", "NOTACION SUMATORIA",
                        JOptionPane.DEFAULT_OPTION, null, sumatorias, sumatorias[0]);
                for (i = num1; i <= lim; i++) {
                    int d = 0;
                    double[] suma = {((3 * Math.pow(i, 2)) + (5 * (i)) + 7), ((Math.pow(i, 2)) + 3 * (i)), (2 * (Math.pow(i, 3))) - ((2 / 3) * (i)) + 7};
                    if (null != opc) {
                        switch (opc) {
                            case "3n^2+5n+7":
                                d = 0;
                                break;
                            case "i^2+3":
                                d = 1;
                                break;
                            case "2n^3-0.66n+7":
                                d = 2;
                                break;
                            default:
                                break;
                        }
                    }
                    ecuacion = suma[d];
                    total = total + ecuacion;
                }
                System.out.println(" " + opc + " = " + total);
                JOptionPane.showMessageDialog(null, " "+opc+" ="+total);
            } else {
                JOptionPane.showMessageDialog(null, "FIN DEL PROGRAMA");
            }
        }

    }

}
