import java.util.Scanner;

/**
 * Factory Robot Hazard Analyzer
 *
 * UC3: Calculate Hazard Risk Score (No Validation)
 *
 * Program calculates hazard risk assuming inputs are valid.
 *
 * @author Adithya
 * @version 3.0
 */
public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Factory Robot Hazard Analyzer");

        System.out.println("Enter Arm Precision (0.0 - 1.0):");
        double armPrecision = scanner.nextDouble();

        System.out.println("Enter Worker Density (1 - 20):");
        int workerDensity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
        String machineryState = scanner.nextLine();

        double machineRiskFactor = 0;

        if (machineryState.equals("Worn")) {
            machineRiskFactor = 1.3;
        } else if (machineryState.equals("Faulty")) {
            machineRiskFactor = 2.0;
        } else if (machineryState.equals("Critical")) {
            machineRiskFactor = 3.0;
        }

        double hazardRisk =
                ((1.0 - armPrecision) * 15.0)
                        + (workerDensity * machineRiskFactor);

        System.out.println("Robot Hazard Risk Score: " + hazardRisk);
    }
}
