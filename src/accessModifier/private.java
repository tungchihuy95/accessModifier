package accessModifier;


    //Mô tả
    //Luyện tập với private, public, default, protected
    //
    //Hướng dẫn nộp bài:
    //
    //Up mã nguồn lên github
    //Paste link github vào phần nộp bài
    //Hướng dẫn
    //1. Private
    //Với Private Access Modifier, chỉ có thể truy cập trong lớp.
    //
    //Trong ví dụ này, chúng ta tạo hai lớp A và Simple. Lớp A chứa thuộc tính và phương thức private. Chúng ta sẽ truy cập các thành phần này từ bên ngoài lớp, do đó sẽ có lỗi compile-time xảy ra:
    class A {
        public int data = 40;

        public void msg() {
            System.out.println("hello Java");
        }

    }

      class Simple {
        public static void main(String[] args) {
            A obj = new A();
            System.out.println(obj.data);//Compile Time Error
            obj.msg(); //Compile time Error
        }
    }


