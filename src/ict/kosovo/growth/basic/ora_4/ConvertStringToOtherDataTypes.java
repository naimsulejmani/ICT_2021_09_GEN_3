package ict.kosovo.growth.basic.ora_4;

public class ConvertStringToOtherDataTypes {
    public static void main(String[] args) {
        String nr = "25";
        //duhet me perdore Wrapper klasat adekuate varesisht prej tipit te te dhenave
        byte b = Byte.parseByte(nr);
        int i = Integer.parseInt(nr);
        long l = Long.parseLong(nr);
        double d = Double.parseDouble(nr);
        float f = Float.parseFloat(nr);
        boolean bool = Boolean.parseBoolean("true");
    }
}
