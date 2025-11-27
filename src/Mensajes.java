//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class mensajes{

    void main(String[] args) {

        int num = 20;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= num; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("Función " + i + ": " + metodo(i));
        }
    }

    public String metodo(int i) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        switch(i) {
            case 1:
                return metodo01();// code block
                break;
            case 2:
                return metodo02();// code block
                break;
            case 3:
                return metodo03();// code block
                break;
            default:
                return "Fuera de rango";
                // code block
        }
    }
    public String metodo01 () {
        return "uno";
    }
    public String metodo02 () {
        return "dos";
    }
    public String metodo03 () {
        return "tres";
    }
}