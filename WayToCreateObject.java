class WayToCreateObject implements Cloneable{

    String name = "hello";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        WayToCreateObject obj = new WayToCreateObject();
            try {
                WayToCreateObject obj2 =  (WayToCreateObject)obj.clone();
                System.out.println(obj.name);
                System.out.println(obj2.name);
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);

        }
    }
}