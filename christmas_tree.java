public class ChristmasTree {
    public static void main(String[] args) {
        int inva = 5;

        for (int t = 0; t < inva; t++) { // จำนวนยอดที่ต้องการ
            int temp = inva; // เก็บค่าที่ต้องการไว้ใช้
            int gg = inva - t; // เอาค่าจำนวนยอดที่ต้องการ ลบด้วยจำนวนยอดที่ตอนนี้สร้างแล้ว
            int num = temp - gg; // ยอดที่เหลือที่ต้องสร้าง
            num = num + 1; // เอายอดที่เหลือมาบวกด้วย 1 
            for (int i = -1; i < num; i++) { // จำนวนแถวใน 1 ยอด
                int iAdjusted = i + 1; // เพิ่มความสูงของยอด 1 แถว
                for (int k = 0; k < inva - iAdjusted; k++) { // สร้างช่องว่าง
                    System.out.print(" ");
                }
                for (int j = 0; j < iAdjusted; j++) { // สร้างใบแถบซ้ายถึงกลาง
                    System.out.print("*");
                }
                for (int j = 0; j < iAdjusted + 1; j++) { // สร้างใบแถบขวา
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // ฐานต้น
        for (int o = 0; o < num; o++) { // ช่องว่างสำหรับฐานต้น
            System.out.print(" ");
        }
        System.out.println("|");
        for (int y = 0; y < num; y++) { // จำนวนฐาน ซ้าย
            System.out.print("=");
        }
        System.out.print("V");
        for (int r = 0; r < num; r++) { // จำนวนฐาน ขวา
            System.out.print("=");
        }
    }
}
