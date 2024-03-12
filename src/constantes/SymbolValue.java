package constantes;

public enum SymbolValue {

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    int val;

    SymbolValue(int val) {
        this.val = val;
    }

    public int getVal(){
        return val;
    }
}
