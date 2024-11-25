public interface Treeable {//an interface only has method headers
    public Object getValue();
    public Treeable getLeft();
    public Treeable getRight();
    public void setValue(Comparable value);
    public void setLeft(Treeable left);
    public void setRight(Treeable right);//a treeable object must have theese methods
}