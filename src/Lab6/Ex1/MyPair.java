package Lab6.Ex1;

public class MyPair<T,U> {
    public final T Fst;
    public final U Snd;

    public MyPair(T fst, U snd) {
        Fst = fst;
        Snd = snd;
    }

    @Override
    public String toString() {
        return "(" +
                "Fst = " + Fst +
                ", Snd = " + Snd +
                ')';
    }
//    public MyPair Swap(){
//        U fst = this.getSnd();
//        T snd = this.getFst();
//        return new MyPair(fst,snd);
//    }

    public T getFst() {
        return Fst;
    }

    public U getSnd() {
        return Snd;
    }

}
