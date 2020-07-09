package Demo;

public class TestNV {
    public static void main(String[] args) {
        Nhanvien nhanvien = new Nhanvien(5,"Tung", "Giam doc");
        System.out.println("ID:" + nhanvien.getId() + "-" + "Ten:" + nhanvien.getTen() + "-" + "Phong:" + nhanvien.getPhong());
        nhanvien.setId(3);
        System.out.println("ID:" + nhanvien.getId() + "-" + "Ten:" + nhanvien.getTen() + "-" + "Phong:" + nhanvien.getPhong());
    }
}
