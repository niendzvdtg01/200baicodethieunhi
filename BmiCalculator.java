import java.util.Scanner;

public class BmiCalculator {

    // TODO: dinh nghia enum PhanLoai voi 4 values: GAY, BINH_THUONG, THUA_CAN,
    // BEO_PHI
    // moi value co field String hienThi (ten hien thi tieng Viet ASCII)
    // them static method tuBmi(double bmi) tra ve PhanLoai tuong ung
    public enum BMICategory {
        THIN("THIN", 0, 18.5), NORMAL("NORMAL", 18.5, 25), FAT("FAT", 25, 30),
        OBESITY("OBESITY", 30, Integer.MAX_VALUE);

        private final String BMICategory;
        private final double min;
        private final double max;

        BMICategory(String BMICategory, double min, double max) {
            this.BMICategory = BMICategory;
            this.min = min;
            this.max = max;
        }

        public String getBMICategory() {
            return BMICategory;
        }

        public static BMICategory BMIType(double bmi) {
            for (BMICategory values : values()) {
                if (bmi >= values.min && bmi <= values.max)
                    return values;
            }
            return OBESITY;
        }

    }

    public static double BMICalculate(double weigth, double heigth) {
        return weigth / (heigth * heigth);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap can nang (kg): ");
            double canNang = sc.nextDouble();

            System.out.print("Nhap chieu cao (m): ");
            double chieuCao = sc.nextDouble();

            // TODO: tinh BMI
            double bmi = BMICalculate(canNang, chieuCao);
            // TODO: lay PhanLoai tu BMI
            BMICategory type = BMICategory.BMIType(bmi);
            // TODO: in BMI voi 2 chu so thap phan
            System.out.println("BMI idex: " + String.format("%.2f", bmi));
            // TODO: in phan loai
            System.out.println("BMI Type: " + type);
        }
    }
}
