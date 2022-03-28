package lesson_07;

public class House {
    /*
    * Car: Color, Wheel, tier| run, brake, revert.
    *
    *
    *
    *Attributes(class field) | method => describe/Change attribute values
    *
    *
    * */


    private String color;
    private int mainDoorNum;

    public House() {

    }
   /// Getter setter để thực hiện mô tả để nhập giá trị
    public House(String color, int mainDoorNum) {
        this.color = color;
        this.mainDoorNum = mainDoorNum;
    }

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMainDoorNum() {
        return mainDoorNum;
    }

    public void setMainDoorNum(int mainDoorNum) {
        this.mainDoorNum = mainDoorNum;
    }

    //Service method
    @Override
    public String toString() {
        return printCont();
    }

    //Support method
    private String printCont(){
        return "House{" +
                "color='" + this.color + '\'' +
                ", mainDoorNum=" + this.mainDoorNum +
                '}';
    }
}
