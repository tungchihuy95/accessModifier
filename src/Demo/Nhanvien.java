package Demo;

public class Nhanvien  {
    private int id;
    private String ten;
    private String phong;

    public Nhanvien(int id, String ten, String phong) {
        this.id = id;
        this.ten = ten;
        this.phong = phong;
    }


    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }
     public String getPhong() {
        return phong;
     }

     public void setId(int id) {
        this.id = id;
     }

     public void setTen(String ten) {
        this.ten = ten;
     }

     public void setPhong(String phong) {
        this.phong = phong;
     }
}
