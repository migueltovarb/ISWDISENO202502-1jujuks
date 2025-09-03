package ejercicioPractica;

import java.util.Scanner;

public class TiendaVirtual {
    // Constantes para descuentos
    public static final double DESCUENTO_ROPA = 0.05;       // 5%
    public static final double DESCUENTO_TECNOLOGIA = 0.10; // 10%
    public static final double DESCUENTO_ALIMENTOS = 0.02;  // 2%
    public static final double DESCUENTO_ADICIONAL = 0.05;  // 5% si supera $500.000
    public static final double UMBRAL_DESCUENTO = 500000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Preguntar número de productos
        System.out.print("Ingrese el número de productos a comprar (mínimo 1): ");
        int n = sc.nextInt();

        while (n < 1) {
            System.out.print("Debe ingresar al menos 1 producto. Intente de nuevo: ");
            n = sc.nextInt();
        }

        // 2. Vectores para almacenar la información
        String[] nombres = new String[n];
        int[] tipos = new int[n];
        double[] precios = new double[n];

        double totalSinDescuento = 0;
        double totalConDescuento = 0;

        // 3. Ingresar productos con ciclo while
        int i = 0;
        while (i < n) {
            sc.nextLine(); // limpiar buffer
            System.out.print("\nIngrese el nombre del producto " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Ingrese el tipo (1: Ropa, 2: Tecnología, 3: Alimentos): ");
            tipos[i] = sc.nextInt();

            System.out.print("Ingrese el precio del producto: ");
            precios[i] = sc.nextDouble();

            double descuento = 0;
            switch (tipos[i]) {
                case 1: // Ropa
                    descuento = DESCUENTO_ROPA;
                    break;
                case 2: // Tecnología
                    descuento = DESCUENTO_TECNOLOGIA;
                    break;
                case 3: // Alimentos
                    descuento = DESCUENTO_ALIMENTOS;
                    break;
                default:
                    System.out.println("Tipo no válido, se asume sin descuento.");
                    descuento = 0;
            }

            // Acumular totales
            totalSinDescuento += precios[i];
            totalConDescuento += precios[i] - (precios[i] * descuento);

            i++;
        }

        // 4. Descuento adicional si supera el umbral
        if (totalConDescuento > UMBRAL_DESCUENTO) {
            double adicional = totalConDescuento * DESCUENTO_ADICIONAL;
            totalConDescuento -= adicional;
            System.out.println("\nSe aplicó un descuento adicional del 5% por superar $" + UMBRAL_DESCUENTO);
        }

        // 5. Mostrar resultados
        System.out.println("\n========== RESUMEN DE COMPRA ==========");
        for (int j = 0; j < n; j++) {
            System.out.println("- " + nombres[j] + " | Precio: $" + precios[j] + " | Tipo: " + tipos[j]);
        }

        double ahorro = totalSinDescuento - totalConDescuento;
        System.out.println("\nTotal sin descuento: $" + totalSinDescuento);
        System.out.println("Total con descuento: $" + totalConDescuento);
        System.out.println("Ahorro total: $" + ahorro);

        sc.close();
    }
}
